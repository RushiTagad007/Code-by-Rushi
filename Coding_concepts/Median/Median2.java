import java.util.*;
public class Median2 {
public static void main(String[] args){

int[] arr={1,3,4,5,6,7};

Arrays.sort(arr);
int n= arr.length;
double median = (arr[n/2]+arr[(n/2)-1])/2.0;

System.out.println(median);

}
}