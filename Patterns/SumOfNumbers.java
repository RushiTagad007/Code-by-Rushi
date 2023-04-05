import java.util.Scanner;

public class SumOfNumbers{

public static void main(String[] args){

Scanner sc =new Scanner(System.in);

System.out.println("How many nubers you want to add");
int size = sc.nextInt();

int[] arr = new int[size];

int sum=0;


for(int i=0; i<arr.length;i++){
      
 System.out.println("Enter number "+(i+1));

int n = sc.nextInt();
 
arr[i] = n;

sum= sum + arr[i];
}

System.out.println("Sum = "+sum);



}


}