public class Stack1{

public static void main(String[] args){

add(10);
add(20);
add(30);

show();


}

static int[] arr= new int[10];

public static void  add( int n){

for(int i=0 ;i<arr.length; i++ ){
if( arr[i] == 0){
   arr[i] = n;
   break;
}

}
}

public static void remove (){
 for(int  j=arr.length-1 ; j>=0 ;j--){
    
 if(arr[j]!= 0){
       arr[j]=0;
break;
}
}
}

public static void show(){

for(int z=0;z<arr.length ;z++){
   System.out.println(arr[z]);

}

}


}



