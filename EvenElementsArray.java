import java.util.Scanner;
public class EvenElementsArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        evenarrele ele = new evenarrele();
        ele.evenarrele(arr);

    }
  
}

class evenarrele{
    public void evenarrele(int [] arr){
        int [] earr = new int[arr.length];

        int newindex =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                earr[newindex] = arr[i];
                newindex++;
            }
        }

            for(int i=0;i < newindex;i++){

            

            System.out.print(earr[i] + " ");

           
        }

       




    }
}
