import java.util.*;

public class FindString{
public static void main(String[] args){

String S1= "Rushikesh";

String S2= "RD";

int temp1=-1;
int temp2=-1;

char[] arr1 = S1.toCharArray();
char[] arr2 = S2.toCharArray();

String found="";

for(int i=temp1+1 ;i<arr2.length;i++){

for(int j=temp2+1 ;j<arr1.length; j++){


 if(arr2[i]==arr1[j]){
  found= found + arr2[i];
temp1=i; // 0 
temp2=j; // 5 
 break;
}

}
}
if(found.equals(S2)){
System.out.println("Word found : "+found);   
}
else 

System.out.println("Word Not found"); 
   
}
}