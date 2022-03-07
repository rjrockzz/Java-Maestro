
class Stack{
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow xD");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x; //Incrementing the top element and assigning it x
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int getSize(){
        return top+1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }
    public void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: ");
        stack.printStack();

        stack.pop();
        System.out.println("After popping out");
        stack.printStack();
    }
}