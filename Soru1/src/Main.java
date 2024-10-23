import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = sc.nextInt();
            if (n>0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(" ".repeat(n - i));
                System.out.println("*".repeat(i));}}
            else {System.out.println("Invalid input.");}

        }
    }
