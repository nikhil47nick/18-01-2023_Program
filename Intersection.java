package com.bridgelabz.Practice;

public class Intersection {

    public void intersect(){
        int[] array1 = new int[]{1,4,6,2,7,9,4,5};
        int[] array2 = new int[]{3,4,7,4,8,3,8,5};

        for (int i =0;i<array1.length;i++){
            for (int j =0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println("Array intersection is : "+array2[j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        Intersection inter = new Intersection();
        inter.intersect();
    }

}
