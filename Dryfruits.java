package Inheritance;
class fruits{

    int Apple(){

        System.out.println("This is fruits class apple method");
        return 0;
    }

    String Cheery(){

        System.out.println("This is fruits class cheery method");
        return "Cheery";
    }

}
public class Dryfruits extends fruits {

    void Almond(){

        System.out.println("This is Dryfruits class Almond method");
    }


    public static void main(String[] args) {
        Dryfruits fav=new Dryfruits();
        fav.Apple();
        fav.Cheery();
        fav.Almond();

    }
}
