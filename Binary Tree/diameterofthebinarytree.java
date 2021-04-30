  class Node{
   int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Solution 
{
    //Function to return the diameter of a Binary Tree.
    int diameter=0;
    int diameter(Node root) {
        // Your code here
        dfs(root);
        
        return diameter;
    }
    public int dfs(Node root){
        if(root==null){
            return 0;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        diameter=Math.max(diameter,left+right+1);
        if(left>right){
            return left+1;
        }
        return right+1;
    }
}
