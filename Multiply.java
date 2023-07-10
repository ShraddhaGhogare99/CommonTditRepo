package Inheritance;
class Division{

    int P;
    int Q;

    int Divide(int P,int Q){

        int R=P/Q;
        System.out.println("Divide: "+R);
        return R;

    }

    int Into(int P,int Q){

        int R=P*Q;
        System.out.println("Multiply: "+R);
        return R;

    }
}
public class Multiply extends Division {
    public static void main(String[] args) {
        Multiply ref=new Multiply();
        ref.Divide(9875,2145);
        ref.Into(365,457);

    }
}
