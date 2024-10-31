import java.util.*;

public class InputJava {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR Name");
        String name = sc.nextLine();
        // String name = sc.next();  isse bas ek work hi lega  
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float num = sc.nextFloat();
        System.out.println(num);
    }
    
}
