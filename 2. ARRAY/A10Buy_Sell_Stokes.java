

public class A10Buy_Sell_Stokes {

    public static int profit(int prices[]){
        int n = prices.length;
        int Max_profit = 0;
        int Buy_price = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(prices[i]>Buy_price){
                Max_profit = Math.max(Max_profit, prices[i] - Buy_price);
            }
            else{
                Buy_price = prices[i];
            }
        }
        return Max_profit;
    }
    public static void main(String arg[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
    
}
