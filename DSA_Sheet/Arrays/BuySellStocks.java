package DSA_Sheet.Arrays;

public class BuySellStocks {

        //Best Time to Buy and Sell Stock

        public static int maxProfit(int[] prices) { //TC => O(n)
            int buyPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
    
            for(int i=0; i<prices.length; i++){
                int sellPrice = i;
    
                if(buyPrice < prices[sellPrice]){
                    int profit = prices[sellPrice] - buyPrice;
                    maxProfit = Math.max(maxProfit, profit);
                }else{
                    buyPrice = prices[sellPrice];
                }
            }
            return maxProfit;
        }
        public static void main(String[] args) {
            int prices[] = {7 ,1 ,5 ,3 ,6 ,4};

            System.out.println(maxProfit(prices));
        }
}
