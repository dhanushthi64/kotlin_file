public class Grumpy {
    static void maxSatisfied(int[] customers,int[] grumpy,int minutes){
        int satisfied = 0;
        int n = grumpy.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int sum = 0;
        int max = 0;
        for(int i=0;i<minutes;i++){
            sum+=customers[i];
        }
        max = sum;
        for(int i=minutes;i<n;i++){
            sum = sum-customers[i-minutes]+customers[i];
            max = Math.max(sum,max);
        }
    }
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        maxSatisfied(customers,grumpy,minutes);
    }
}
