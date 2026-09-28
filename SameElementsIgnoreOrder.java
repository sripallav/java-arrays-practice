import java.util.Scanner;

public class SameElementsIgnoreOrder {

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

        SameElementsIgnoreOrder obj = new SameElementsIgnoreOrder();
        obj.sameElements(arr1, arr2);

        sc.close();
    }

    public void sameElements(int[] arr1, int[] arr2) {

        boolean same = true;

        if(arr1.length != arr2.length){
            same = false;
        }
        else{

            for(int i = 0; i < arr1.length; i++){

                boolean found = false;

                for(int j = 0; j < arr2.length; j++){

                    if(arr1[i] == arr2[j]){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    same = false;
                    break;
                }
            }
        }

        if(same){
            System.out.print("Same elements");
        }
        else{
            System.out.print("Not same elements");
        }
    }
}