package Inheritance;
class NewSub{
    float a;
    int b;

    void add(float a,int b){
        float c=a+b;
        System.out.println("Addition: "+c);

    }

    void sub(float a,int b){
        float c=a-b;
        System.out.println("Substract: "+c);

    }

}
public class Sub extends NewSub{

    public static void main(String[] args) {
        Sub ref=new Sub();
        ref.add(65.24f,12);
        ref.sub(98.45f,41);

    }


}





