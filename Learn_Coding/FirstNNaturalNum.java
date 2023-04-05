import java.util.Scanner;

public class FirstNNaturalNum{
public static void main(String []args){

Scanner sc= new Scanner(System.in);

System.out.println("Until which number you want to print natural numbers");
int n= sc.nextInt();

for(int i=1 ; i<=n ;i++){
  System.out.print(" "+i);
}



}

}