import java.util.Scanner;
public class SwapAlternateElements2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        alterele2 ele = new alterele2();
        ele.alterele2(arr);
    }
}

class alterele2{
    public void alterele2(int[] arr){
        
        
        for(int i=0;i<arr.length-1;i+=2){

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
             

        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

