class Solution {
    public boolean isPalindrome(String s) {
        
        
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        
        if( s.length() == 0){
            return true;
        }
        
        int start = 0;
        
        int end = s.length() -1;
        
        while( start < end ){
            
            if ( s.charAt(start) != s.charAt(end) ){
                // System.out.println("" + s.charAt(start) + s.charAt(end));
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}