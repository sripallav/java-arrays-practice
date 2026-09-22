import java.util.Scanner;

public class CountEvenOddElements {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        countevodele ceo = new countevodele();
        ceo.countevodele(arr);


    }
    
}

class countevodele{
    public void countevodele(int [] arr){
        int e_count = 0;
        int o_count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e_count++;

            }
            else{
                o_count++;
            }
        }

        System.out.println("The even count is: " + e_count);
        System.out.println("The odd count is: " + o_count);

    }
}
