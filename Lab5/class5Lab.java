import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

// A class to represent a queue
class Queue {
    int front, rear, size;
    int capacity;
    String array[];
 
    public Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new String[this.capacity];
    }
 
    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(Queue queue)
    {
        return (queue.size == queue.capacity);
    }
 
    // Queue is empty when size is 0
    boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }
 
    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(String item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                    % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }
 
    // Method to remove an item from queue.
    // It changes front and size
    String dequeue()
    {
        if (isEmpty(this))
            return null;
 
        String item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }
 
    // Method to get front of queue
    String front()
    {
        if (isEmpty(this))
            return null;
 
        return this.array[this.front];
    }
 
    // Method to get rear of queue
    String rear()
    {
        if (isEmpty(this))
            return null;
 
        return this.array[this.rear];
    }
}


