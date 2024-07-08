public class PowerofTwo {
    static boolean two(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
    public static void main(String[] args) {
        System.out.println(two(15));
    }
}
