public class SUbString{
public static void main(String[] args){

String S="welcometojava";
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

String large="";

for(int j=0;j<Sub.length;j++){

  String S2= Sub[j];
   char p= S2.charAt(0);
   int asci = p;

  // int max=asci;
    large=S2;

   for(int x=j+1;x<Sub.length;x++){

    String S3= Sub[x];
   char q= S3.charAt(0);
   int asci1 = q;
    if(asci1>asci){
      large =S3;
}



      
}

}


System.out.println(large);
  
}

}