class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> sMap = new HashMap<>();
        
        Map<Character, Integer> tMap = new HashMap<>();
        
        if ( s.length() != t.length() ){
            return false;
        }
        
        for ( int i = 0 ; i < s.length() ; i++){
            sMap.put( s.charAt(i), sMap.getOrDefault( s.charAt(i), 0 ) + 1 );
        }
        
        for ( int i = 0 ; i < t.length() ; i++){
            tMap.put( t.charAt(i), tMap.getOrDefault( t.charAt(i), 0 ) + 1 );
        }
        
//         for ( int i = 0 ; i < t.length() ; i++ ){
            
//             Character c = t.charAt(i);
            
            // if ( !sMap.containsKey(c) || sMap.get(c) != tMap.get(c)  ){
            //     return false;
            // }
//         }
        
        for (Map.Entry<Character,Integer> entry : tMap.entrySet()) {
            if ( !sMap.containsKey(entry.getKey()) || sMap.get(entry.getKey()) - entry.getValue() != 0  ){
                return false;
            }
        }
            // System.out.println("Key = " + entry.getKey() +
            //                  ", Value = " + entry.getValue());
        
        return true;
        
        
    }
}