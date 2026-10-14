
package it20a.midterm;


public class stackArrayArmada {
    private int[] stack;
    private int top;
    private int capacity;
    
    public stackArrayArmada(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public static void main(String[] args) {
        
        stackArrayArmada stack = new  stackArrayArmada(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println();
        
        System.out.println("Removed: " + stack.pop());
        
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println();
        
        stack.display();
    }
    public void push(int value){
        if (top == capacity - 1){
            System.out.println("Stack is Full");
        }else{
            stack[++top] = value;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(top== -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return  stack[top];
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack elements: ");
            
            for (int i = top; 1>= 0; i--){
                System.out.println(stack[i]);
            }
        }
    }
}
