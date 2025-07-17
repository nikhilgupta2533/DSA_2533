class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if character is only letter or digit
            if (!((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90) || (ch >= 48 && ch <= 57))) {
                return false;
            }

            // If letter
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                char lower = Character.toLowerCase(ch);

                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return vowels > 0 && consonants > 0;
    }
}
