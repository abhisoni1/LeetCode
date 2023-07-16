class MinStack {

    LinkedList<CurrentMin> stack;
    
    int min = 0;
    
    public class CurrentMin{
        int min;
        int val;
        public CurrentMin(int value, int mini){
            min = mini;
            val = value;
        }
    }
    
    
    public MinStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int val) {
        
        int newMin = 0;
        if( stack.size() == 0){
            newMin = val;
        }else{
            newMin = val < stack.getFirst().min ? val : stack.getFirst().min;
        }
        stack.addFirst(new CurrentMin(val, newMin));
    }
    
    public void pop() {
        stack.removeFirst();
    }
    
    public int top() {
        return stack.peekFirst().val;
    }
    
    public int getMin() {
        return stack.getFirst().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */