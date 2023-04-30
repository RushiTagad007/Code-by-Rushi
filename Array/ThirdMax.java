public class ThirdMax{
public static void main(String[] args){

int[] arr= {1,2,3,8,7,9,6,5,4};

int max=arr[0];
int Secondmax=0;
int Thirdmaximum=0;

for(int i=0;i<arr.length;i++){
  if(arr.length <=2){
   System.out.println("Array contains less than 3 elements, so we cant find out thirdmax number");
break;
}

if(arr[i]>max){
Secondmax=max;
max=arr[i];
}
if(arr[i]<max && arr[i] >Secondmax)
Secondmax=arr[i];


}


for(int j=0;j<arr.length;j++){
  if(arr[j] == max)
   arr[j]=0;
}


int newmax=arr[0];

for(int a=0;a<arr.length;a++){
if(arr[a]>newmax){
Thirdmaximum=newmax;
newmax=arr[a];
}
if(arr[a]<newmax && arr[a]>Thirdmaximum)
Thirdmaximum =arr[a];
}

System.out.println(" ThirdMax :  "+Thirdmaximum);

}
}