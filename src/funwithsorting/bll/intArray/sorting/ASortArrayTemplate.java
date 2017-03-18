/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray.sorting;

public abstract class ASortArrayTemplate implements ISortIntArrayStrategy {

    private int mCurrentMaxIndexOfArray;

    @Override
    public void sort(int[] data) {
        validateArray(data);
        setMaxIndexOfArray(data);
        sortSpecificWay(data);
    }

    /**
     * Method to implement concrete way of sorting array
     *
     * @param data
     */
    public abstract void sortSpecificWay(int[] data);

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
        mCurrentMaxIndexOfArray = dataToSort.length;
    }

    public int getCurrentMaxIndexOfArray() {
        return mCurrentMaxIndexOfArray;
    }

}
