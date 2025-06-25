class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        int count1 = 0;
        int x = i, y = j;
        while (x <= y) {
            if (s.charAt(x) != s.charAt(y)) {
                count1++;
                x++;
                // uske baad check karte raho
                while (x <= y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        count1 = 2; // more than 1 mismatch
                        break;
                    }
                    x++;
                    y--;
                }
                break;
            } else {
                x++;
                y--;
            }
        }

        int count2 = 0;
        i = 0;
        j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                count2++;
                j--;
                while (i <= j) {
                    if (s.charAt(i) != s.charAt(j)) {
                        count2 = 2;
                        break;
                    }
                    i++;
                    j--;
                }
                break;
            } else {
                i++;
                j--;
            }
        }

        if (count1 <= 1 || count2 <= 1) {
            return true;
        }
        return false;
    }
}
