package dsaPrograms;
public class  DSA8_Buy_Sell_Stocks {
    public static int buySellStocks(int prices[]){
        int n = prices.length;
        int bp = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<n; i++){
            if(prices[i] < bp){
                bp = prices[i];
            }
            else{
                int mp = prices[i] - bp;

                max_profit = Math.max(max_profit, mp);
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4, 7};
        System.out.println("The Maximum Profit: " + buySellStocks(prices));
    }
}
