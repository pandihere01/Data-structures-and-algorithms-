import java.util.*;

public class Main {
    public static void main(String[] args){

        Stack stack = new Stack();

        System.out.println("the stack empty is " + stack.isEmpty());

        stack.push(15);
        stack.push(24);
        stack.push(25);
        System.out.println("the deleted element " + stack.pop());
        System.out.println(stack.peek());
        System.out.println("The size of the stack is " + stack.size());

        System.out.println("the stack empty is " + stack.isEmpty());

        stack.show();
    
    }
}
