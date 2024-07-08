public class MinimumCostChip {
    static int minCost(int[] position){
        int even = 0;
        int odd = 0;
        for(int pos:position){
            if(pos%2==0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCost(position));
    }
}
