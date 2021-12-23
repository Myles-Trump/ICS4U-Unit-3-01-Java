/*
* The "MrCoxallStack" class
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.ArrayList;

public class MrCoxallStack {
    /**
    * This is the stack's array.
    */
    public ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * The Push() function adds integers to the stack.
    * @param pushNumber integer to be added to the stack
    */
    public void Push(final int pushNumber) {
        stackAsArray.add(pushNumber);
    }

    /**
    * The ShowStack() function shows the user the array.
    */
    public void ShowStack() {
        System.out.println("All integers in array\n****");
        for (int i : stackAsArray) {
            System.out.println(i);
        }
        System.out.println("****");
    }
}
