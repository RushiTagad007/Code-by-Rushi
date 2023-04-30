public class GCDandLCM{
public static void main(String[] args){

int a=12;int b=9;
int gcd=1;

for(int i=1;i<=a && i<=b ;i++){
   
if(a%i ==0 && b%i==0){
gcd=i;
} 

}

int LCM = (a*b)/gcd;

System.out.println("Numbers : a="+a +" , b :"+b);
System.out.println("GCD : "+gcd+" , LCM : "+LCM );

}

}