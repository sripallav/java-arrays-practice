import java.util.Scanner;

public class RotateRightByOne2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        rotaterightone rlo = new rotaterightone();
        rlo.rotaterightone(arr);
    }
}

class rotaterightone{
    public void rotaterightone(int [] arr){

       int temp = arr[arr.length-1];

       for(int i=arr.length-1;i>0;i--){

        arr[i] = arr[i-1];

       }

       arr[0] = temp;

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
       }

       
       }

       


    }


