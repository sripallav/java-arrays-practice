import java.util.Scanner;

public class PrintDuplicates2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        PrintDuplicates2 obj = new PrintDuplicates2();
        obj.printDuplicates(arr);

        sc.close();
    }

    public void printDuplicates(int[] arr) {

        int [] newarr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(newarr[i] == 1){
                continue;
            }
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    newarr[j] = 1;

                }

            }

            if(count>1){
                System.out.print(arr[i] + " ");
                
            }
            
        }



        

    }
}