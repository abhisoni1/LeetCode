class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for( int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case ')':
                    if( !stack.empty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                    break;
                case '}':
                    if( !stack.empty() && stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                    break;
                case ']':
                    if( !stack.empty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                    break;
                default:
                    stack.push(c);
            }
            
        }
        
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
        
    }
}