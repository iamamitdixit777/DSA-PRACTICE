public class BuySellStocks {
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int buyprice = prices[0];
        int profit = Integer.MIN_VALUE;
        int maxprofit= Integer.MIN_VALUE;
        
        for(int i  = 0;i<prices.length ;i++) {
            if(prices[i]>buyprice){
               profit =  prices[i]- buyprice; 
               maxprofit = Math.max(maxprofit, profit);
            }

            else{
                 buyprice = prices[i];
            }

        }
        System.out.println(maxprofit);
       
    }
}
