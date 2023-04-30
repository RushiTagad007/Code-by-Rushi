class MyThread extends Thread{

public void run(){
 
for(int i=0;i<5;i++){
     System.out.println("IN Run of MyThread");
}
}

}


public class TestMultiThreading{

public static void main(String[] args){

  MyThread T = new MyThread();

 T.start();
 for(int i=0;i<5;i++){
System.out.println("In Main Thread");
}
}

}