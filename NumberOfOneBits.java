public class NumberOfOneBits {
    static void hamming(int n){
        int count = 0;
        while(n>0){
            int rem = n%2;
            if(rem==1){
                count++;
            }
            n /= 2;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 11;
        hamming(n);
    }
}
