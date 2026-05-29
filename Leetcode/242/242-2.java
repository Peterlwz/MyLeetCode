class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();

        for (int i = 0; i < sArr.length(); i++) {
            boolean found = false;

            for (int j = 0; j < tArr.length(); j++) {
                if (sArr[i] == tArr[j]) {
                    found = true;
                    tArr[j] = '#';
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }
}