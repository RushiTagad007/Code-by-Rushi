import java.util.*;

public class SortString
{
    
	public static void main(String[] args) {
	    
	   String S="rushikesh";
               S.toUpperCase();		

		char[] ch= S.toCharArray();
		
		     Arrays.sort(ch);
		
		for(char C : ch){
		    System.out.print("  "+C);
		    
		}
}
}