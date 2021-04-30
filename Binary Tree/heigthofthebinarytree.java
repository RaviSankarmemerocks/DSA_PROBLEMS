//User function Template for Java

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int height(Node node) {
        // code here 
        if(node==null){return 0;}
        return getHeight(node);
    }
    public int getHeight(Node node){
        if(node==null){return 0;}
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        if(left>right){
            return left+1;
        }
        return right+1;
    }
}
