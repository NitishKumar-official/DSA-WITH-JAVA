

public class A02Diagonal_sum {

    public static int Diagonal_sum(int arr[][]){
        int sum=0;

        //brute force solution o(n^2)

        // for(int i=0; i<=arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         if(i==j){
        //             sum+= arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+= arr[i][j];
        //         }
        //     }
        // }


        for(int i=0; i<arr.length; i++){
            //pd
            sum+= arr[i][i];
            //sd
            if(i!=arr.length-1-i){
                sum+= arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Diagonal_sum(arr));
    }
    
}
