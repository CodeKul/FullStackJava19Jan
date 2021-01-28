package control_statement;

public class ForLoop {

    public static void main(String[] args) {

        int arr[] = {1,2,23,4,5,5,5};// declaration of array

        //print array elements using for loop
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //reverse the array
        for (int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }


        //enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

    }
}

