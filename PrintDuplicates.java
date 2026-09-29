import java.util.Scanner;
public class PrintDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        frequency1 fq = new frequency1();
        fq.frequency1(arr);

        
    }
    
}

class frequency1{

    public void frequency1(int [] arr){
        

        for(int i=0;i<arr.length;i++){

            int count = 0;

            for(int j=i+1;j<arr.length;j++){

                if(arr[i] == arr[j]){

                   count++;
                   
                }
            }

            if(count > 0){
                System.out.print(arr[i] + " ");
            }
            }

            

        }

        




    }





