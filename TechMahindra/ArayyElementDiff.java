public class ArayyElementDiff{
public static void main(String[] args){

int[] arr={10,11,7,12,14};

 int prv=arr[0];
int sum=0;
for(int i=1;i<arr.length;i++){
     if(prv<arr[i]){
    int diff =arr[i]-prv;
   prv=arr[i];
   sum=sum+diff;
}
if(arr[i]<prv){
    int diff =prv-arr[i];
   prv=arr[i];
   sum=sum+diff;
}

}

System.out.println(sum);

}

}