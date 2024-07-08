public class ReverseString {
    static int method(){
        return 10;
    }
    public static void main(String[] args) {
        new Child();
        method();
    }
}
class Parent{
    Parent(){
        System.out.println("From Parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("From Child");
        meth();
    }

    int meth(){
        return 10;
    }
}
