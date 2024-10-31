public class A09_Power_of_x {

    // public static int calPower(int x, int n){


    //     if(n==1){
    //         return x;
    //     }

    //      return 2* calPower(x, n-1);
        
    // }

    // public static void main(String[] args) {
    //     int x=2;
    //     int n=10;
    //    System.out.println( calPower(x, n));
    // }


    // method 2   optimized approach



    public static int calPower(int x, int n){
        if(n==0)
        {
            return 1;
        }
        int half = calPower(x, n/2);
        int sqHalf = half * half;              //tc - o(nlogn)

        if(n%2!=0){
            return x*sqHalf;
        }

        return sqHalf;

    }

    public static void main(String[] args) {
        int x =2;
        int n=10;
        System.out.println(calPower(x, n));

    }
   
}
