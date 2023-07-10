class Solution {
    public int longestConsecutive(int[] nums) {
        
        if( nums.length == 0) {
            return 0;
        }
        
        // Arrays.sort(nums);
        
        Integer[] newNums = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        
        List<Integer> list = Arrays.asList(newNums);
        
        Set<Integer> set = new TreeSet<Integer>(list);
        
        int[] num = set.stream().mapToInt(i -> i).toArray();
        
        
        int maxLen = 1;
        
        int currLen = 1;
        
        for ( int i = 1 ; i < num.length ; i++ ){
            if ( num[i] == (num[i-1]+1) ){
                currLen++;
                if ( maxLen < currLen ){
                    maxLen = currLen;
                }
            }else{
                currLen = 1;
            }
        }
        
        return maxLen;
    }
}