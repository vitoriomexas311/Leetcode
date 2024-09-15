
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] storageArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            storageArray[s.charAt(i) - 'a']++;
            storageArray[t.charAt(i) - 'a']--;
        }
        for (int n : storageArray) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
