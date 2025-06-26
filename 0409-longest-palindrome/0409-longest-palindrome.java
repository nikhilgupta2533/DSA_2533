class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        int odd = 0;

        // Loop over the map entries
        for (char key : map.keySet()) {
            int freq = map.get(key);
            if (freq % 2 == 0) {
                ans += freq;
            } else {
                ans += freq - 1;
                odd++;
            }
        }

        // If any character has odd frequency, one odd char can be in the center
        if (odd > 0) {
            ans += 1;
        }

        return ans;
    }
}

 