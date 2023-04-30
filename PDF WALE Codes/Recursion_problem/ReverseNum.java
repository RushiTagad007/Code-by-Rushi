public class ReverseNum{
public static void main(String[] args){

int N=5678;
int rem=0;
int rev=0;
System.out.println(Reverse(N,rem,rev));

}

public static int Reverse(int N, int rem, int rev ){

if(N==0){
  return rev;
}
   rem=N%10;
   rev =rev*10+rem;
  N=N/10;
return Reverse(N,rem,rev);
  

}
}