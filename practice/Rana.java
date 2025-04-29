
import java.util.*;

public class Rana{
    public static int Stock(int []prices ){
        int n = prices.length;
        int max_profit =0;
        int Buy_price = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(Buy_price<prices[i]){
                max_profit = Math.max(max_profit, prices[i]-Buy_price);
            }
            else{
                Buy_price = prices[i];
            }
        }
        return max_profit;
    }

   

    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(Stock(prices));
    }

}