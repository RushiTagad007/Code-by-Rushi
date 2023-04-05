import java.util.*;
import java.lang.*;

public class ArrayReverse{

public static void main(String[] args){

Integer[] arr = {10,30,50,20,40};

List<Integer> L1= Arrays.asList(arr);

List<Integer> L= new ArrayList();

List<String> L2= new ArrayList();

L= Arrays.asList(arr);

System.out.println(L);

Collections.reverse(Arrays.asList(arr));

System.out.println(Arrays.asList(arr));

System.out.println("-------------------------------------");

L2.add(0,"One");
L2.add(1,"Two");

System.out.println(L2);


}

}