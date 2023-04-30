public class RepetatingElement{
public static void main(String[] args){

int arr[] ={1,2,3,3,4,5,6,7,8};
int index=0;

System.out.println(findrepeted(arr,index));
 


}

public static int findrepeted(int[] arr,int index){

  if(index<arr.length-1){
      if((arr[index+1]-arr[index]) ==1){
      index++;
    return findrepeted(arr ,index);
   }
    else if((arr[index+1]-arr[index])==0)
{
        return arr[index];
}
 }
return 0;
   
}


}