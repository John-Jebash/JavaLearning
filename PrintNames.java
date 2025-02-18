import java.util.Scanner;

class PrintNames {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int n = scan.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println(firstName+lastName);
        }
        
    }
}