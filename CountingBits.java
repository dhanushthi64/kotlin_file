public class CountingBits {
    static int countOne(int num){
        int count = 0;
        while (num>0) {
            int rem = num%2;
            if(rem==1){
                count++;
            }
            num/=2;
        }
        return count;
    }
    static int[] countBits(int n){
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = countOne(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] res = countBits(n);
        for(int i=0;i<res.length;i++){
            System.out.print(" "+res[i]);
        }
        

    }
     
}
