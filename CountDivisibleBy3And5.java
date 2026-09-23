//Count how many numbers in the array are divisible by both 3 and 5.
import java.util.Scanner;
public class CountDivisibleBy3And5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
            
        }

        Divcount dc = new Divcount();
        System.out.print(dc.Divcount(arr));

    }
    
}

class Divcount{
    public int Divcount(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                count++;
            }
        }

        return count;
    }
}
