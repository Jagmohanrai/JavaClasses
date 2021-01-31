package test;

public class Test {

    public static void main(String[] args) {
        Dog dg= new Dog();
    }
}

class Animal {
    
  //call it to get the voice in all sub classes
  void voice(){

  }
}


class Dog extends Animal  {
   @Override
   void voice (){
       System.out.println("bark");
   } 
}

class Cat extends Animal{
    void voice (){
     
   } 
}
class Cow extends Animal{
    void voice (){
        
    }
}

