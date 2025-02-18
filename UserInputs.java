import java.util.Scanner;

class UserInputs {
    public static void main(String[] args) {
        System.out.print("Input:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String value = scan.next();
        char c = scan.next().charAt(0);
        System.out.println(number+"\n"+value+"\n"+c);
    }
}