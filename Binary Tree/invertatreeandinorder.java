/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        root=invert(root);
        inordertraversal(root);
        return root;
    }
    public TreeNode invert(TreeNode root){
        if(root==null){return null;}
        TreeNode l=invert(root.left);
        TreeNode r=invert(root.right);
        root.left=r;
        root.right=l;
        return root;
    }
    public void inordertraversal(TreeNode root){
        if(root==null){return;}
        inordertraversal(root.left);
        System.out.print(root.val);
        inordertraversal(root.right);
    }
}
