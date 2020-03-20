
public class sysElapsedTime {
	public static String sysElapsedTime(int time) {
		int days = (int) (time / 86400000);
		time = time - (days * 86400000);
		int hour = (int) (time / 3600000) ;
		time = time - (hour * 3600000);
		int min = (int) (time / 60000) ;
		time = time - (min * 60000);
		int sec = (int) (time / 1000) ;
		time = time - (sec * 1000);
		int mili = (int) time;
		
		return days +" days, " + hour + "hours, " + min + " minutes, " 
		+ sec+ " seconds, and "+ mili + "miliseconds.";	
	}
}
