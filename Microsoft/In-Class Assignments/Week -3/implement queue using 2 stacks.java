class MyQueue {
    Stack<Integer> A;
    Stack<Integer> B;
    public MyQueue() {
        this.A = new Stack<>();
        this.B = new Stack<>();
    }
    
    public void push(int x) {
        A.push(x);
    }
    
    public int pop() {
        if(B.isEmpty()){
            while(!A.isEmpty()){
                B.push(A.pop());
            }
        }
        return B.pop();
    }
    
    public int peek() {
        if(B.isEmpty()){
            while(!A.isEmpty()){
                B.push(A.pop());
            }
        }
        return B.peek();
    }
    
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
