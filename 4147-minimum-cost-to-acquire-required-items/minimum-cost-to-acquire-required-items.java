class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, long need1, long need2) {
        if (cost1 + cost2 < costBoth) {
            costBoth = cost1 + cost2;
        }
        if (need1 > need2) {
            long temp = need1;
            need1 = need2;
            need2 = temp;
            int tempCost = cost2;
            cost2 = cost1;
            cost1 = tempCost;
        }
        if (cost2 > costBoth) {
            cost2 = costBoth;
        }

        return costBoth * need1 + cost2 * (need2 - need1);
    }
}