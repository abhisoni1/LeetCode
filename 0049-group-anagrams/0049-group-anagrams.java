class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> listOfListOfString = new ArrayList<>();
        
        Map<String, ArrayList<String> > map = new HashMap<>();
        
         for( int i = 0 ; i < strs.length ; i++ ){
            char[] temp = strs[i].toCharArray();
            Arrays.sort( temp );
            
            String key = new String(temp);
             
            ArrayList<String> ll = map.getOrDefault( key,
                                     new ArrayList<String>() );
            ll.add(strs[i]);
            map.put( key, ll );
           
        }
        
        
        
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            listOfListOfString.add(entry.getValue());
        }
        
        return listOfListOfString;
        
        
    }
}