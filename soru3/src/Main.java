import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n = sc.nextInt();
          if (n>0){
              for (int j = n; j>=0; j--) {
              System.out.print((" ").repeat(Math.abs(n-(n-j))));
              System.out.println("* ".repeat(n-j));}
              for (int i = 1; i <= n; i++) {
                  System.out.print((" ").repeat(Math.abs(n-(n-i))));
                  System.out.println("* ".repeat(n-i));}

          }
    }
}