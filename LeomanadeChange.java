public class LeomanadeChange {
    static boolean change(int[] bills){
        if(bills[0]>5){
            return false;
        }
        int five = 0;
        int ten = 0;
        for(int bill:bills){
        System.out.println(bill);
        System.out.println("Five: "+five);
        System.out.println("Ten: "+ten);
            if(bill==5){
                five++;
            }
            else if(bill==10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }
            else if(bill==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else{
                    return false;
                }
                if(five>=3){
                    five-=3;
                }
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,5,5,10,5,20,10,5,5};
        System.out.println(change(bills));
    }
}
