class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        /* PUSH 1,2,3,4 IN STACK */
        for(int i = 1; i <= 4; i++)
            stack.push(i);
        stack.printStack();

        /* MAKE TWO POPS */
        System.out.println("\nTWO POPS");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\nSTACK AFTER TWO POPS");
        stack.printStack();

        /* PUSH 5,6,7,8 IN STACK */
        for(int i = 5; i <= 8; i++)
            stack.push(i);
        System.out.println("\nSTACK AFTER THE NEW PUSHES");
        stack.printStack();

        /* POP OUT ALL THE ITEMS FROM STACKS */
        System.out.println("\nPOP OUT ALL");
        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
