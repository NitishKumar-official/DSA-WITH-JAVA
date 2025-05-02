
import java.util.*;

public class Rana{

    public static int Print_spiral(int arr[][]){
        int sum =0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         if(i==j){
        //             sum= sum+arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum = sum+ arr[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i][i];

            if(i!=arr.length-1-i){
                sum = sum + arr[i][arr.length-1-i];  
            }
        }
        return sum;
    }

   

    public static void main(String[] args){
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(Print_spiral(arr));
    }

}