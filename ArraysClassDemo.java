package Week2.Day5.Assignment;

//Q1)Check for the package, related to Array,where Array related in-built methods are present?gdkı.9)
//=>create Simple code using those package in-built functionality.
//=>whenever required use the "for-each" loop to iterate.
//=>follow Naming conventions and indentation while coding. (spaces, tab)

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int array[] = {10,34,23,15,34,56,65};

        System.out.println("Index :: "+Arrays.binarySearch(array,3));

        int arr2[] = Arrays.copyOf(array,10);  // copy one array into another

        System.out.println(Arrays.toString(arr2));     // prints array

        System.out.println(Arrays.equals(array,arr2)); // compares two array

        Arrays.fill(arr2,100);  // fills given array with specified value

        System.out.println("After use fill() function .");
        for(int i : arr2) {
            System.out.print(i+" ");
        }

        Arrays.sort(array); // sorts array
        System.out.println("After use sort() function .");
        for(int i : array) {
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println(Arrays.hashCode(array)==Arrays.hashCode(arr2));// compares hashcode of two arrays

    }
}

/*

Index :: -1

[10, 34, 23, 15, 34, 56, 65, 0, 0, 0]

false

After use fill() function .
100 100 100 100 100 100 100 100 100 100

After use sort() function .
10 15 23 34 34 56 65

false



* */