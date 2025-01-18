package com.company;

public class Java_29_ArrayPs {
    public static void main(String[] args) {
        /* Practice Problem 1
        float [] marks = {45.7f,70.5f,100.f,31.5f,50.5f};
        float sum=0;
        for(float element:marks){
            sum+=element;
        }
        System.out.println("The value of sum :"+sum);
        */

        /* Practice Problem 2
        float [] marks = {45.7f,70.5f,100.f,31.5f,50.5f};
        float num=45.7f;
        boolean isInArray=false;
        for(float element:marks){
            if(num==element){
               isInArray=true;
            }
        }
        if(isInArray==true) {
            System.out.print("The value is present in the array.");
        } else {
            System.out.print("The value is not present in the array.");
        }
         */

        /* Practice Problem 3
        float [] marks = {45.7f,70.5f,100.f,31.5f,50.5f};
        float sum=0;
        for(float element:marks){
            sum+=element;
        }
        System.out.println("The value of sum :"+sum);
        float avg=sum/marks.length;
        System.out.println("The avg value is :"+avg);
         */

        /* Practice Problem 4
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{6,5,4},
                         {3,2,1}};
        int [][] sum = {{0,0,0},
                        {0,0,0}};
        for(int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.printf("Setting value for i=%d and j=%d \n",i,j);
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(sum[i][j]);
            }
            System.out.println("");
        }
         */

        /* Practice Problem 5
        int [] arr = {1,2,3,4,5};
        System.out.println("Print old array:");
        for(int element:arr) {
            System.out.print(element + "\t");
        }
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
            System.out.println("\n"+"Print new arr:");
        for(int element:arr){
            System.out.print(element+"\t");
        }
         */

        /* Practice Problem 6&7
        int []arr={1,2,8,4,5,0};
        int max =arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            } else {
                max=max;
            }
            if(arr[i]<min){
                min=arr[i];
            } else {
                min=min;
            }
        }
        System.out.println("Max Element :"+max);
        System.out.println("Min Element :"+min);
         */

        // Practice Problem 8
        int [] arr={1,2,3,4,5};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted)
            System.out.println("The array is sorted.");
        else
            System.out.println("The array is not sorted.");
    }
}
