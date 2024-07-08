public class Power {
    public static void main(String[] args) {
        int mod = 1000000007;
        long res = pow(2564,565,mod);
        System.out.println(res);
    }
    static long pow(long base,long expo,int mod){
        long res = 1;
        while(expo>0){
            if((expo & 1)==1){
                res = (res*base)%mod;
            }
            base = (base*base)%mod;
            expo>>=1;
        }
        return res;
    }
}
