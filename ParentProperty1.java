package Inheritance;
class Parent{

    void first(){

        System.out.println("This is parent class first method");
    }

    void second(){

        System.out.println("This is parent class second method");
    }
}

class Child extends Parent{


}
public class ParentProperty1  {

    public static void main(String[] args ) {
        Child ref=new Child();
        ref.first();
        ref.second();


    }
}
