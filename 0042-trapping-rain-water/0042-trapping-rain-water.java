class Solution {
    public int trap(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        
        int lMax = height[start];
        int rMax = height[end];
        
        int waterTrap = 0;
    
        
        while(start < end){
            
            int temp = 0;
            
            if( lMax <= rMax ){
                start++;
                
                lMax = lMax < height[start] ? height[start] : lMax;
                
                waterTrap += lMax - height[start];
            }else{
                end--;
                
                rMax = rMax < height[end] ? height[end] : rMax;
                
                waterTrap += rMax - height[end];
            }
            
//             if(temp > 0){
//                 waterTrap += temp;
//             }
            
//             if ( lMax < height[start]){
//                 lMax = height[start];
//             }
            
//             if( rMax < height[end]){
//                 rMax = height[end];
//             }
            
//             if( lMax <= rMax ){
//             }else{
//                 end--;
//             }
            
        }
        
        return waterTrap;
    }
}