import java.util.Scanner;

public class SecondLargest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SecondLargest2 obj = new SecondLargest2();
        obj.secondLargest(arr);

        sc.close();
    }

    public void secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                s_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > s_largest && arr[i]!=largest){
                s_largest = arr[i];


            }
            
        }

        if(s_largest == Integer.MIN_VALUE){
            System.out.print("there is no secound largest");
        }
        else{
            System.out.print(s_largest);
        }

    }
}