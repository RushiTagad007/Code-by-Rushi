public class Overriding{
public static void main(String[] args){

Dog D = new Dog();

D.Makesound();

}

}

class Animal{

  double  Makesound(){     //  can not be private ,static and final
System.out.println("In animal");
return 1;
}

}

class Dog extends Animal{

@Override
public final double Makesound(){  //can not be private ,static      // final is alloded
super.Makesound();
System.out.println("Dog bark");
return 1;
}
}