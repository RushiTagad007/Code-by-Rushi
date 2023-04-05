import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class HigestFromList{

public static void main(String[] args){

Integer[] arr={3,57,555,7,333,666,8,6};


List<Integer> L= new ArrayList();

L= Arrays.asList(arr);

Integer max=L.get(0);

for(int i=0;i<L.size();i++){
   if(L.get(i)>max)
    max=L.get(i);
}
System.out.println(max);

}

}