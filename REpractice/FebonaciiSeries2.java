public class FebonaciiSeries2{
public static void main(String[] args){

int a=5;
int b=6;

System.out.print(" "+a + "  "+b);
int c;

for(int i=0; i<=10 ;i++){
c=a+b;
a=b;
b=c;

System.out.print("  "+c);
}

}
}