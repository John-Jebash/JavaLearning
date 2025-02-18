import java.util.Scanner;

class PrintMultiples {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=x;i<=1000;i=i+x) {
            System.out.println(i);
        }
        
    }
}