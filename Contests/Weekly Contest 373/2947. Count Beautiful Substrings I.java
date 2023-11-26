class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            int cons = 0;
            int vow = 0;
            for(int j = i; j < n; j++){
                char c = s.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')vow++;
                else cons++;
                if(vow == cons && (vow%k * cons%k)%k == 0)count++;
            }
        }
        return count;
    }
}
