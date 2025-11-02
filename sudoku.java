/*
Sudoku Solver (Console + File Input)
-----------------------------------
Author: Asmit Mandal(Asmit159)
This program solves any valid 9x9 Sudoku using backtracking.
Users can either enter the Sudoku manually through console input or upload a text file with the grid.
Each empty cell should be represented by 0.

Implementation:
- Uses recursion and backtracking to fill the grid.
- Includes input validation and support for text file loading.

Note:
This project is created and maintained by Asmit Mandal(Asmit159).
Forking or redistribution without explicit permission from the author is not allowed.
*/

import java.util.*;
import java.io.*;

class sudoku{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int table[][]=new int[9][9];

        //Menu and Input part 
        System.out.println("------ Sudoku Solver ------");
        System.out.println("Choose an Option:");
        System.out.println("1.Manual input\n2.File input");
        int choice=sc.nextInt();

        if(choice==1){
            System.out.println("Enter 9x9 Sudoku,Use 0 for Empty,Separate Digits by Spaces and Input each Row Separately:");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    table[i][j]=sc.nextInt();
                }
            }
        }
        else if(choice==2){
            System.out.print("Enter File Path: ");
            sc.nextLine();
            String file=sc.nextLine();
            try(Scanner f=new Scanner(new File(file))){
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        if(f.hasNextInt()) table[i][j]=f.nextInt();
                        else{
                            System.out.println("Invalid File");
                            return;
                        }
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("File not Found");
                return;
            }
        }else{
            System.out.println("Invalid choice,Run it Again ...");
            return;
        }

        if(solver(table,0,0)){
            System.out.println("Solution Exists,Sudoku Solved");
            printSudoku(table);
        }else System.out.println("No solution Exists, Sudoku Cannot be Solved");
        sc.close();
    }


    //core function which uses backtracking concept to solve the Sudoku
    private static boolean solver(int a[][],int r,int c){
        if(r==9) return true;
        int nr=r,nc=c+1;
        if(c==8){nr=r+1;nc=0;}
        if(a[r][c]!=0) return solver(a,nr,nc);
        for(int d=1;d<=9;d++){
            if(isSafe(a,r,c,d)){
                a[r][c]=d;
                if(solver(a,nr,nc)) return true;
                a[r][c]=0;
            }
        }
        return false;
    }

    //checks if the digit is safe to be placed at the position or not according to sudoku rules.
    private static boolean isSafe(int a[][],int r,int c,int d){
        for(int i=0;i<9;i++){
            if(a[i][c]==d||a[r][i]==d) return false;
        }
        int sr=(r/3)*3,sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(a[i][j]==d) return false;
            }
        }
        return true;
    }

    //prints the sudoku in a neat way
    private static void printSudoku(int a[][]){
        System.out.println();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
