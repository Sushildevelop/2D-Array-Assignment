package Practice.Array.TwoDArray.TwoDarray_1.Assignment_01;

import java.util.Scanner;

public class Prefix_smum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter the input: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int pref[][]=new int[n][m];
       for (int i=0;i<n;i++){
           for (int j=0;j<m;j++){
               pref[i][j]=arr[i][j];
               if (i==0 && j==0){
                   continue;
               }
               else if(i==0){
                   pref[i][j]+=pref[i][j-1];
               } else if (j==0) {
                   pref[i][j]+=pref[i-1][j];
               }
               else {
                   pref[i][j]+=pref[i-1][j]+pref[i][j-1];
               }
           }
       }
       for (int i=0;i<n;i++){
           for (int j=0;j<m;j++){
               System.out.print(pref[i][j]+" ");
           }
           System.out.println();
       }
    }
}
