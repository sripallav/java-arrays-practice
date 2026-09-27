import java.util.Arrays;
import java.util.Scanner;
public class ReplaceEvenOdd2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        repevod rp = new repevod();
        rp.repevod(arr);



    }
    
}

class repevod{
    public void repevod(int [] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] = 1;
            }

            else{
                arr[i] = 0;
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
