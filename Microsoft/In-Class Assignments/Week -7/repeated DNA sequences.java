class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), repeated = new HashSet();
        for (int i = 0; i< s.length()-9; i++) {
        String res = s.substring(i, i + 10);
        if (!seen.add(res))
            repeated.add(res);
    }
    return new ArrayList(repeated);
    }
}
