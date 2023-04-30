public class SUbString2{
public static void main(String[] args){

String S="welcomewojava";
int n=3;

String[] Sub = new String[S.length()-n+1];

for(int i=0;i<S.length()-2;i++){
   String S1="";
    char a=S.charAt(i);
    char b = S.charAt(i+1);
    char c= S.charAt(i+2);
    S1=""+a+""+b+""+c;
   Sub[i]=S1;

}

String max=Sub[0];
String min=Sub[0];
int temp=0;
for(int j=0;j<Sub.length;j++){

    int asci1 = max.charAt(temp);
    int asci2 = Sub[j].charAt(temp);

   
  if(asci2>asci1){
   max=Sub[j];
}
  if(asci2<asci1){
   min=Sub[j];
}




}
System.out.println(max);
System.out.println(min);
  
}

}