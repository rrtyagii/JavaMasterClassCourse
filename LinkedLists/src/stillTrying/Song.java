package stillTrying;

public class Song {
  // LinkedList challenge. 
	private String songName;
	private String singer;  
	private String outputDuration; 
	
	public Song(String songName,long duration, String singer) {
		songName(songName); 
		this.outputDuration=getDuration(duration); 
		singer(singer); 
	}
	public Song(String songName,long duration) {
		songName(songName); 
		this.outputDuration=getDuration(duration); 
	 
	}
	 
	public String getSongDuration() {
		return this.outputDuration; 
	}
	public String getSongName() {
		return this.songName; 
	}
	public String getSingerName() {
		return this.singer; 
	}

	@Override
	public String toString() {
		return this.songName + " : " + this.outputDuration ; 
	}
	

	
	      private String singer(String singer) {
	    	  if(singer.isEmpty()) {
	    		  return "Invalid input";
	    	  }
	    	  else {
	    		return  this.singer=singer;
	    	  }
	      }
		  private String songName(String songName) {
			if(songName.isBlank()) {
				return "Invalid songName";
				
			}
			else {
				return this.songName=songName;
			}
		}
		  private String getDuration(long seconds) {
			if(seconds<0) {
				return "invalid value"; 
			}
			long minute=seconds/60; 
			long sec=seconds%60; 
			return durationString(minute, sec); 
		}
		
			private String durationString(long minutes, long seconds) {
			 if( (minutes<0) || (seconds<0) || (seconds>60)) {
				 return "invalid value"; 
			 }
			 long hours=minutes/60; 
			 long min=minutes%60;
			 
			 return hours+" hh "+min+" mm "+seconds+" ss"; 
			}
}
