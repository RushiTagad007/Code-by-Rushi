public class SecondLargestNumber{
public static void main(String[] args){

int[] arr={4,6,7,5,2,3,9,8,1,67,89,104};

int max=arr[0];   //4 6 7 9 
int SecondMax=0; // 0 4 6 7

for(int i=0;i<arr.length;i++){

if(arr[i]>max){

SecondMax=max;
max=arr[i];
}
else if(arr[i]>SecondMax && arr[i]<max){
  SecondMax=arr[i];
}

}

System.out.println("Second MAx number  : "+SecondMax);
System.out.println("MAx number  : "+max);

}

}