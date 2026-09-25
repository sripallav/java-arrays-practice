import java.util.Scanner;
public class RotateLeftByOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]  = sc.nextInt();


        }

        Leftonerot lor = new Leftonerot();
        lor.Leftonerot(arr);
    }
}

class Leftonerot{
    public void Leftonerot(int [] arr){

        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}















