package com.tapacademy.package1;
import java.util.Scanner;

public class Largest {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    // implement your logic here
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = input.nextInt();
    }
    
    int smallestElement = findSmallestElement(arr);
    System.out.println(smallestElement);
}

private static int findSmallestElement(int[] arr) {
    int smallest = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
        }
    }
    
    return smallest;
}
}