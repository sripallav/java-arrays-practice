import java.util.Arrays;
import java.util.Scanner;
public class SwapFirstLast2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        swapfl2 fl = new swapfl2();
        fl.swapfl2(arr);
    }
}

class swapfl2{
    public void swapfl2(int [] arr){

        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;

        
        System.out.print(Arrays.toString(arr));
    }
}
            
        
















