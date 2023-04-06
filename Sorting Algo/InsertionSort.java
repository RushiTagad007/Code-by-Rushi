public class InsertionSort{
public static void main(String[] args){

int arr[]={12,11,13,5,6};

for(int i=1;i<arr.length ;i++){
System.out.println("**************************************************");
System.out.println("Round :  "+i);

System.out.println("**************************************************");
  int key= arr[i];
 int j = i-1;


while(j>=0 && arr[j]>key){

System.out.println("Comparing  :  "+arr[j] +" And "+key);

arr[j+1]=arr[j];
System.out.println("Swapping in while loop  :  "+arr[j] +" At  "+(j+1));
System.out.println("------------------------------------------------------");
 j=j-1;

}

System.out.println("==================================================");
System.out.println("Swapping out of while loop : KEY  "+key+"  At  "+(j+1));
arr[j+1] = key; 

}
System.out.println("==================================================");
for(int x :arr){
System.out.println(" "+x);
}

}
}