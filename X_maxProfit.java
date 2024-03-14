public class X_maxProfit {
    public static int buySellStock(int prices[]){
        int bprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0; i<prices.length; i++){
            if(bprice<prices[i]){
                int profit=prices[i]-bprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                bprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        
        System.out.println(buySellStock(prices));

    }
}
