import java.util.Scanner;

public class SumExcludeLargestSmallest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sumExcludeLargestSmallest(arr);

        sc.close();
    }

    static void sumExcludeLargestSmallest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int sum = 0;

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


       


        for(int i=0;i<arr.length;i++){
            sum = (sum + arr[i]);
        }

        
        int sum1 = largest+smallest;


        System.out.print(sum-sum1);



       
    }
}