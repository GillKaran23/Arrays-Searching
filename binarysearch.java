import java.util.*;
public class binarysearch {
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
        Arrays.sort(a);
        System.out.print("Type the element you want to search: ");
        int num = sc.nextInt();
        int start=0;
        int end = a.length-1;
        int mid = (start+end) /2;
        while(start<=end && num!=a[mid]){
            if(num<a[mid]){
                end = mid - 1;
            }
            else if(num>a[mid]){
                start=mid+1;
            }
            mid = (start+end)/2;
        }
        if(num==a[mid]){
            System.out.println(num+" is found at index: "+(mid+1));
        }
        else{
            System.out.println("Element is not present in the Array.");
        }
    }
}
