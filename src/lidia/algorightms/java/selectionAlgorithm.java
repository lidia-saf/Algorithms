package lidia.algorightms.java;

import java.util.Arrays;

public class selectionAlgorithm {
    public static void main(String[] args){
        System.out.println("hello");
        int[] anArray = {
                4, 2, 3, 6, 7, 9
        };
        System.out.println(Arrays.toString(anArray));
        int[] result = selectSort(anArray);
        System.out.print(Arrays.toString(result));
    }

    public static int[] selectSort(int[] array) {
        assert array != null : "failed precondition";
        int temporaryHolder;
        for (int i=0; i < array.length; ++i) {
            int[] newArray = Arrays.copyOfRange(array, i, array.length);
            System.out.println(Arrays.toString(newArray));
            int minValueIndex = getMinValueIndex(newArray);
            System.out.println(minValueIndex);
            temporaryHolder = array[i];
            System.out.println("tempHold: " + temporaryHolder);
            array[i] = array[minValueIndex];
            System.out.println("firstVal: " + array[i]);
            array[minValueIndex] = temporaryHolder;
            System.out.println(Arrays.toString(array));
        }
    return array;
    }

    public static int getMinValueIndex(int[] array) {
        int minValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        int minValueIndex = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
                System.out.println(minValue + "and" + minValueIndex);
            }
        }
        return minValueIndex;
    }
}
