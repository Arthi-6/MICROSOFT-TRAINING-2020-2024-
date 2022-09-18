class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxCount = 0;
        int len = s.length();
        Set<Character> hashset = new HashSet<>();
        while(i<len && j<len){
            if(!hashset.contains(s.charAt(j))){
                hashset.add(s.charAt(j));
                j++;
                maxCount = Math.max(maxCount,j-i);
            }
            else{
                hashset.remove(s.charAt(i));
                i++;
            }
        }
        return maxCount;
    }
}
