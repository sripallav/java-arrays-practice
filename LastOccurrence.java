import java.util.Scanner;
public class LastOccurrence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter element  x of lastoccurance of index: ");
        int x = sc.nextInt();

        lastocc locc = new lastocc();
        System.out.print("The element " + x + " lastoccurance index is " + locc.lastocc(arr, x));

    } 
}

class lastocc{
    public int lastocc(int [] arr,int x){

        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index = i;
            }


        }

        return index;
    }
}
