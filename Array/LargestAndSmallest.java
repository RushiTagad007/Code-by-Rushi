public class LargestAndSmallest{
public static void main(String[] args){

int[] arr={4,2,1,5,3};

int min=arr[0];
int max=arr[0];

for(int i=0; i<arr.length;i++){

if(arr[i]>max){
  max=arr[i];

}
if(arr[i]<min){
min=arr[i];
}
}


System.out.println("Largest number   : "+max);
System.out.println("Smallest number   : "+min);

}
}