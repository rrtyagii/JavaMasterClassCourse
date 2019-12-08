package stillTrying;

import java.util.*;

public class Album {
   private String albumName; 
   private String artist;
   private ArrayList<Song> song; 
   
   
   public Album(String albumName) {
      albumName(albumName); 
      song=new ArrayList<Song>();
   
 }
   public Album(String albumName, String artist) {
	   albumName(albumName); 
	   artistName(artist); 
	   song=new ArrayList<Song>();
   }
    
   public boolean addSong(String title, long duration) {
	   if(findSong(title)==null) {
		   song.add(new Song(title, duration)); 
	   return true; 
   }
	   return false; 
   }
   
   public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
	   int index=trackNumber-1; 
	   if( (index>=0)&& (index<=this.song.size()) ) {
		   playlist.add(this.song.get(index));
		   return true; 
	   }
	   System.out.println("This album does not have the track "+trackNumber);
	   return false; 
   }
   
   public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
	   Song checkedSong=findSong(title); 
	   if(checkedSong!=null) {
		   playlist.add(checkedSong); 
		   return true; 
		   
	   }
	   System.out.println("the song "+checkedSong+" is not in the album");
	   return false; 
   }
   

		   private Song findSong(String title) {
			   for(int i=0; i<this.song.size(); i++) {
				   Song song=this.song.get(i); 
				   if(song.getSongName().equals(title)) {
					   return song; 
				   }
			   }
			   return null; 
		   }
       
        
	        private String albumName(String name) {
	        	if(name.isBlank()) {
	        		return "Invalid"; 
	        	}
	        	else {
	        		return this.albumName=name;
	        	}
	        }
	        private String artistName(String name) {
	        	if(name.isBlank()) {
	        		return "Invalid"; 
	        	}
	        	else {
	        		return this.artist=name;
	        	}
	        	
	        }
        
        
}