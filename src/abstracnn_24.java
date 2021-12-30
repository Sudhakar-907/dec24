//abstract class Phone {
//    abstract void on();
//}
//class SmartPhone extends Phone{
//    void on(){
//        System.out.println("turn on...");
//    }
abstract  class Parent2 {
    public Parent2() {
        System.out.println(" i am constructor");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract public void greet();

    abstract public void greet2();

}
class child2 extends Parent2 {
    public void greet() {
        System.out.println("good morning");
    }
    public void greet2() {
        System.out.println("good afternoon");
    }
}
abstract class child3 extends Parent2 {
    public void th() {
        System.out.println("I AM GOOD");
    }
}
 class child4 extends child3{

     @Override
     public void greet() {
         System.out.println("hey child 4 gmmm");
     }

     @Override
     public void greet2() {
         System.out.println("hey child 4 GOOD NIGHT");
     }
     public void wake(){
         System.out.println("wake up");
     }

 }

public class abstracnn_24 {

public static void main(String[] args) {
//        Phone obj = new SmartPhone();
//        obj.on();
   // Parent2 p = new Parent2();
//    child2 c2 = new child2();
//    c2.greet();
//    c2.greet2();
//

    child4 c4 = new child4();
    c4.wake();
    c4.th();
    c4.greet();
    c4.greet2();
    //child3 c3 = new child3();

    }
}
