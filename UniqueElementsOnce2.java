import java.util.Scanner;

public class UniqueElementsOnce2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        uniqueElementsOnce(arr);

        sc.close();
    }

    static void uniqueElementsOnce(int[] arr) {

        boolean find[] = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(find[i]){
                continue;

            }
            int count = 0;

            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                find[j] = true;
            }
        }
            

            if(count == 1){
                System.out.print(arr[i] + " ");
            }


        }

        
    }
}

