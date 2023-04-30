public class Countchar{
public static void main(String[] args){

String S="aaabbbcccaaadddeee";

char[] ch = S.toCharArray();

String S1="";
int temp=1;
for(int i=1;i<ch.length;i+=temp){
         int count=1;
         System.out.println(" i :"+i);           //0   3
       int j=i;
 
    while (ch[j-1]==ch[j]){
      count++;
      if(j==ch.length-1)
      break;
       j++;
}

      System.out.println(" count :"+count);
     temp=count;
System.out.println(" temp :"+temp);
   S1=S1+ch[i]+""+count;                        //1
System.out.println(""+S1);

}

System.out.println(""+S1);

}
}