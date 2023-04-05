import java.util.*;

public class ReverseNumber{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");

int n = sc.nextInt();
int sum=0;
int r;

while(n!=0){

 r= n%10;
 sum = (sum*10) +r;
 n=n/10;
 

}
System.out.println("Reverse number "+sum);





}


}