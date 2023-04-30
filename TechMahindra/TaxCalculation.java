public class TaxCalculation{
public static void main(String[] args){

int[] arr= {100,200,300,400,500};
int totaltax=0;;

for(int i=0;i<arr.length;i++){

if(arr[i]>100){
int amt= arr[i]-100;
 int tax= amt*10/100;
  totaltax=totaltax+tax;

}

}

System.out.println(totaltax);
}
}