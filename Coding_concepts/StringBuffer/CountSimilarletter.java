import java.util.*;
import java.lang.*;

public class CountSimilarletter{
public static void main(String[] args){

StringBuffer sb = new StringBuffer("abcabc");

 for(int i=0;i<sb.length();i++){
    int count=1;
for(int j=i+1;i<sb.length() ;i++){
  
    if((sb.charAt(i))==(sb.charAt(j))){
        count++;
        sb.deleteCharAt(j);  }

}

System.out.println(sb.charAt(i)+"  :  "+count);
   

}

}
}