//Input n and take n integers into an array; print them.

import java.util.Arrays;
import java.util.Scanner;

class InputAndPrintArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        arrayelements ae = new arrayelements();
        ae.arrayelements(arr);
        
    }
}

class arrayelements{
    public void arrayelements(int [] arr){

        System.out.print(Arrays.toString(arr));
    }
}