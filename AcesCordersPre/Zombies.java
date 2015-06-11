import java.util.Scanner;


public class Zombies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double rate = 2;
		Scanner in =new Scanner(System.in);
		
		//Scanner in =new Scanner(System.in);
		String line =in.nextLine();
		String[] parts = line.split(" ");
		
		double sunFlowerCost=Double.parseDouble(parts[0]);
		double addingRate=Double.parseDouble(parts[1]);
		double plantCost=Double.parseDouble(parts[2]);
		/*double sunFlowerCost = Double.parseDouble(in.nextLine());
		double addingRate = Double.parseDouble(in.nextLine());
		double plantCost = Double.parseDouble(in.nextLine());*/
		
		
		double normalTime=plantCost/rate;
		double advancedTime = sunFlowerCost/rate+plantCost/(rate+addingRate);
		rate+=addingRate;
		while(advancedTime<normalTime){
			
			normalTime=advancedTime;
			advancedTime-=plantCost/(rate);
			rate+=addingRate;
			advancedTime+=(sunFlowerCost/(rate-addingRate)+(plantCost/rate));
		}
		double finalAns=round(normalTime, 7);
		
		String ans=Double.toString(finalAns);
		if(ans.contains(".")){
			String[] parts2=ans.split("\\.");
			int dif=0;
			
			//System.out.println(parts2.length);
			if(parts2.length>0&&parts2[1].length()<7){
				//System.out.println(parts2[1]);
				dif=7-parts2[1].length();
			
				for(int i=0;i<dif;i++){
					ans+="0";
				}
			}
		}
		
		System.out.println(ans);
		
		//System.out.println(calcTime(sunFlowerCost,2,plantCost,addingRate,0));
		
		
		
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
