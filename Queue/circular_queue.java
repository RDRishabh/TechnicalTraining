class MyCircularQueue {
    int front,rear;
    int[] q;
    int l=0;

    public MyCircularQueue(int k) {
        this.front=-1;
        this.rear=-1;
        q=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(front==-1 && rear==-1){
            rear+=1;
            front+=1;
            q[rear]=value;
            l++;
            return true;
        }
        if(!isFull()) {
            rear =(rear + 1)%q.length;
            q[rear] = value;
            l++;
            return true;
        }
        else
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()) {
            front = (front + 1)%q.length;
            l--;
            if(l==0){
                front=-1;
                rear=-1;
            }
            return true;
        }
        else
        return false;
    }
    
    public int Front() {
        return isEmpty()?-1:q[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:q[rear];
    }
    
    public boolean isEmpty() {
        if(rear==-1 && front==-1)
        return true;
        else
        return false;
    }
    
    public boolean isFull() {
        if(l==q.length)
        return true;
        else
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */