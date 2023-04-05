public class Testequals{
     
  public static void main(String[] args){

   
Integer I1 = new Integer(10);

Integer I2 = new Integer(10);
System.out.println(I1 == I2);
System.out.println(I1.equals(I2));

System.out.println("----------------------------------------------------");
int a=10;

int b=10;

System.out.println(a==b);
//System.out.println(a.equals(b));

System.out.println("----------------------------------------------------");

String s1= "Rushi";
String s2="Rushi";

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));

System.out.println("----------------------------------------------------");

String D1 = new String("Dnyana");
String D2= new String("Dnyana");

System.out.println(D1 == D2);
System.out.println(D1.equals(D2));

}
}