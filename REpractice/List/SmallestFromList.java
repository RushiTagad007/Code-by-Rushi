import java.util.*;

public class SmallestFromList{

public static void main(String[] args){

Integer[] arr ={5,23,6,3,6,8,4,7,4};

List<Integer> L = new LinkedList();

L= Arrays.asList(arr);

Integer min=L.get(0);

for(int i=0;i<L.size();i++){
 
if(L.get(i)<min)
min= L.get(i);



} 

System.out.println(min);

}

}