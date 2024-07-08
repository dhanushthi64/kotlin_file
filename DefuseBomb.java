public class DefuseBomb {
    static int[] decrypt(int[] code,int k){
        int n = code.length;
        int[] res = new int[n];
        if(k==0){
            return res;
        }
        int start = 1;
        int end = k;
        if(k<0){
            start = k;
            end = -1;
        }
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=start;j<=end;j++){
                sum += code[(i+j+n)%n];
            }
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;
        int[] res = decrypt(code,k);
        for(int i=0;i<res.length;i++){
            System.out.print(" "+res[i]);
        }
    }
}
