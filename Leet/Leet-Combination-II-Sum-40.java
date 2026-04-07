import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        recu(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void recu(int a, int[] ar, int t, List<Integer> s, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(s));
            return;
        }

        for (int i = a; i < ar.length; i++) {
            if (i > a && ar[i] == ar[i - 1]) continue;

            if (ar[i] > t) break;

            s.add(ar[i]);
            recu(i + 1, ar, t - ar[i], s, ans);
            s.remove(s.size() - 1);
        }
    }
}