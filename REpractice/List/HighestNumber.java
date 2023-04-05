public class HighestNumber{
public static void main(String[] args){

int[] arr= {3,7,22,44,22,66,88,99,45,67,87};

int max=arr[0];

for(int i=0;i<arr.length;i++){
  
if(arr[i]>max){
max=arr[i];
}

}
System.out.println(max);
 
}
}