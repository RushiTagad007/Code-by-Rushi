import java.util.*;

public class StringSort2
{
    
	public static void main(String[] args) {
	    
	   String S="Rushikesh";
               //String p=S.toLowerCase();		         
               String p= S.toUpperCase();
		char[] ch= p.toCharArray();
		
		char temp;
		
		    for(int i=0;i<ch.length;i++){
		        
		        for(int j=i+1;j<ch.length;j++){
		            
		            if(ch[i]>ch[j]){
		                temp=ch[i];
		                
		                ch[i]=ch[j];
		                ch[j]=temp;
		                
		                
		            }
		        }
		        
		    }
		
		for(char C : ch){
		    System.out.print("  "+C);
		    
		}
}
}