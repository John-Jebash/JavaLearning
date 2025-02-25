import java.util.Scanner; 

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int n = sc.nextInt();
        
        for(int i=n; i>=1; i--){
            for(int j=i; j<=n-1; j++) {
                System.out.print("  ");
            }
            for(int j=i*2-1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}