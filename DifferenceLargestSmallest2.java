import java.util.Scanner;

public class DifferenceLargestSmallest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        DifferenceLargestSmallest2 obj = new DifferenceLargestSmallest2();
        obj.findDifference(arr);

        sc.close();
    }

    public void findDifference(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > largest){
                largest = arr[i];
                
            }
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i] < smallest){
                smallest = arr[i];
                
            }
        }


        System.out.print("the diff is: " + (largest - smallest));

        
     


    }
}