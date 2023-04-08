public class Selectionsort{
public static void main(String[] args){

int[] arr ={64, 25, 12, 22, 11};
 int count=0;
for(int i=0; i<arr.length-1;i++){
      
   System.out.println("Round : "+(i+1));


       int min=arr[i];
        int x=(i);
    for(int j=i+1 ;j<arr.length;j++){
       
     count++;
  System.out.println("Comparision : "+count);
       if(arr[j]<min){
         min=arr[j];
         x=j;
         }
}     
System.out.println("Swapping  : "+arr[x]+" from index "+x+" " +" And  "+arr[i]+" from index "+i);
      arr[x] =arr[i];
      arr[i]=min;
      

}

for(int z=0;z<arr.length;z++){
    System.out.println("  "+arr[z]);
}

}
}