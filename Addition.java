package Inheritance;
class Substract{

     int x;
     int y;

     void sub(int x,int y){

         int z=x-y;
         System.out.println("Substract: "+z);
     }


}
public class Addition extends Substract {
    void add(int x,int y){

        int z=x+y;
        System.out.println("Addition: "+z);
    }



    public static void main(String[] args) {

        Addition obj=new Addition();
        obj.sub(9546,3245);
        obj.add(9546,3245);

    }
}
