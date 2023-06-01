package valid_anagram;

import interfaces.Solution;

public class LeetSolution implements Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int[] charCounter = new int[26];

        for (int i = 0; i < a.length; i++) {
            charCounter[(int) a[i] - 97]++;
            charCounter[(int) b[i] - 97]--;
        }

        for (int c : charCounter) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void Solve() {
        System.out.println(isAnagram("anag", "nagaram"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
