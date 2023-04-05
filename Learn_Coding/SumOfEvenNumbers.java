import java.util.Scanner;

public class SumOfEvenNumbers{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

System.out.println("Enter the number untill you want Sum Even numbers");

int n = sc.nextInt();

int sum=0;
{

for(int i=0; i<=n ;i++){
   if(i%2==0)
     sum=sum+i;
}
System.out.print(" "+sum);
}


}
}