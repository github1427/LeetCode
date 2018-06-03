package ArrayCode;

/**
 * 买卖股票的最佳时期I
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class Array_121 {
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println(maxProfit2(prices));
    }
    public static int maxProfit(int [] prices){
        int maxProfit=0;
        int len=prices.length;
        for (int i =0;i<len-1;i++){
            for (int j=i+1;j<len;j++){
                int profit=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }

    //大神解答
    public static int maxProfit2(int[] prices){
        int buy=0,maxProfit=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]-prices[buy]<0){
                buy=i;
            }else {
                int profit=prices[i]-prices[buy];
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}