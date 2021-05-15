class Node
{
    int dat;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class Solution
{
    
    int b=0;
	public int longestConsecutive(Node root)
        {
         //add code here.
         if(root==null){
             return 0;
         }
        int ans= Math.max(dfs_lcp(root.left,root.data,1),dfs_lcp(root.right,root.data,1));
        return ans==1?-1:ans;
            
        }
        public int dfs_lcp(Node root,int val,int count){
            if(root==null){
                return count;
            }
            if(root.data==val+1){
                return Math.max(dfs_lcp(root.left,root.data,count+1),dfs_lcp(root.right,root.data,count+1));
                
            }
            b=Math.max(dfs_lcp(root.left,root.data,1),dfs_lcp(root.right,root.data,1));
            return Math.max(count,b);
            
        }
}

