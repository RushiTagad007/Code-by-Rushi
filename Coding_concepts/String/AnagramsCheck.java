import java.util.Arrays;
import java.util.*;

public class AnagramsCheck{

public static void main(String[] args){
  
String str1="silent";
String str2="listen";

System.out.println(areAnagrams(str1,str2));

}

public static boolean areAnagrams(String str1,String str2){
    
if(str1.length() != str2.length() )
   return false;

char[] str1Array =str1.toCharArray();
char[] str2Array = str2.toCharArray();

Arrays.sort(str1Array);
Arrays.sort(str2Array);

return Arrays.equals(str1Array,str2Array);


}
}