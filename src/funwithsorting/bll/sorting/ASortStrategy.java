/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.sorting;

public abstract class ASortStrategy {

    private int currentMaxIndexOfArray;

    public void doYourMagicThing(int[] data) {
        validateArray(data);
        setMaxIndexOfArray(data);
        sort(data);
    }

    public abstract void sort(int[] data);

    /**
     * Check that there is data in the array
     *
     * @param dataToSort
     * @throws ArrayIndexOutOfBoundsException
     */
    public void validateArray(int[] dataToSort) throws ArrayIndexOutOfBoundsException {
        if (dataToSort == null || dataToSort.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Got no data!?");
        }
    }

    /**
     * Set the currentMaxIndexOfArray to the length of the parsed array
     *
     * @param dataToSort
     */
    public void setMaxIndexOfArray(int[] dataToSort) {
        currentMaxIndexOfArray = dataToSort.length;
    }

    public int getCurrentMaxIndexOfArray() {
        return currentMaxIndexOfArray;
    }

}
