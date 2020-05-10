class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> star = new Stack<Integer>(); 
    
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '*')
                star.push(i);
            
            else if(s.charAt(i) == '(')
                stack.push(i);
            
            else{
                if(!stack.isEmpty())
                    stack.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
            
        }
        
        while(!stack.isEmpty()){
            if(!star.isEmpty() && star.peek() > stack.peek())
                star.pop();
            else
                return false;
            stack.pop();
        }
        
        return true;
    }
}