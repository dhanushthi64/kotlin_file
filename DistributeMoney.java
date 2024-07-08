public class DistributeMoney {
    static int distMoney(int money,int children){
        if(money<8){
            return -1;
        }
        int i=0;
        int count = 0;
        while (i<children) {
            if(money>=8){
                money-=8;
                count++;
            }
            if(money==4 && money<=1){
            }
        }
    }
    public static void main(String[] args) {
        int money = 7;
        int children = 3;
        System.out.println(distMoney(money,children));
    }
}
