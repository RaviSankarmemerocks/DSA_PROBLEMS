package com.company;

import java.util.ArrayList;

public class RatinMaze {
    public static void main(String args[]){
         int [][] maze=  {{1,1,1,1,1},
                          {1,1,1,1,1},
                          {1,1,1,1,1},
                          {1,1,1,1,1},
                          {1,1,1,1,1}
         };
         //DDDDRRRURD
        int n=5;
//DDDRUUURDDDRUUURDDD
        int [][] track_mat=new int[maze.length][maze[0].length];
        ArrayList<String> dir=new ArrayList<>();
        Dfs(track_mat,maze,0,0,dir,new ArrayList<>(),false,false,false,false);
        System.out.println(dir);
        return;
    }
    public static void Dfs(int[][] track_mat,int[][] maze,int row,int col,ArrayList<String>dir,ArrayList<Character> d,boolean isUp,boolean isDown,boolean isLeft,boolean isRight){
        if(row<0||row>=maze.length||col<0||col>=maze[0].length||maze[row][col]==0){
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1){
            if(isUp){
                d.add('U');
            }else if(isDown){
                d.add('D');
            }else if(isLeft){
                d.add('L');
            }
            else if(isRight){
                d.add('R');
            }
            if(d.size()>0) {
                String s="";
                for(char c:d){
                    s+=c;
                }
                dir.add(s);
                s="";

            }
            System.out.println(d);
           // d.remove(d.size()-1);
            return;


        }

        if(isUp){
            d.add('U');
        }else if(isDown){
            d.add('D');
        }else if(isLeft){
            d.add('L');
        }
        else if(isRight){
            d.add('R');
        }
        maze[row][col]=0;
        Dfs(track_mat,maze, row-1, col, dir, d, true, false,false,false);

        Dfs(track_mat,maze, row+1, col, dir, d, false, true,false,false);


        Dfs(track_mat,maze, row, col-1, dir, d, false, false,true,false);


        Dfs(track_mat,maze, row, col+1, dir, d, false, false,false,true);
        maze[row][col]=1;
        //if(d.size()>0) {
            d.remove(d.size() - 1);
        //}


    }
}

