import java.util.ArrayList;
import java.util.Scanner;


public class SuperHero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> powers = new ArrayList<Integer>();
		ArrayList<Integer> bullets = new ArrayList<Integer>();
		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		//ArrayList<ArrayList<Enemy>> game = new ArrayList<ArrayList<Enemy>>();
		
		 Scanner in = new Scanner(System.in);
	        int t;
	        int sum;
	        int numL,numE;
	        int data;
	        t = in.nextInt();
	        
	        for (int i=0;i<t;i++) {
	            numL = in.nextInt();
	            numE = in.nextInt();
	            
	            for(int j=0;j<numL;j++){
	            	for(int k = 0;k<numE;k++){
	            		data = in.nextInt();
	            		powers.add(data);
	            	}
	            }
	            for(int j=0;j<numL;j++){
	            	for(int k = 0;k<numE;k++){
	            		data = in.nextInt();
	            		bullets.add(data);
	            	}
	            }
	            for(int j=0;j<numL*numE;j++){
	            	Enemy tmp =new Enemy(i,j/(numE),powers.get(j),bullets.get(j));
	            	enemies.add(tmp);
	            }
                
                powers.clear();
	            bullets.clear();
	            System.out.println(countBullet2(enemies));
	            enemies.clear();
	          
	        }        
	        
	       /* for(int i=0;i<enemies.size();i++){ 	
	        	
	        	System.out.println(enemies.get(i));
	        }
	        
	        int count=0;
	        for(int i=0;i<t;i++){
	        	while(enemies.get(count).testCase==i){
	        		
	        		
	        		
	        	}
	        }*/
	        
	        
	}
	public static int indexOfBest(ArrayList<Enemy> arrL,int l,int b){
		
		int minPower = Integer.MAX_VALUE;
		int minPowerIndex=-1;
		for(int i=0;i<arrL.size();i++){
			if(arrL.get(i).level==l &&arrL.get(i).bullets>=b && arrL.get(i).power<minPower ){
				minPower=arrL.get(i).power;
				minPowerIndex=i;
			}
			if(arrL.get(i).level>l)
				break;
		}
		return minPowerIndex;
		
	}
	
	public static int indexOfMin(ArrayList<Enemy> arrL,int l){
		int minPower = Integer.MAX_VALUE;
		int minPowerIndex=-1;
		for(int i=0;i<arrL.size();i++){
			if(arrL.get(i).level==l && arrL.get(i).power<minPower ){
				minPower=arrL.get(i).power;
				minPowerIndex=i;
			}
			if(arrL.get(i).level>l)
				break;
		}
		return minPowerIndex;
	}
	
	public static int countBullet(ArrayList<Enemy> arrL){
		int len = arrL.size();
		int numOfLs=arrL.get(len-1).level;
		
		int firstDieIndex = indexOfMin(arrL,0);
		int extraBullets = arrL.get(firstDieIndex).bullets;
		int iniBullets= (arrL.get(firstDieIndex).power)*-1;
		
		for(int i=1;i<=numOfLs;i++){			
			firstDieIndex=indexOfMin(arrL,i);
			
			if(extraBullets<arrL.get(firstDieIndex).power){
				iniBullets-=(arrL.get(firstDieIndex).power-extraBullets);
				extraBullets=arrL.get(firstDieIndex).bullets;
			}
			else{
				extraBullets=arrL.get(firstDieIndex).bullets;
			}
		}
		
		return iniBullets*-1;
	}
	public static int countBullet2(ArrayList<Enemy> arrL){
		int len = arrL.size();
		int numOfLs=arrL.get(len-1).level;	
		int extraBullets = 0;
		int iniBullets= 0;//(arrL.get(firstDieIndex).power)*-1;
		int firstDieL2Index=0;
		for(int i=1;i<=numOfLs;i++){
			firstDieL2Index = indexOfMin(arrL,i);
			int firstDieIndex = indexOfBest(arrL,i-1,arrL.get(firstDieL2Index).bullets);
			
			if(firstDieIndex==-1){
				firstDieIndex = indexOfMin(arrL,i-1);
			}
			if(extraBullets<arrL.get(firstDieIndex).power){
				iniBullets-=(arrL.get(firstDieIndex).power-extraBullets);
				
			}
			extraBullets = arrL.get(firstDieIndex).bullets;
		}
		if(arrL.get(firstDieL2Index).power>extraBullets)
			iniBullets-=(arrL.get(firstDieL2Index).power-extraBullets);
		return (iniBullets*-1);
	}
	
}
class Enemy{
	int testCase;
	int level;
	int power;
	int bullets;
	
	public Enemy(int t,int l,int p,int b){
		this.testCase = t;
		this.level = l;
		this.power = p;
		this.bullets = b;
	}
	
	public String toString(){
		return testCase+" "+level+" "+power+" - "+bullets;
	}
}
