public class TwoFurthest {
    static void maxDistance(int[] colors){
        int maxdistance = 0;
        for(int i=0;i<colors.length;i++){
            for(int j=i;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    int max = j-i;
                    maxdistance = Math.max(maxdistance, max);
                    
                }
            }
        }
        System.out.println(maxdistance);
    }
    public static void main(String[] args) {
        int[] colors = {1,8,3,8,3};
        maxDistance(colors);
    }
}
