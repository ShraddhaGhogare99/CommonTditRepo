package Inheritance;
class Birds{

    void Parrot(){
        System.out.println("This is Parrot Method");

    }

    void Eagle(){
        System.out.println("This is Eagle Method");
    }
}
public class Animals extends Birds {

    public static void main(String[] args) {
        Animals ref=new Animals();
        ref.Parrot();
        ref.Eagle();

    }
}
