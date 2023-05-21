class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> sMap = new HashMap();
        
        Map<Character, Integer> tMap = new HashMap();
        
        int have = 0 ;
        int need = 0;
        
        
        for ( int i = 0 ; i < t.length(); i++ ){
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        need = tMap.size();
        
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        
        String minWindow = "";
        
        while ( end < s.length() ){
            
            char c = s.charAt(end);
            
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            
            
            if ( tMap.containsKey(c) ){
                
                if ( sMap.get(c).intValue() == tMap.get(c).intValue() ){
                    have++;
                }
                
            }
            
            while ( have == need && start <= end ) {
                if ( minLength > (end-start+1) ){
                    minLength = (end-start+1);
                    minWindow = s.substring(start, end + 1);
                }
                
                sMap.put( s.charAt(start), sMap.get(s.charAt(start))-1);

                if ( tMap.containsKey( s.charAt(start) ) && sMap.get(s.charAt(start)).intValue() < tMap.get( s.charAt(start) ).intValue() ){
                    have--;
                }
                
                start++;
                
            }
            
            end++;
            
        }
        
        
        
        return minWindow;
        
    }
}