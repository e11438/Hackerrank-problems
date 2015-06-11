import java.util.Scanner;


public class Zombies2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double rate = 2;
		Scanner in =new Scanner(System.in);
		String line =in.nextLine();
		String[] parts = line.split(" ");
		
		double sunFlowerCost=Double.parseDouble(parts[0]);
		double addingRate=Double.parseDouble(parts[1]);
		double plantCost=Double.parseDouble(parts[2]);
		
		
		System.out.println(sunFlowerCost+addingRate+plantCost);
	
		
	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	public static double calcTime(double sunFlowerCost,double rate,double plantCost,double addRate,double prevTime){
		
		double normalTime=plantCost/rate;
		double adTime = sunFlowerCost/rate+plantCost/(rate+addRate);
		
		System.out.println("normalTime="+normalTime);
		System.out.println("adTime=" +adTime+" - "+plantCost/(rate+addRate));
		if(normalTime<adTime)
			return prevTime+normalTime;
		else
			return prevTime+(calcTime(sunFlowerCost,rate+addRate,plantCost,addRate,adTime));
		
	}

}
