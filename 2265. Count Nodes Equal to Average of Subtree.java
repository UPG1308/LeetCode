class Solution
{
    class Node
    {
        int sum;
        int nodecount;
        
        Node(int sum,int nodecount)
        {
            this.sum = sum;
            this.nodecount = nodecount;
        }
    }
    
    Node dummyNode = new Node(0,0);
    
    int ans = 0;
    
    private Node postOrder(TreeNode root)
    {
        if(root == null) return dummyNode;
        
        Node left = postOrder(root.left);
        Node right = postOrder(root.right);
        
        Node curr = new Node(left.sum + right.sum + root.val, left.nodecount + right.nodecount + 1);
        int avg = curr.sum/curr.nodecount;
        if(avg == root.val) ans++;
        return curr;
    }
    
    
    public int averageOfSubtree(TreeNode root)
    {
        postOrder(root);
        return ans;
    }
}
