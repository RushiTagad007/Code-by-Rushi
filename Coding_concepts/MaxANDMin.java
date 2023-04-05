public class MaxANDMin{

public static void main(String[] args){


int[] arr ={4,2,6,1,6,8,96,44,66,333,76,87};

int max=arr[0];
int min= arr[0];

for(int i=0;i<arr.length;i++){

if(arr[i]>max){
  max=arr[i];
}
if(arr[i]<min){
min= arr[i];
}
}


System.out.println("Min : "+min+" , Max  : "+max);

}
}