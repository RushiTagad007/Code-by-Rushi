public class Star12{
public static void main(String[] args){
  for(int i=1;i<=5;i++){

     for(int j=1;j<i;j++){
             System.out.print(" ");
}
  for(int x=i;x<=i;x++){
   
      System.out.print("*");
}

     for(int j=(5*2)-1;j>i*2;j--){
     
             System.out.print(" ");
}
  for(int x=i;x<=i;x++){
    if(x==5)
     break;
      else
      System.out.print("*");
}
System.out.println();

}
}

}