import java.util.Scanner;

public class CompareArraysEqual {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array1: ");
        int size1 = sc.nextInt();
        int [] arr1 = new int[size1];

        System.out.print("Enter array1 elements: ");

        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        

        System.out.print("enter size of array2: ");
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];

        System.out.print("enter array2 elements: ");

        
        

        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }



        ClassNameMethod obj = new ClassNameMethod();
        obj.ClassNameMethod(arr1,arr2);
    }
}

class ClassNameMethod{
    public void ClassNameMethod(int [] arr1,int [] arr2){

        boolean equal = true;


            if(arr1.length!=arr2.length){
                equal = false;
            }

            else{

                for(int i=0;i<arr1.length;i++){
        
                if(arr1[i]!=arr2[i]){

                equal = false; 
                break;
            }
 
        }
    }

        if(equal){
            System.out.print("two arrays are equal.  ");

        }
        else{
            System.out.print("two arrays are not equal.  ");

        }

    }
}
