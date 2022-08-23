package Week2.Day5.Assignment;

//Q6)Try to get the nth index element from an array. Accept index value from user (Scanner)


import java.lang.reflect.Array;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index to be searched.");
        int index = scanner.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int num = Array.getInt(arr,index);

        System.out.println("Value present at index "+index+" is "+num);
    }
}

/*

Enter the index to be searched.
2

Value present at index 2 is 3


* */