import java.util.*;

class task2 {

    public static Stack<Integer> sortStack(Stack<Integer> input) {

        // sortStack uses an input stack and newly created secondary stack, to sort elements by size.
        // 1 - Whilst input has elements, place the top one in store.
        // 2 - Whilst s has elements and the top one is larger than store,
        //     push the top element back into the input stack.
        // 3 - Push store onto the top of s.
        // return s - Input stack should be sorted into decreasing order.

        Stack<Integer> s = new Stack<>();

        while(!input.isEmpty()) {

            int store = input.pop();
            while(!s.isEmpty() && s.peek() > store) {
                input.push(s.pop());
            }
            s.push(store);
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many plates would you like to stack?\n"+"The shelf is only big enough for 10 maximum!");
        int numOfPlates = in.nextInt();

        //initialize arrays, max 10
        int[] sizesArr = {0,0,0,0,0,0,0,0,0,0};
        String[] materialsArr = {"","","","","","","","","",""};
        Random r = new Random();

        //Create random sizes and materials store in the arrays
        for (int i = 0; i < numOfPlates; i++) {

            int size = r.nextInt(4);
            sizesArr[i] = size+1;

            int material = r.nextInt(5);
            if (material != 4) {
                materialsArr[i] = "Ceramic";
            } else {
                materialsArr[i] = "Zinc";
            }
        }

        //Create plate object array and stack objects
        plate[] p = new plate[numOfPlates];
        Stack<Integer> randomPlateOrder = new Stack<>();

        //Create the plates from the random data and add them to the stack
        //Only if they are the correct material
        int wrongMaterial = 0;
        for(int i=0; i< p.length; i++) {

            p[i] = new plate(sizesArr[i],materialsArr[i]);
            if (p[i].getMaterial() == "Ceramic") {
                randomPlateOrder.add(p[i].getSize());
            } else {
                wrongMaterial++;
            }
        }

        //Creating plate printer and output messages
        plate platePrinter = new plate();
        System.out.println("There were "+wrongMaterial+" incorrect plates provided!");
        System.out.println("The new amount of random plates is: "+(numOfPlates-wrongMaterial));
        System.out.println(randomPlateOrder);

        //Check if plates are already in correct order
        Iterator check = randomPlateOrder.iterator();
        int previous = (int) check.next();
        int incorrectOrder = 0;

        while (check.hasNext()) {

            platePrinter.platePrinter(previous);
            int next = (int) check.next();
            if (previous > next) {
                incorrectOrder++;
            }
            previous = next;
        }
        platePrinter.platePrinter(previous);

        //If plates are incorrect sort them
        if (incorrectOrder > 0) {

            //Sort the order of the plates with the sortStack method
            System.out.println("\nSorting plates...");
            Stack<Integer> sortedPlates = sortStack(randomPlateOrder);
            System.out.println(sortedPlates);

            Iterator print = sortedPlates.iterator();
            while (print.hasNext()) {
                int a = (int) print.next();
                platePrinter.platePrinter(a);
            }

        } else {
            System.out.println("The plates are already in the correct order");
        }

    }

}
