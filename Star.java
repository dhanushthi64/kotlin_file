public class Star {
    public static void main(String[] args) {
        int n = 7;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" $ ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" $ ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            for(int j=i;j>1;j--){
                System.out.print(" $ ");
            }
            for(int j=i;j>2;j--){
                System.out.print(" $ ");
            }
            for(int j=i;j<=n+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
