import java.util.Scanner;

public class FrequencyArray2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        FrequencyArray2 obj = new FrequencyArray2();
        obj.frequency(arr);

        sc.close();
    }

    public void frequency(int[] arr) {

        int [] visited = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            if(visited[i] == 1){
                continue;

            }

            int count = 0;

            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = 1;


                }
            }

            System.out.println(arr[i] + " ---> " + count);
        }



    }
}