public class Que122ndapproch{
public static void main(String[] args){

String S="apple";

char[]  ch=S.toCharArray();

String S1="";

for(int j=0;j<ch.length;j++){

for(char i='a';i<='z';i++){
   
  int asci1= i;
  int asci=ch[j];
   asci=asci+j;

if(asci== asci1)
 S1=S1+""+i;
  
 
}

}

System.out.println(""+S1);

}

}