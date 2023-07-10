package Inheritance;

class Maharashtra {

    void Pune()
    {
        System.out.println("Pune Tithe Ky Une");

    }

    void Mumbai()
    {
        System.out.println("Dream City");
    }
}

public class India extends Maharashtra{

    public static void main(String[] args) {
        India ref=new India();
        ref.Pune();
        ref.Mumbai();

    }

}
