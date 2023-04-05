import java.util.*;

public class CountVowelandConsonant{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);

System.out.println("Enter the Statement");

String s= sc.nextLine();

char[] ch = s.toCharArray();
int VowelCount=0;
int ConsonantCount=0;



for(int x=0; x<ch.length ;x++){
  if( ch[x]=='a' ||  ch[x]=='e' || ch[x]=='i' ||  ch[x]=='o' ||  ch[x]=='u' )
      VowelCount++;
  else{
     if(ch[x]==' '){
      }
     else
      ConsonantCount++;   
}
}
  System.out.println("Vowel Count : "+VowelCount +"  Consonant Count : "+ConsonantCount);



}


}