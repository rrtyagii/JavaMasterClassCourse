package stillTrying;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LInkedListChallengeMain {
	
	
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
	
	private static ArrayList<Album> albums=new ArrayList<Album>(); 
	
	
 public static void main(String[] args) {
	Album album = new Album("Zero To Infinity", "Raftaar"); 
	album.addSong("Baby Marvake Manegi", 188L);
	album.addSong("Saare Karo DAB", 234L);
	album.addSong("Gaddi", 236L);
	album.addSong("Gall Goriye", 207L);
	album.addSong("Jean Teri", 200L);
	albums.add(album); 
	
	
   album=new Album("Andhadhun"); 
   album.addSong("Aap Se Milkar ", 210L); 
   album.addSong("Naina Da Kya Kasoor ", 236L); 
   album.addSong("Wo ladki ", 252L); 
   album.addSong("Laila Laila ", 203L); 
   album.addSong("Oh Bhai re", 205L); 
   albums.add(album); 
   
   LinkedList<Song>playList=new LinkedList<Song>(); 
   albums.get(0).addToPlaylist("Gaddi", playList); 
   albums.get(0).addToPlaylist("Baby Marvake Manegi", playList); 
  // albums.get(0).addToPlaylist("Om Shanti Om", playList); 
   albums.get(0).addToPlaylist(2, playList); 
   
   albums.get(1).addToPlaylist(2, playList); 
   albums.get(1).addToPlaylist(1, playList); 
   albums.get(1).addToPlaylist(3, playList); 
   albums.get(1).addToPlaylist(15, playList);
   
   play(playList); 
   printMenu(); 
      
 }
 
   public static void play(LinkedList<Song>playList) {
	   Scanner scanner=new Scanner(System.in);
	   
	   boolean quit=false; 
	   boolean forward=true; 
	   
	   ListIterator<Song> i= playList.listIterator(); 
	   if(playList.size()==0) {
		   System.out.println("no songs in the playlist");
		   return; 
	   }
	   else {
		   System.out.println("Now playing "+i.next().toString());
	   }
	   
	   while(!quit) {
		   int action=scanner.nextInt(); 
		   switch(action) {
		   case 0:
			   System.out.println("Playlist complete");
			   quit=true; 
			   break; 
		   case 1:
			   if(!forward) {
				   if(i.hasNext()) {
					   i.next(); 
				   }
				   forward=true; 
				}
			   if(i.hasNext()) {
				   System.out.println("Now playing "+i.next().toString());
			   }
			   else {
				   System.out.println("we have reached the end of the playlist");
				   forward=false; 
			   }
			   break; 
		   case 2: 
			   if(forward) {
				   if(i.hasPrevious()) {
					   i.previous() ; 
				   }
				   forward=false; 
			   }
			   if(i.hasPrevious()) {
				   System.out.println("Now playing "+i.previous().toString());
				}
			   else {
				   System.out.println("you have reached the start");
				   forward=true; 
			   }
			   break; 
		   case 3: 
			   if(forward) {
				   if(i.hasPrevious() ){
					  System.out.println("Now Playing "+i.previous().toString());  
				     forward=false;
				   }
				   else {
					   System.out.println("we are at the start of list");
				   }
				}
			   else {
				   if(i.hasNext()) {
					   System.out.println("Now Playing "+i.next().toString());
					   forward=true; 
				   }
				   else {
					   System.out.println("We are at the start of the playlist");
				   }
			   }
			   
			   break; 
		   case 4:
			   printList(playList); 
			   break; 
		   case 5:
			   printMenu();
			   break; 
			   
			   
			   
		   }
	   }
   }
   
	   private static void printMenu() {
	   	System.out.println("Available option: \nPRESS");
	   	System.out.println("0 -> to quit\n " +
	   	                   "1 -> go to next song\n "+
	   			           "2 -> go to previous song\n "+
	   	                   "3 -> reply the song\n "+
	   			           "4 -> print the playlist\n " +
	   	                   "5 -> print the available options");
	   }
	   private static void printList(LinkedList<Song> playlist) {
		    	   Iterator<Song>i=playlist.iterator();
		    	   while(i.hasNext()) {
		    		System.out.println(i.next());   
		    	   }
		    	   System.out.println("================");
		}
   
}
	