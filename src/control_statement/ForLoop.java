package control_statement;

public class ForLoop {

    public static void main(String[] args) {

        int[] arr = {1, 2, 23, 4, 5, 5, 5};// declaration of array

        //print array elements using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        //reverse the array
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }

        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }


//*
//* *
//* * *
//* * * *
//* * * * *

        for(int i=1;i<=5;i++){

            for(int j=5;j>=i;j--){

                System.out.print("* ");
            }
            System.out.println();
        }

 //*****
 //****
 //***
 //**
 //*

        //Enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

    }
}

