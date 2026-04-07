class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> temp = new ArrayList<>();
        recu(0,candidates,target,new ArrayList<>(),temp);
        return temp;
    }

    public void recu(int a,int [] ar,int t,List<Integer> s,List<List<Integer>>ans){
        if(a == ar.length){
            if(t == 0){
                ans.add(new ArrayList<>(s));
            }
            return;
        }

        if(ar[a] <= t){
            s.add(ar[a]);
            recu(a,ar,t-ar[a],s,ans);
            s.remove(s.size()-1);
        }

        recu(a+1,ar,t,s,ans);

    }
}