class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List> anagrams = new HashMap<String, List>();
        
        for ( String s : strs ){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            
            if(!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList());
            
            anagrams.get(key).add(s);
        }
        return new ArrayList(anagrams.values());
    }
}