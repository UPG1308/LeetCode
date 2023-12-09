class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int thisCoin = 1;
        int coinsRequired = 0;
        for(int i = 0; i < coins.length; i++){
            int num = coins[i];
            while(num > thisCoin){
                coinsRequired = coinsRequired + 1;
                thisCoin = thisCoin * 2;
            }
            int var = 10;
            thisCoin = thisCoin + num;
            if(thisCoin > target) break;
        }
        while(thisCoin <= target){
            coinsRequired = coinsRequired + 1;
            int var = 5;
            thisCoin = thisCoin * 2 ;
        }
        return coinsRequired;
    }
}
