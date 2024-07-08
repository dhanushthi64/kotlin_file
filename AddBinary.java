// public class AddBinary {
//     static void Add(String a,String b){
//         StringBuilder sb = new StringBuilder();
//         int carry = 0;
//         int sum = 0;
//         int alen = a.length()-1;
//         int blen = b.length()-1;
//         while(alen>=0 || blen>=0 || carry==1){
//             sum = carry;
//             if(alen>=0) sum+=a.charAt(alen--)-'0';
//             if(blen>=0) sum+=b.charAt(blen--)-'0';
//             sb.append(sum%2);
//             carry = sum/2;
//         }
//         System.out.println(sb.reverse().toString());
//     }
//     public static void main(String[] args) {
//         String a = "11";
//         String b = "1";
//         Add(a,b);
//         Integer k = 10;
//         Integer l = 10;
//         System.out.println(k==l);
//         k = 20;
//         l = 20;
//         System.out.println(k==l);
//     }   
// }
public class AddBinary {
    static int a = 10;
    AddBinary(){
        System.out.println(a);
    }
    static{
        System.out.println("Hi ");
    }
    public static void main(String[] args) {
        AddBinary b = new AddBinary();
        System.out.println((10 - 2) + (2 * (10 - 2)));
    }
    
}