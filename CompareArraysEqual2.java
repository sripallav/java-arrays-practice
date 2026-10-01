import java.util.Scanner;

public class CompareArraysEqual2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.print("Enter array1 elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.print("Enter array2 elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        CompareArraysEqual2 obj = new CompareArraysEqual2();
        obj.compareArrays(arr1, arr2);

        sc.close();
    }

    public void compareArrays(int[] arr1, int[] arr2) {

        boolean same = true;

        if(arr1.length != arr2.length){

            same = false;
            

        }

        else{

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){

                same = false;
                break;
                

            }
        }

        
    }

    if(same){

        System.out.print("two arrays are equal");
    }
    else{
        System.out.print("two arrays are not equal");
    }

        

    }
}