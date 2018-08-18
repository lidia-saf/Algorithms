package lidia.algorightms.java;

import java.util.Arrays;

public class selectionAlgorithm {
    public static void main(String[] args){
        System.out.println("hello");
        int[] array = {4, 2, 3, 6, 7, 9};
        System.out.println(selectSort(array));
    }

    public static int[] selectSort(int[] array) {
        assert array != null : "failed precondition";
        int temporaryHolder = 0;
        for (int i : array) {
            int[] newArray = Arrays.copyOfRange(array, i, array.length -1);
            int minValueIndex = getMinValueIndex(newArray);
            System.out.println(minValueIndex);
            temporaryHolder = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temporaryHolder;
        }
    return array;
    }

    public static int getMinValueIndex(int[] array) {
        int minValue = array[0];
        int minValueIndex = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
}
