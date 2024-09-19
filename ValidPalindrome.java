public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            char x = Character.toLowerCase(s.charAt(i));
            for (int j = s.length() - 1; j > 0; j--) {
                char y = Character.toLowerCase(s.charAt(j));
                if (x != y) {
                    return false;
                }
            }
        }
        return true;
    }
}
