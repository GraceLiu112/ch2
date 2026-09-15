public class Time {
	public static void main(String[] args){
	
		int hour;
		hour = 12;	
		int minute;
		minute = 50;
		int second;
		second = 19;
		int midnight;
		midnight = 12 * 60 * 60 + 50 * 60 + 19;
		System.out.println("There is " + midnight + " seconds since midnight.");
		int remain;
		remain = 24 * 60 * 60 - midnight;	
		System.out.println("There is " + remain + " seconds remaining in the day.");
		double number;
		int percentage;
		number = midnight / 86400;
		percentage = number * 100
		System.out.println(percentage + "% of the day has passed.");
	}

}
