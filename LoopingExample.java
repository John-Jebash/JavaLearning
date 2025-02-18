import java.util.Scanner;

class LoopingExample {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        for(int i=0; i<y; i++) {
            System.out.println(x);
        }
        
    }
}