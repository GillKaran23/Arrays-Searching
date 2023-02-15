//Without any sorting Liear Search
import java.util.*;
public class linearSearching{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Type the elements: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int j=0; j<n; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.print("Type the element you want to search: ");
        int num = sc.nextInt();
        for(int k=0; k<n; k++){
            if(a[k]==num){
                System.out.print(num+" is find at index "+k);
            }
        }
    }
}