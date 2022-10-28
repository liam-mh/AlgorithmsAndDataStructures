import java.util.*;

class test {

    public static Stack<Integer> sortStack(Stack<Integer>input) {

        Stack<Integer> tempStack = new Stack<>();

        while(!input.isEmpty()) {

            int temp = input.pop();

            while(!tempStack.isEmpty() && tempStack.peek() > temp) {

                input.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        return tempStack;
    }


    public static void main(String[] args) {

        Stack<Integer> input = new Stack<>();
        input.add(23);
        input.add(4);
        input.add(15);
        input.add(39);
        input.add(37);

        System.out.println(input);

        Stack<Integer> tempStack = sortStack(input);

        System.out.println("Sorted numbers are:");

        while(!tempStack.empty()) {

            System.out.println(tempStack.pop() + " ");
        }
    }

}

