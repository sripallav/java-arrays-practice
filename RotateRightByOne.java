import java.util.Scanner;
public class RotateRightByOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]  = sc.nextInt();


        }

        rotaterigone rro = new rotaterigone();
        rro.rotaterigone(arr);
    }
}

class rotaterigone{
    public void rotaterigone(int [] arr){

        int temp = arr[arr.length-1];

        for(int i=0;i<arr.length;i++){

            arr[i] = arr[i-1];

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}