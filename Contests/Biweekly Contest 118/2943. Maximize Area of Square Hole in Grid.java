class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        if(hBars.length == 0 || vBars.length == 0) return 1;
        else if(hBars.length == 1 || vBars.length == 1) return 4;
        int hcons = 1, vcons = 1, maxH = 1, maxV = 1;
        
        for(int i = 1; i < hBars.length; i++){
            if(hBars[i] - hBars[i - 1] == 1){
                hcons++;
                maxH = Math.max(maxH, hcons);
            }
            else{
                hcons = 1;
            }
        }
        
        for(int i = 1; i < vBars.length; i++){
            if(vBars[i] - vBars[i - 1] == 1){
                vcons++;
                maxV = Math.max(maxV, vcons);
            }
            else{
                vcons = 1;
            }
        }
        int max = Math.min(maxH, maxV);
        return (max + 1)*(max + 1);
    }
}
