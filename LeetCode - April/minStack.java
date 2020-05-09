class MinStack {
    
    class Node
    {
        int val;
        int min;

        public Node(int val, int min) {
            
            this.val = val;
            this.min = min;
        
        }
    
    }
    
    private Stack<Node> stack = new Stack();

    public MinStack() {
        
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
            
            stack.push(new Node(x, x));
        
        } 
        else {
            
            stack.push(new Node(x, Math.min(x, stack.peek().min)));
        
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}