class Stack {

    private final int size = 10;
    private int[] stackArray;
    private int top;

    /* CONSTRUCTOR INITIALIZE THE STACK ARRAY
       AND THE top VARIABLE */
    Stack() {
        stackArray = new int[size];
        top = -1;
    }

    /* push(): IF STACK IS NOT FULL PUSHES A NEW
               ELEMENT */
    public void push(int value) {
        if(top == size-1) {
            System.out.println("Stack is full! Can't push!");
        }
        else {
            top++;
            stackArray[top] = value;
        }

    }

    /* pop(): EXTRACT A VALUE FROM THE STACK */
    public int pop() {
        top--;
        return stackArray[top+1];
    }

    /* empty(): CHECK IF STACK IS EMPTY */
    public boolean empty() {
        return top == -1;
    }

    /* printStack(): PRINT THE STACK FORMATTED
       FOR DEMONSTRATION PURPOSES */
    public void printStack() {
        for(int i = top; i > -1; i--) {
            System.out.println("|" + stackArray[i] +"|");
        }
    }

}
