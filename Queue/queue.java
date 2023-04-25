class MyQueue {
    int size=1000;
    int[] arr;
    int pos,temp;

    public MyQueue() {
        this.pos=0;
        this.temp=0;
        arr=new int[size];
    }
    
    public void push(int x) {
        if(pos==size){
            return;
        }
        arr[pos]=x;
        pos+=1;
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int x=arr[temp];
        temp+=1;
        if(temp==pos){
            temp=0;
            pos=0;
        }
        return x;
        
    }
    
    public int peek() {
        return arr[temp];
    }
    
    public boolean empty() {
        if(temp==0 && pos==0)
        return true;
        if(temp==pos){
            temp=0;
            pos=0;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */