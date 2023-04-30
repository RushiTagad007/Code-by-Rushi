public class Que12{
public static void main(String[] args){

String S="apple";

char[] ch= S.toCharArray();
int[] arr =new int[ch.length];


for(int i=0;i<ch.length;i++){
  
    char x=ch[i];
   int asci = x;
   asci=asci+i;
   arr[i]=asci;
   
   
}
String S1="";

for(int i=0;i<arr.length;i++){

for(char j='a';j<'z';j++){
   
     int asci2 = j;
   if(arr[i] == asci2){
    S1=S1+""+j;
}
}
}

System.out.println(" "+S1);
}
}