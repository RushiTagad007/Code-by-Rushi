import java.util.Scanner;

public class ReverseString{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

  System.out.println("Enter word");

String s = sc.nextLine();

char[] ch = s.toCharArray();
String rvs = ""  ;

for(int i=ch.length-1; i>=0;i--){

  rvs = rvs + ch[i];
}

System.out.println(""+rvs);




}


}