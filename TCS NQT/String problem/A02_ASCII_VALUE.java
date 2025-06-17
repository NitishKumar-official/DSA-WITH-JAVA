import java.util.Scanner;

public class A02_ASCII_VALUE {
    public static void main(String[] args) {
        char c;
        System.out.println("enter a character");
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        int ascii = (int)c;
        System.out.println(ascii);

    }
}
