class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int count = 0;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i - 1) || Math.abs(word.charAt(i) - word.charAt(i - 1)) == 1){
                count++;
                i++;
                continue;
            }
 
        }
        return count;
    }
}
