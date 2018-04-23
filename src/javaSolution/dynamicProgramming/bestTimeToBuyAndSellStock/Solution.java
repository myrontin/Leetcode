package javaSolution.dynamicProgramming.bestTimeToBuyAndSellStock;

public class Solution {
	public int maxProfit(int[] prices) {
		int msf = 0;
		int me = 0;
		for (int i = 1; i < prices.length; i++) {
			me += prices[i] - prices[i - 1];
			me = Math.max(0, me);
			msf = Math.max(me, msf);
		}
		return msf;
	}
}
