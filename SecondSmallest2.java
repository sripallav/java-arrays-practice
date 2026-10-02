import java.util.Scanner;

public class SecondSmallest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SecondSmallest2 obj = new SecondSmallest2();
        obj.secondSmallest(arr);

        sc.close();
    }

    public void secondSmallest(int[] arr) {

        int Smallest  = Integer.MAX_VALUE;
        int S_Smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < Smallest){
                S_Smallest = Smallest;
                Smallest = arr[i];
            }

            else if(arr[i] < S_Smallest && arr[i]!=Smallest){
                S_Smallest = arr[i];

            }
        }

        if(S_Smallest == Integer.MAX_VALUE){

            System.out.print("there is no secound smallest");

        }
        else{
            System.out.print("S_Smallest: " + S_Smallest);


        }


    }
}