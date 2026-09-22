import java.util.Scanner;
public class CountPositiveNegativeZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        posnegzero pnz = new posnegzero();
        pnz.posnegzero(arr);

    }
    
}

class posnegzero{
    public void posnegzero(int [] arr){

        int positive= 0;
        int negative = 0;
        int zero = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else{
                zero++;
            }
        }

        System.out.println("positive are: " + positive);
        System.out.println("negative are: " + negative);
        System.out.println("Zero are: " +  zero);

    }
}
