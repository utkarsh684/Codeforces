package Rated_1200_questions;

import java.util.*;
public class Virus {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char[][] grid = new char[n][n];

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < n; j++) {
                    grid[i][j] = row.charAt(j);
                }
            }

            int ans = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int ones = 0;
                    int zeros = 0;

                    if(grid[i][j] == '0'){
                        zeros++;
                    } else{
                        ones++;
                    }

                    if(grid[j][n-i-1] == '0'){
                        zeros++;
                    } else{
                        ones++;
                    }

                    if(grid[n-i-1][n-j-1] == '0'){
                        zeros++;
                    } else{
                        ones++;
                    }

                    if(grid[n-j-1][i] == '0'){
                        zeros++;
                    } else{
                        ones++;
                    }

                    if(ones == 0 || zeros == 0){
                        continue;
                    }

                    if(ones >= zeros){
                        ans += zeros;
                        grid[i][j] = '1';
                        grid[j][n-i-1] = '1';
                        grid[n-i-1][n-j-1] = '1';
                        grid[n-j-1][i] = '1';
                    } else{
                        ans += ones;
                        grid[i][j] = '0';
                        grid[j][n-i-1] = '0';
                        grid[n-i-1][n-j-1] = '0';
                        grid[n-j-1][i] = '0';
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
