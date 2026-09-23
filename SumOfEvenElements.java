import java.util.Scanner;
public class SumOfEvenElements {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        sumofev se = new sumofev();

        System.out.print(se.sumofev(arr));
    }
    
}

class sumofev{
    public int sumofev(int [] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
            }
        }

        return sum;
    }
}
