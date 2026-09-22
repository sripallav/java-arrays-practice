import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        sumofarray sa = new sumofarray();
        System.out.print("Sum of array is: " + sa.sumofarray(arr));

    }

    
}

class sumofarray{
    public int sumofarray(int [] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        return sum;

    }
}
