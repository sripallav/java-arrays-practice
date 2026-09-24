import java.util.Arrays;
import java.util.Scanner;
public class SwapFirstLast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        swapfl sfl = new swapfl();
        sfl.swapfl(arr);

    }
}

class swapfl{
    public void swapfl(int [] arr){

        
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1]= temp;

            
                System.out.print(Arrays.toString(arr));

            }
        

        

    }
