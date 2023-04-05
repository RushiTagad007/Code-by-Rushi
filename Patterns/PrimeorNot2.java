import java.util.*;

public class PrimeorNot2{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int n = sc.nextInt();

for(int i=2; i<n/2; i++){
   if(n%i == 0){
     System.out.println("Not Prime number");
break;}
 else{
System.out.println("Prime number");
break;}
}

}


}