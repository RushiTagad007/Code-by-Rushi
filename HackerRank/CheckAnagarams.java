public class CheckAnagarams{

public static void main(String[] args){

String S1="Ttn";
String  S2="ntt";

char[] ch1=S1.toCharArray();
char[] ch2= S2.toCharArray();

//boolean flag=false;

   
for(int i =0;i<ch1.length;i++){

for(int j=0;j<ch2.length;j++){

if(ch1[i]==ch2[j]){
  ch2[j]='\u0000';
 //flag =true;
break;
}




}



}


boolean flag =true;
for(int i=0; i<ch2.length;i++){

if(ch2[i]!='\u0000'){
System.out.println("not anagram");
  flag=false;
}

}

if(flag)
System.out.println("Anagaram");


}

}
