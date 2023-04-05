import java.util.*;

public class PrimeorNot{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int n = sc.nextInt();

if( n% 6 ==5 || n%6==1)
System.out.println("prime number");
else
System.out.println("Not a prime num");
}


}