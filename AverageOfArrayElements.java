import java.util.Scanner;
public class AverageOfArrayElements {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter a array elements: ");
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Averagearray aa = new Averagearray();
        System.out.print("average of arrays is: " + aa.Averagearray(arr));
    }
  
}

class Averagearray{
    public int Averagearray(int [] arr){
        int count = 0;
        int sum = 0;
        int average = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            count++;
        
        }
        average = sum / count;

        return average;
    }

}
