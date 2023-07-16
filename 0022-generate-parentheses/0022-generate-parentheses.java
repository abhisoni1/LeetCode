class Solution {
    
    Stack<String> stack = new Stack<>();
    
    List<String> strings = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        doBackTracking(0,0, n);
        
        return strings;
    }
    
    public void doBackTracking(int openN, int closedN, int n){
        
        if( openN == closedN && openN == n){
            strings.add(stack.stream().map(s -> s.toString()).collect(Collectors.joining("")));
        }
        
        if( openN < n){
            stack.push("(");
            doBackTracking(openN+1, closedN, n);
            stack.pop();
        }
        
        if( closedN < openN){
            stack.push(")");
            doBackTracking(openN, closedN+1, n);
            stack.pop();
        }
        
    }
}