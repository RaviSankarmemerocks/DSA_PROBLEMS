class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> paths=new ArrayList<>();
        boolean[][] visited=new boolean[n][n];
        dfs(m,n,visited,0,0,"",paths,false,false,false,false);
        if(paths.size()==0){
            paths.add("-1");
        }
        return paths;
    }
    public static void dfs(int[][]m,int n,boolean[][]visited,int r,int c,String s,ArrayList<String> paths,boolean isup,boolean isdown,boolean isleft,boolean isright){
        if(r<0||r>=n||c<0||c>=n||visited[r][c]||m[r][c]==0){
            return ;
            
        }
        if(r==n-1&&c==n-1){
            if(isup){
            s+='U';
        }else if(isdown){
            s+='D';
        }else if(isleft){
            s+='L';
        }else if(isright){
            s+='R';
        }
            paths.add(s);
            return;
        }
        
        visited[r][c]=true;
        if(isup){
            s+='U';
        }else if(isdown){
            s+='D';
        }else if(isleft){
            s+='L';
        }else if(isright){
            s+='R';
        }
        
        dfs(m,n,visited,r+1,c,s,paths,false,true,false,false);
        dfs(m,n,visited,r,c+1,s,paths,false,false,false,true);
        dfs(m,n,visited,r-1,c,s,paths,true,false,false,false);
        dfs(m,n,visited,r,c-1,s,paths,false,false,true,false);
        
        visited[r][c]=false;
    }
}
