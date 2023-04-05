public class Smallestnumber{

public static void main(String[] args){

int[] arr= {3,5,7,2,8,3,1,34,23,54};

int min=arr[0];

for(int i=0; i<arr.length;i++){

if(arr[i]<min)
min=arr[i];

}

System.out.println(min);


}

}