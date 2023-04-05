import java.util.*;
public class FebonacciSeries3{
public static void main(String[] args){


int a=0;
int b=1;

int c;
int[] arr=new int[12];
arr[0]=a;
arr[1]=b;

for(int i=1;i<=10 ;i++){
  

c=a+b;
a=b;
b=c;

arr[i+1]=c;
}


for(int j=arr.length-1;j>=0;j--){
  
System.out.print(" "+arr[j]);

}





}
}