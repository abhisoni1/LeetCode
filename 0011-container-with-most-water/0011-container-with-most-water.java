class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        
        int max = 0;
        
        while ( start < end ){
            int waterAmnt;
            if( height[start] < height[end] ){
                waterAmnt = height[start]*(end-start);
                start++;
            }else{
                waterAmnt = height[end]*(end-start);
                end--;
            }
            
            if( max < waterAmnt){
                max = waterAmnt;
            }
            
        }
        
        return max;
    }
}