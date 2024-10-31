
public class A11_Tiling_problem{

    public static int Tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fnm1 = Tiling(n-1);
        int fnm2 = Tiling(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {

        int n=4;
        System.out.println(Tiling(n));
        
    }
}