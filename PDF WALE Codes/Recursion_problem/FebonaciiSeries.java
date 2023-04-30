public class FebonaciiSeries{
public static void main(String[] args){

int[] arr=new int[10];

int a=0;
int b=1;
 arr[0]=a;
 arr[1]=b;


Febonaci(a,b,arr);

for(int i=0;i<arr.length;i++){
System.out.print("   "+arr[i]);
}
 
}

static int temp=2;
public static int[] Febonaci(int a,int b,int[] arr){
  
if(temp ==arr.length)
 return arr;


 int c=a+b;
 a=b;
 b=c;
arr[temp++]=c;

return Febonaci(a,b,arr);

} 
}