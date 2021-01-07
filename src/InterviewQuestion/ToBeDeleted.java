package InterviewQuestion;




public class ToBeDeleted  {

    public ToBeDeleted(){
        System.out.println("Default constructor");
    }
    public ToBeDeleted(String str){
        this();
        System.out.println("Constructor with String argument");
    }
    public ToBeDeleted(int num){
        this("hicham");

        System.out.println("Constructor with int argument");
    }


}
class A extends ToBeDeleted{

    public A(){
        super(7);
    }

    public static void main(String[] args) {


        A obg=new A();


    }
}

