import java.util.Scanner;

public class SortedDescending2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SortedDescending2 obj = new SortedDescending2();
        obj.checkSorted(arr);

        sc.close();
    }

    public void checkSorted(int[] arr) {

        boolean decending = true;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i] < arr[i+1]){
                decending = false;
                break;
            }

        }

        if(decending){
            System.out.print("Array is in decending order");
        }
        else{
            System.out.print("Array is not in decending order");

        }

        
    }
}