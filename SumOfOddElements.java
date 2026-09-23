import java.util.Scanner;
public class SumOfOddElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        sumoddele so = new sumoddele();
        System.out.print(so.sumofodd(arr));
    }

    
}

class sumoddele{
    public int sumofodd(int [] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum = sum+arr[i];
            }
        }

        return sum;
    }
}
