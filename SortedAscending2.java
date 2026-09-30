import java.util.Scanner;

public class SortedAscending2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SortedAscending2 obj = new SortedAscending2();
        obj.checkSorted(arr);

        sc.close();
    }

    public void checkSorted(int[] arr) {

        for(int i=0;i<arr.length;i++){

            if(arr[i] < arr[i+1]){
                continue;


            }

            System.out.print("elements are in sorted");

        }


        

        

        }
    }
