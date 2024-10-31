
public class A04_Print_number_from_1Ton{

    public static void PrintNumber(int n){
        if(n==0){
            return;
        }
        PrintNumber(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=10;
        PrintNumber(n);

    }
}