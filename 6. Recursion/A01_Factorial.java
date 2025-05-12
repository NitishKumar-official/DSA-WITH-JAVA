

public class A01_Factorial {

    public static int find_fact(int n){

            if(n==0 || n==1){
                return 1;
            }
            else{
                return n*find_fact(n-1);
            }

    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(find_fact(n));
    }


    
}
