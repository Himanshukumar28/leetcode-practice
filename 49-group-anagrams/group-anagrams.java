class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        List<List<String>> ls = new ArrayList<List<String>>();
        // ["eat","tea","tan","ate","nat","bat"]
        // m: {aet: ["ate","eat","tea"] , ant: ["nat","tan"] , abt: [bat]}
        //T : 0(n.l.log l)
        //s: 0(n.l)
        for(String str : strs){
            char[] ca = str.toCharArray();

            Arrays.sort(ca);

            String key = new String(ca);

            if(!map.containsKey(key)){
                map.put(key , new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        // m: {aet: ["ate","eat","tea"] , ant: ["nat","tan"] , abt: [bat]}
        for(Map.Entry<String, List<String>> e : map.entrySet()){
            ls.add(e.getValue());
        }
        // <["ate","eat","tea"] , ["nat","tan"] , ["bat"]>
        return ls;
    }
}