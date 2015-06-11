import java.util.Scanner;


public class CuttMarble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t;
        int num1;       
        int num2;
        int side;
        boolean ok;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
        	num1 = in.nextInt();
        	num2= in.nextInt();
        	Marble m =new Marble(num1,num2);
        	
        	if(num1%3==0||num2%3==0)
        		ok=true;
        	else{
        		ok=false;
        		/*if(num1%3>num2%3)
        			System.out.println("NO "+(num2%3)*num1);
        		else
        			System.out.println("NO "+(num1%3)*num2);*/
        		while(!m.isOk()){
        			if(m.left%3>m.right%3){
        				m.cutRight();            			
        			}
            		else if(m.left%3<m.right%3){
            			m.cutLeft();            	
            		}
        			
        		}
        	}
        	if(ok){
        		System.out.println("YES");
        	}
        	else{
        		System.out.println("NO "+m.left*m.right);
        	}
        	
        }
		
		
	}
	
}
class Marble{
	
	int left;
	int right;
	public  Marble(int l,int r){
		this.left = l;
		this.right = r;
	}
	public boolean isOk(){
		if(left<3&&right<3)
			return true;
		else
			return false;
	}
	public void cutLeft(){
		if(left>3)
			left=left%3;
		else
			right=right%3;
	}
	public void cutRight(){
		if(right>3)
			right=right%3;
		else
			left=left%3;
			
	}
	
}


