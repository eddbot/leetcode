package group_anagrams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import interfaces.Solution;

public class LeetSolution implements Solution {

    public HashMap<String, List<String>> results = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {

        for(String s : strs) {

            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = String.valueOf(chars);

            if(results.containsKey(sortedWord)) {
                results.get(sortedWord).add(s);
            } else {
                results.put(sortedWord, new ArrayList<String>(Arrays.asList(s)));
            }
        }

        return new ArrayList<>(results.values());
        
    }


    @Override
    public void Solve() {
        long startTime = System.nanoTime();
        System.out.println(groupAnagrams(new String[]{
            "eat",
            "tea",
            "tan",
            "ate",
            "nat",
            "bat"
        }));
        long endTime = System.nanoTime();

        long totalTime = endTime - startTime;
        System.out.println("Your program ran for: " + totalTime + "ns");
    }
}