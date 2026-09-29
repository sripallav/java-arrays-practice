import java.util.Scanner;
public class MergeTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size1");
        
        int size1 = sc.nextInt();
        int [] arr1 = new int[size1];
        System.out.print("enter array1 elements: ");

          for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("enter array size2");
        

        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        System.out.print("enter array2 elements: ");



        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }


        mergearray ma = new mergearray();
        ma.mergearray(arr1, arr2);

    }
    
}

class mergearray{
    public void mergearray(int [] arr1,int arr2[]){

        int [] newarr = new int[arr1.length + arr2.length];

        int index = 0;

        for(int i=0;i<arr1.length;i++){

            newarr[index] = arr1[i];

            index++;

        }

         for(int i=0;i<arr2.length;i++){

            newarr[index] = arr2[i];

            index++;

        }



        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i] + " ");
        }


    }
}


