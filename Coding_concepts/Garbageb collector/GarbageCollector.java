public class GarbageCollector{
public static void main(String[] args){

String s1= new String("A");
String s2= new String("B");
String s3= new String("C");

s3=s1;
s1=s2;
s2=s3;

System.out.println(s1);
System.out.println(s2);

System.out.println(s3);
}
}