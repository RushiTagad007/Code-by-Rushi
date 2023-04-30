public class Sumofarray{
public static void main(String[] args){

int arr[]={1,2,3,4,5,5};
int i=0;
int sum=0;


System.out.println(Sum(arr,i,sum));
}


public static int Sum(int[] arr, int i, int sum){
 
if(i<arr.length){
sum=sum+arr[i];
i++;
return Sum(arr,i,sum);
}

return sum;




}

}