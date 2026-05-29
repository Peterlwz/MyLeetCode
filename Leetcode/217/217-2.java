class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < k; i++) {
            x = nums[i];
            if (set.contains(x)) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}