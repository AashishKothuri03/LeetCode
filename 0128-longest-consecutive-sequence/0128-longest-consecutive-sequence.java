class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        if(n == 0) return 0;
        int longest = 1;
        for(int i : nums) set.add(i);
        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                int len = 0;
                while(set.contains(curr)){
                    len++; curr++;
                }
                longest = Math.max(len,longest);
            }
        }
        return longest;
    }
}