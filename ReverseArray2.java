import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        reversearr2 ra2 = new reversearr2();
        ra2.reversearr2(arr);
    }
}

class reversearr2{
    public void reversearr2(int [] arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){

        int temp = arr[left];
        arr[left] =arr[right];
        arr[right] = temp;

        left++;
        right--;

        

        }

        

        System.out.print(Arrays.toString(arr));




        
    }
}













