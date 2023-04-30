public class MissingElement{
public static void main(String[] args){

int arr[] ={1,2,3,4,5,6,7,9};
int index=0;

System.out.println(Missing(arr,index));
 


}

public static int Missing(int[] arr,int index){

  if(index<arr.length-1){
      if((arr[index+1]-arr[index]) ==((index+1)-(index))){
      index++;
    return Missing(arr ,index);
   }
    else{
        return arr[index]+1;
}
 }
return 0;
   
}


}
