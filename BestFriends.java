package Inheritance;
class Friends{

    String S;
    String A;

    String One(String S,String A){
        String D=S+A;
        System.out.println("BestFriends:"+D);
        return D;
    }

}
public class BestFriends extends Friends {

    public static void main(String[] args) {
        BestFriends ref=new BestFriends();
        ref.One("Shubham","Akash");

    }
}
