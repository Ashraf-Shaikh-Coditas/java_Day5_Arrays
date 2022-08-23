package Week2.Day5.Assignment;

//Q4)using the "equals" method, find the duplicate elements (int/String) of the array.
//print the Duplicate element.
//>try to remove the second occurrence of Duplicate element,
//again print Array elements (without duplication)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class QuestionFour {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,1,2,3,4,5,6};

        HashSet<Integer> hs = new HashSet<>();

        Arrays.sort(arr);

        for(int i =0; i < arr.length-1;i++) {
            if(arr[i].equals(arr[i+1])) {
                System.out.println(arr[i]+" : Duplicate element present.");
            }
            hs.add(arr[i]);
        }

        System.out.println("Printing distinct elements : ");
        for(int i : hs) {
            System.out.println(i);
        }


    }
}

/*

1 : Duplicate element present.
2 : Duplicate element present.
3 : Duplicate element present.
4 : Duplicate element present.
5 : Duplicate element present.
6 : Duplicate element present.
Printing distinct elements :
1
2
3
4
5
6


* */