package com.bridgelabz.Practice;

public class ArrayRotation {

public void rotation() {
    int[] arr = new int[]{1, 2, 3, 4, 5};

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }


    for (int i = 0; i < 2; i++) {
        int j, first;
        first = arr[0];
        for (j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[j] = first;
    }
}

    public static void main(String[] args) {
        ArrayRotation rot = new ArrayRotation();
        rot.rotation();
    }

}
