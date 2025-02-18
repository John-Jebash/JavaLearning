import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        System.out.print("Input:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum = num1 + num2 + num3;
        if(sum == 180) {
            System.out.print("triangle can be formed");
        }
        else {
            System.out.print("triangle cannot be formed"); 
        }
    }
}