package isCatPlaying;

public class PlayingCat {
	public static void main (String[] args) {
		 
		boolean result= isCatPlaying(false, 35) ;
		 System.out.println(result);
	}
     /*public static boolean isCatPlaying(boolean summer , int nameTemperature ) {
            if( (summer==true) && (nameTemperature>=25) && (nameTemperature<=45) )
            {
            	return summer; 
            }
            else if( (summer==false) && (nameTemperature>=25) && (nameTemperature<=35) ) {
            	return summer; 
            }
            return summer; 
     } */
	public static boolean isCatPlaying(boolean summer, int temperature){
        return summer ? (temperature >= 25 && temperature <= 45) : (temperature >= 25 && temperature <= 35);
    }

  }

