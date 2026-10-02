import java.util.Scanner;

public class CountPairsSumK2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        countPairsSumK(arr, k);

        sc.close();
    }

    static void countPairsSumK(int[] arr, int k) {

         int count = 0;

       for(int i=0;i<arr.length;i++){
       
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] + arr[j] == k){
                count++;

            }


        }

       }

       System.out.print(count);
    }
}