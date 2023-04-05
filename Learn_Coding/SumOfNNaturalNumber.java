import java.util.Scanner;

public class SumOfNNaturalNumber{
public static void main(String []args){

Scanner sc = new Scanner(System.in);
int prv=0;
System.out.println("Enter the number");
int n= sc.nextInt();
 for(int i=1; i<=n;i++){
    int result = prv+i;
    prv= result;
System.out.print(result+" = ");

}

}

}