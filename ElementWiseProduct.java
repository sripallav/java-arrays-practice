import java.util.Scanner;

public class ElementWiseProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Enter array1 elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.print("Enter array2 elements: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        productele obj = new productele();
        obj.productele(arr1, arr2);

        sc.close();
    }
}

class productele{
    public void productele(int [] arr1,int [] arr2){

        int index = 0;

        int [] newarr = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){

            newarr[index] = arr1[i] * arr2[i];

            index++;

        }

        for(int i=0;i<newarr.length;i++){

            System.out.print(newarr[i] + " ");

        }
    }

}









