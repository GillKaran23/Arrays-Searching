import java.util.*;
public class binary_2D {

    static int[] search(int[][] a, int num){
        int row=0;
        int col=a[row].length-1;
        while(row<a.length && col>=0){
            if(a[row][col]==num){
                return new int[]{row,col};
            }
            if(a[row][col]<num){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of rows and columns: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Type the elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Type the element you want to search: ");
        int num = sc.nextInt();
        int ans[] = search(a,num);
        System.out.println("Element found at index: "+Arrays.toString(ans));
    }
}
