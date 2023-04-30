import java.util.*;

public class EqualSumArrayModified{
public static void main(String[] args){

int[] arr= {5,5,5,2,3,1,2,3,4,5,5};


int Totalsum=0;

for(int i=0;i<arr.length;i++){
  
Totalsum=Totalsum+arr[i];
}

System.out.println("Given Array  And  Sum :"+Totalsum);
for(int b=0;b<arr.length ;b++){
System.out.print("  "+arr[b]);

}
System.out.println();


int Secondsum=0;
int x=0;

Arrays.sort(arr);

for(int j=0;j<arr.length;j++){
  if(  Secondsum == Totalsum/2){
    x=j;
   break;
}
else{
  Secondsum=Secondsum+arr[j];
  } 

}

if(Totalsum%2 ==0){

int[] arr1= new int[x];
int[] arr2= new int[arr.length-x];
int temp=0;

for(int a=0;a<arr.length;a++){
if(a<x){
arr1[a]=arr[a];
}
else{
arr2[temp]=arr[a];
temp++;
}

} 



System.out.println("1st part of  Array  and  Sum :"+(Totalsum/2));
for(int c=0; c<arr1.length;c++){
System.out.print("  "+arr1[c]);
}

System.out.println();

System.out.println("2nd part of   Array  and  sum :"+(Totalsum/2));
for(int d=0; d<arr2.length;d++){
System.out.print("  "+arr2[d]);
}

}
else{
System.out.println("Sum of an array is :"+Totalsum +" Hence we cant devide array");
}
}
}