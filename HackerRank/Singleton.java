import java.util.*;

public class Singleton{

//private static Singleton instance;

private int a;

private Singleton(){
  
this.a=10;

}

//public static Singleton getInstance(){

//if(instance == null)
 //instance = new Singleton();

 //return instance;
//}





public static void main(String[] args){

 Singleton S1 =new  Singleton();

   System.out.println(S1);

 Singleton S2 =new  Singleton();

   System.out.println(S2);

 Singleton S3 =new  Singleton();

   System.out.println(S3);

}

}
