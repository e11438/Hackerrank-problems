import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class PlainTextAttack {
	 
	 public static HashMap<String,String> setLetters(String s){
			String cmp = "the quick brown fox jumps over the lazy dog";
			HashMap<String,String> letters = new  HashMap<String,String>();
			if(cmp.length()==s.length()){
				for(int i=0;i<cmp.length();i++){
					//if(!(cmp.charAt(i)+"").equals(" ")){
						letters.put((s.charAt(i)+""), (cmp.charAt(i)+""));
					//}
				}
			}
			return letters;
		}
		public static int findRow(ArrayList<String> arr){
			int[] test = {3,5,5,3,5,4,3,4,3};
			for(int i=0;i<arr.size();i++){			
				String str = arr.get(i);
				int count=0;
				if(str!=null){
					for(String s:str.split(" ")){
						if(s.length()!=test[count]){
							break;
						}
						count++;
					}
					if(count==test.length){
						return i;
					}
				}
			}
			//System.out.println(arr.size());
			return -1;		
		}
		
		public static void main(String args[]){
			ArrayList<String> arr = new ArrayList<String>();
	        String[] strArr = new String[101]; 
			//ArrayList<String> arr = new ArrayList<String>();
			 Scanner in = new Scanner(System.in);
		        String t="";	 
		        for(int i=0;i<101;i++){
		        	if(in.hasNext()){
		        	t = in.nextLine();
	                strArr[i]=t.toLowerCase();
	                }
		        	//if(t.equals(""))
		        	//	break;
		        	//if(!t.equals(""))
		        		//arr.add(t);
		        }
		        //put array of sentences to Arraylist
	        arr = new ArrayList<String>(Arrays.asList(strArr));
		      
		        int num= findRow(arr);
		      
		        if(num==-1){
		        	System.out.println("No solution");
		        }
		        else{		       
			       HashMap<String,String> res = new HashMap<String,String>();
			       String scheck="";
			        if(num<arr.size())
		                 scheck= arr.get(num);
			        res= setLetters(scheck);
			        
			       
			        for(int i=0;i<arr.size();i++){			        	
			        	String str = arr.get(i);			        	
		                if(str!=null){
				        	for(int j=0;j<str.length();j++){			        		
				        		System.out.print(res.get(str.charAt(j)+""));			        		
				        	}
		                }
			        	System.out.println();	        	
			        }
		        }
		}

	}
