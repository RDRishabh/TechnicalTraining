import java.util.* ;
import java.io.*; 
public class Deque 
{
    int q[];
    int front,rear,k;
    // Initialize your data structure.
    public Deque(int n) 
    {
        q=new int[n];
        front=-1;
        rear=-1;
        this.k=n;
        // Write your code here.
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        if(isFull())
        return false;
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(front==0){
            front=k-1;
        }
        else{
            front=front-1;
        }
        q[front]=x;
        return true;
        // Write your code here.
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull())
        return false;
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(rear==k-1){
            rear=0;
        }
        else{
            rear=rear+1;
        }
        q[rear]=x;
        return true;
        // Write your code here.
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty())
        return -1;
        int x=q[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==k-1){
            front=0;
        }
        else{
            front=front+1;
        }
        return x;
        // Write your code here.
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty())
        return -1;
        int x=q[rear];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(rear==0){
            rear=k-1;
        }
        else{
            rear=rear-1;
        }
        return x;
        // Write your code here.
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(isEmpty())
        return -1;
        return q[front];
        // Write your code here.
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(isEmpty())
        return -1;
        return q[rear];
        // Write your code here.
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
        // Write your code here.
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((rear+1)%k==front || rear==k-1 && front==0){
            return true;
        }
        return false;
        // Write your code here.
    }
}
