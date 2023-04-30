public class Primeusingrecursion{
public static void main(String[] args){
   
int n=11;

   if(isprime(n,2))
     System.out.println("Prime");
    else 
   System.out.println("NOT Prime");

}

public static boolean isprime(int n , int div){
  
      if(n <=2){
         return (n==2)?true:false;
            }
      if(n%div==0)
       return false;

       if(div * div >n)
       return true;

      
        return isprime(n,div+1);
}


}