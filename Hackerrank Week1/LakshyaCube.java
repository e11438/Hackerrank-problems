
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LakshyaCube {
	
	
	
	//static char[][] frontSide = new char[3][3];
			

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	//String input="YRBOGW R2";//(in.nextLine()).toUpperCase();
    	String input;
    	String input2;
    	input=(in.nextLine()).toUpperCase();
    	input2=(in.nextLine()).toUpperCase();
    	//String[] parts =input.split(" ");
    	
    	Cube cube=new Cube(input.substring(0, input.length()));
    	
    	//for(int i =1;i<parts.length;i++){
    		char moveType=input2.charAt(0);
    		int num =Integer.parseInt(input2.charAt(1)+"");
    		for(int j=0;j<num;j++){
    			cube.move(moveType);
    		}
    	//}
    	//cube.move('R');
    	//cube.move('R');
    	cube.showFront();	
    	
    	
    	
    
}}
class Cube{
	//char[][][] sides=new char[3][3][6];
	char[][] front=new char[3][3];
	char[][] back=new char[3][3];
	char[][] left=new char[3][3];
	char[][] right=new char[3][3];
	char[][] top=new char[3][3];
	char[][] bottom=new char[3][3];
	
	char[][][] sides={top,left,front,right,back,bottom};
		
	public Cube(String colors){
		//System.out.println(colors.length());
		if(colors.length()==sides.length){
			for(int i=0;i<sides.length;i++){
				char[][] tofill=sides[i];
				for(int j=0;j<tofill.length;j++){
					for(int k=0;k<tofill[j].length;k++)
						tofill[j][k]=colors.charAt(i);
				}
			}
		}	
		else{
			System.out.println("can't construct a object");
		}
	}
	
	public void showCcube(){
		for(int i=0;i<sides.length;i++){
			System.out.println("side "+i);
			char[][] tofill=sides[i];
			for(int j=0;j<tofill.length;j++){
				for(int k=0;k<tofill[j].length;k++)
					System.out.print(tofill[j][k]);
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public void rotate(char[][] side){
		char tmp=side[0][0];
		side[0][0]=side[2][0];
		side[2][0]=side[2][2];
		side[2][2]=side[0][2];
		side[0][2]=tmp;
		
		tmp=side[0][1];
		side[0][1]=side[1][0];
		side[1][0]=side[2][1];
		side[2][1]=side[1][2];
		side[1][2]=tmp;		
	}
	public void rotateOtherSide(char[][] side){
		char tmp=side[0][0];
		side[0][0]=side[0][2];
		side[0][2]=side[2][2];
		side[2][2]=side[2][0];
		side[2][0]=tmp;
		
		tmp=side[0][1];
		side[0][1]=side[1][2];
		side[1][2]=side[2][1];
		side[2][1]=side[1][0];
		side[1][0]=tmp;		
	}
	
	public void rotateLeftRight(char[][] from,char[][] to,int num){
		
			for(int i =0;i<from.length;i++){
				to[i][num] = from[i][num]; 
			}		
	}
	
	public void rotateUpDown(char[][] from,char[][] to,int num){
		
		for(int i =0;i<from[num].length;i++){
			to[num][i] = from[num][i]; 
		}		
	}
	
	public char[] getCol(char[][] side,int col){
		char[] res = new char[3];
		for(int i =0;i<side.length;i++){
			res[i]=side[i][col];
		}
		return res;
	}
	public char[] getRow(char[][] side,int row){
		char[] res = new char[3];
		for(int i =0;i<side[row].length;i++){
			res[i]=side[row][i];
		}
		return res;
	}
	public void setCol(char[][] side,char[] put,int col){
		for(int i =0;i<side.length;i++){
			side[i][col]=put[i];
		}
	}
	
	public void setRow(char[][] side,char[] put,int row){		
		for(int i =0;i<side[row].length;i++){
			side[row][i]=put[i];
		}		
	}
	
	public void move(char ch){
		if((ch+"").equals('R'+"")){	
			char[] tmp = getCol(sides[0],2);
			rotateLeftRight(sides[2],sides[0],2);
			rotateLeftRight(sides[5],sides[2],2);
			rotateLeftRight(sides[4],sides[5],2);
			setCol(sides[4],tmp,2);
			rotate(sides[3]);
			
		}
		if((ch+"").equals('L'+"")){	
			char[] tmp = getCol(sides[0],0);
			rotateLeftRight(sides[2],sides[0],0);
			rotateLeftRight(sides[5],sides[2],0);
			rotateLeftRight(sides[4],sides[5],0);
			setCol(sides[4],tmp,0);
			rotate(sides[1]);
			
		}
		if((ch+"").equals('U'+"")){	
			char[] tmp = getRow(sides[2],0);
			rotateUpDown(sides[3],sides[2],0);
			rotateUpDown(sides[4],sides[3],0);
			rotateUpDown(sides[1],sides[4],0);
			setRow(sides[1],tmp,0);
			rotate(sides[0]);
			
		}
		if((ch+"").equals('D'+"")){	
			char[] tmp = getRow(sides[2],2);
			rotateUpDown(sides[3],sides[2],2);
			rotateUpDown(sides[4],sides[3],2);
			rotateUpDown(sides[1],sides[4],2);
			setRow(sides[1],tmp,2);
			rotate(sides[5]);
			
		}
		if((ch+"").equals('F'+"")){
			char[] tmp=getCol(sides[1],2);
			setCol(sides[1],getRow(sides[5],0),2);
			setRow(sides[5],getCol(sides[3],0),0);
			setCol(sides[3],getRow(sides[0],2),0);
			setRow(sides[0],tmp,2);
			rotate(sides[2]);
			
		}
		if((ch+"").equals('B'+"")){
			char[] tmp=getCol(sides[1],0);
			setCol(sides[1],getRow(sides[0],0),0);
			setRow(sides[0],getCol(sides[3],2),0);
			setCol(sides[3],getRow(sides[5],2),2);
			setRow(sides[5],tmp,2);
			rotateOtherSide(sides[4]);
			
		}
	}
	public void showFront(){
		char[][] arr =sides[2];
		//try{
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				//if(i<sides.length&&j<sides[i].length)
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/*}
		catch(ArrayIndexOutOfBoundsException e){
			
		}*/
	}
}
