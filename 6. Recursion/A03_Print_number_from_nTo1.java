

public class A03_Print_number_from_nTo1 {

    public static void PrintNumber(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n+" ");
            PrintNumber(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        PrintNumber(n);
    }
    
}
