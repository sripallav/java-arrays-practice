import java.util.Scanner;
public class FrequencyArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        frequency fq = new frequency();
        fq.frequency(arr);

        
    }
    
}

class frequency{

    public void frequency(int [] arr){
        

        for(int i=0;i<arr.length;i++){

            int count = 0;

            for(int j=0;j<arr.length;j++){

                if(arr[i] == arr[j]){

                   count++;
                }
            }

                 System.out.print(arr[i] + "--> " + " " +count + " ");
            }

            

        }

        




    }



