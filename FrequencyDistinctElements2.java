import java.util.Scanner;

public class FrequencyDistinctElements2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        frequencyDistinctElements(arr);

        sc.close();
    }

    static void frequencyDistinctElements(int[] arr) {

        boolean same[] = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(same[i]){
                continue;  
            }

            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    same[j] = true;
                   
                }
            }

            System.out.println(arr[i] + " --> " + count);
        }

        

       
    }
}