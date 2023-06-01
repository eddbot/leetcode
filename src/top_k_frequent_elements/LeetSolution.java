package top_k_frequent_elements;

import interfaces.Solution;

import java.util.*;

public class LeetSolution implements Solution {

    @Override
    public void Solve() {

    }

    public record Sortable(Integer key, Integer value) {}

    public int[] topKFrequent(int[]nums, int k) {

        ArrayList<Sortable> sortables = new ArrayList<>();
        HashMap<Integer, Integer> tally = new HashMap<>();

        Arrays.stream(nums).forEach(i -> {
            int num = tally.getOrDefault(i, 0);
            tally.put(i, num+1);
        });

        tally.forEach((kk, v) -> {
            sortables.add(new Sortable(kk,v));
        });

        sortables.sort((o1, o2) -> o2.value().compareTo(o1.value()));
        return sortables.stream().limit(k).mapToInt(Sortable::key).toArray();
    }

}
