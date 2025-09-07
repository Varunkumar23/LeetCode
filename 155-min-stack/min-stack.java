class MinStack {
    Stack<Integer> st;
    int min=Integer.MAX_VALUE;

    public MinStack() {
        st=new Stack();
    }
    
    public void push(int val) {
        st.push(val);
        min=Math.min(val,min);
    }
    
    public void pop() {
        int removed=st.pop();
        min=Integer.MAX_VALUE;
        for(int x:st){
            min=Math.min(min,x);
        }
        
    }
    
    public int top() {
        int x=st.peek();
        return x;
        
    }
    
    public int getMin() {
        return min;
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