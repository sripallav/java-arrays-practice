import java.util.Scanner;

public class ElementsInOneNotOther {

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

        Elementscommon1 obj = new Elementscommon1();
        obj.Elementscommon1(arr1, arr2);

        sc.close();
    }
}

class Elementscommon1{
    public void Elementscommon1(int [] arr1,int [] arr2){


        for(int i=0;i<arr1.length;i++){

            boolean found = false;

            for(int j=0;j<arr2.length;j++){

                if(arr1[i] == arr2[j]){

                    found = true;
                    break;

                }
            }

            if(!found){
                System.out.print(arr1[i] + " ");
            }


            
        }



    }
}




