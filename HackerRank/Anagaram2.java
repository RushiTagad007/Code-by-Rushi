import java.util.*;

public class Anagaram2{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);

String S1= sc.next();
String S2= sc.next();

char[] ch1=S1.toCharArray();
char[] ch2=S2.toCharArray();

boolean flag= false;

if(ch1.length==ch2.length){
for(int i=0;i<ch1.length;i++){

 for(int j=0;j<ch2.length;j++){

 if(ch1[i]==ch2[j]){
  ch2[j]='\u0000';
   flag =true;
   break;
}  

} 

if(flag){
flag=false;
}
else if(!flag){
System.out.println("Not anagram");
break;
}

}


}
else
{
System.out.println("Not anagram");
}
boolean flag2= true; 
for(int i=0; i<ch2.length;i++){

if(ch2[i]!='\u0000'){
System.out.println("not anagram");
flag2= false;
break;
}

}

if(flag2){
System.out.println("Angaram");
}

}
}