

public class A05_Sum_of_n_natrual_num {

    public static int  sumOfNNaturalNumbers(int n){

        int sum =0;
        if(n==0){
            return 0;
        }
        sum = n +sumOfNNaturalNumbers(n-1);
        return sum;
    }

    public static void main(String[] args) {
        int n =10;
        System.out.println(sumOfNNaturalNumbers(n));
    }
    
}
