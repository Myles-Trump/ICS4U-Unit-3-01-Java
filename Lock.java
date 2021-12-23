/*
* The "Lock" Program aids Main.java
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/
public class Lock {

    // the Lock class has 1 field
    /**
    * This stores the current combination as well as initially sets it to 0000.
    */
    private int combination = 0000;

    // and 1 method
    /**
    * This method changes the combination.
    *
    * @param inputtedChange the new combination the user inputted
    */
    public void changeCombination(final int inputtedChange) {
        combination = inputtedChange;
    }
}
