import java.util.*;
public class search2D_array {
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
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(num==a[i][j]){
                    System.out.println(num+" is present at index ["+i+","+j+"]");
                }
            }
        }
    }
}
