class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int Price : prices) {
            if (Price < min1) {
                min2 = min1;
                min1 = Price;
            } else if (Price < min2) {
                min2 = Price;
            }
        }
        int total = min1 + min2;
        if (total <= money) {
            return money - total;
        } else {
            return money;
        }
    }

}