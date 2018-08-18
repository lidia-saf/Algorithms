package lidia.algorightms.java;

import java.util.Arrays;

public class selectionAlgorithm {
    public static void main(String[] args){
        System.out.println("hello");
        int[] array = {4, 2, 3, 6, 7, 9};
        int[] result = selectSort(array);
        System.out.print(result);
    }

    public static int[] selectSort(int[] array) {
        assert array != null : "failed precondition";
        int temporaryHolder;
        for (int i=0; i < array.length; ++i) {
            int[] newArray = Arrays.copyOfRange(array, i, array.length-1);
            int minValueIndex = getMinValueIndex(newArray);
            System.out.println(minValueIndex);
            temporaryHolder = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temporaryHolder;
        }
    return array;
    }

    public static int getMinValueIndex(int[] array) {
        int minValue = Integer.MAX_VALUE;
        int minValueIndex = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
}
