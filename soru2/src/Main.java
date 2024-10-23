import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz.");
        int n = sc.nextInt();
        if (n>0){
            for (int i = 0; i <= n; i++) {
                System.out.print((" ").repeat(Math.abs(n-(n-i))));
                System.out.println("* ".repeat(n-i));
            }
        }else {System.out.println("Please wirte a positive integer.");}
    }
}