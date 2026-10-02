import java.util.Scanner;

public class CountGreaterThanAverage2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        countGreaterThanAverage(arr);

        sc.close();
    }

    static void countGreaterThanAverage(int[] arr) {

      
        int count = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            
            sum = sum + arr[i];
            count++;
        }

        int average =  sum / count;


        int count1 = 0;


    for(int i=0;i<arr.length;i++){

        if(arr[i] > average){

            count1 ++;
        }

        

    }


    System.out.println("average of array is: " + average);
    System.out.println("elements of array greater than average are: " + count1 );
}
}