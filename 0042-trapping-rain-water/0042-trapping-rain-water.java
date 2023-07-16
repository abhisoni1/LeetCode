class Solution {
    public int trap(int[] height) {
        
        int lMax = 0;
        int rMax = 0;
        
        int waterTrap = 0;
        
        int start = 0;
        int end = height.length - 1;
        
        while(start < end){
            
            // int temp = lMax < rMax ? lMax - height[start] : rMax - height[end];
            
            int temp = 0;
            
            if( lMax <= rMax ){
                temp = lMax - height[start];
            }else{
                temp = rMax - height[end];
            }
            
            if(temp > 0){
                waterTrap += temp;
            }
            
            if ( lMax < height[start]){
                lMax = height[start];
            }
            
            if( rMax < height[end]){
                rMax = height[end];
            }
            
            if( lMax <= rMax ){
                start++;
            }else{
                end--;
            }
            
        }
        
        return waterTrap;
    }
}