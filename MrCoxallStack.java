/*
* The "MrCoxallStack" class 
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.ArrayList;

public class MrCoxallStack {

    public ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    public void Push(final int pushNumber) {
        stackAsArray.add(pushNumber);
    }

    public void ShowStack() {
        System.out.println("All integers in array\n****");
        for (int i : stackAsArray) {
            System.out.println(i);
        }
        System.out.println("****");
    }
}
