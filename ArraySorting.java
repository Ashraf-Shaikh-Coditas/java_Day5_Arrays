package Week2.Day5.Assignment;

//Q2)Print array in Ascending and descending order, using in-built functionality.
//Q3)Copy one array into the another array,using in-built functionality.

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        Integer array[] = {2,3,1,5,8,10,34,35,65,36};
        Arrays.sort(array);
        System.out.println("After sorting in ascending order...");
        for(int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();

        Arrays.sort(array,Collections.reverseOrder());

        System.out.println("After sorting in descending order...");
        for(int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();

        Integer[] array2 = Arrays.copyOf(array,10);
        System.out.println("Array2 after copying ...");
        for(int i : array2) {
            System.out.print(i+" ");
        }

    }
}

/*

After sorting in ascending order...
1 2 3 5 8 10 34 35 36 65

After sorting in descending order...
65 36 35 34 10 8 5 3 2 1

Array2 after copying ...
65 36 35 34 10 8 5 3 2 1

* */
