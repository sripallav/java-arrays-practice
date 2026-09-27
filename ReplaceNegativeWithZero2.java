import java.util.Scanner;
public class ReplaceNegativeWithZero2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        repnegto0 rep = new repnegto0();
        rep.repnegto0(arr);
    }
}

class repnegto0{
    public void repnegto0(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i] = 0;
            }

            System.out.print(arr[i] + " ");
        }
    }
}
















