public class SecondMinimumNum{
public static void main(String[] args){

int[] arr={5,4,2,7,0,8,9,1,3};

  int min=arr[0];     //  5 4 2 0     
int SecondMinimum=0;  //  0 5 4  2   
for(int i=0;i<arr.length;i++){
   if(arr.length <=1){
 System.out.println("only one element is prest so we cant find second largest element");
}
   if(arr[i]<min){
    SecondMinimum =min;
    min=arr[i];
}
else
if(arr[i]>min && arr[i]<SecondMinimum)
  SecondMinimum =arr[i];
}

if(arr.length >1)
System.out.println(" Second Minimum  :  "+SecondMinimum);

}
}