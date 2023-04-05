public class QueueImpl{
public static void main(String[] args){

add(10);
add(20);
add(30);
add(40);
add(50);

show();
System.out.println("=========================================================");

remove();
remove();
remove();

show();


}


static int max=100;
static int[] arr= new int[max]; 
static int Top=-1;
static int bottom=0;

public static void add(int n){
if(bottom>max){
System.out.println("Queue is full");
}
else{
arr[++Top]=n;
}
}

public static int remove(){
if(Top<0){
System.out.println("Queue is empty");
return 0;
}
else{
int z= arr[bottom];
bottom++;
return z;
}
}

public static void show(){
if(Top>=0){
  for(int a=bottom;a<=Top;a++){
System.out.println(arr[a]);
}
}
}

}