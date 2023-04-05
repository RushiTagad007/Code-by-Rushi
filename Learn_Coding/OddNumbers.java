import java.util.Scanner;

public class OddNumbers{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

System.out.println("Enter the number untill you want Odd numbers");

int n = sc.nextInt();

for(int i=0; i<=n ;i++){
 if(i%2==1)
    System.out.print(" "+i);


}

}
}