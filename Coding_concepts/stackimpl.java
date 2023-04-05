public class stackimpl{
public static void main(String[] args){

add(10);
add(9);
add(6);
add(10);
add(20);
add(30);

show();

System.out.println("--------------------------------------------");
Remove();
Remove();
Remove();

show();

}

static int max=1000;
static int[] arr= new int[max];

static int top=-1;

public static void add(int n){
if( top>max-1){
System.out.println("Stack is full");

}
else{
  arr[++top] =n;
}  
}


public static int Remove(){
if( top<0){
System.out.println("Stack is empty");
  return 0;
}
else{
  int x= arr[top--];
return x;
}  
}

public static void show(){

for(int i=0; i<=top;i++){
  System.out.println(arr[i]);
}
}
}