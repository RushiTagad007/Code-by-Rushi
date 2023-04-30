public class Factorial{
public static void main(String[] args){

int N=5;

System.out.println(factorial(N));
}

static int  fact;
public static int factorial(int N){

   if(N==0){
  return 1;
      }
   return N*(factorial(N-1));
    
  


}

}