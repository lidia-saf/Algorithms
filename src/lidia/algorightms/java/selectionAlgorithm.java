package lidia.algorightms.java;

import java.util.Arrays;

public class selectionAlgorithm {
    public static void main(String[] args){
        int[] anArray = {
                4, 2, 3, 6, 7, 9
        };
        int[] arrayTwo = {
                5, 10, 35, 2, 8, 7, 1, 4
        };
        int[] arrayThree = {
                78, 15, -5, 3, 90
        };
        int[] result = selectSort(anArray);
        int[] resultTwo = selectSort(arrayTwo);
        int[] resultThree = selectSort(arrayThree);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultTwo));
        System.out.println(Arrays.toString(resultThree));
    }

    public static int[] selectSort(int[] array) {
        assert array != null : "failed precondition";
        int temporaryHolder;
        for (int i=0; i < array.length; ++i) {
            int[] newArray = Arrays.copyOfRange(array, i, array.length);
            int minValue = getMinValue(newArray);
            int minValueIndex = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == minValue) {
                    minValueIndex = j;
                }
            }
            temporaryHolder = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temporaryHolder;
        }
    return array;
    }

    public static int getMinValue(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
