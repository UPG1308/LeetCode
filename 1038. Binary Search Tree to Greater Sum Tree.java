Recursion :

class Solution {
    
    private int pre = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        if(root.right != null) bstToGst(root.right);
        pre = root.val = pre + root.val;
        
        if(root.left != null) bstToGst(root.left);
        
        return root;
        
    }
}


Iterative :

class Solution {   
    public TreeNode bstToGst(TreeNode root) {
        int sum = 0;
        
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
       
        while(!stack.isEmpty() || curr != null)
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.right;
            }
            
            curr = stack.pop();
            sum += curr.val;
            curr.val =sum;
            curr = curr.left;
        }
        return root;
    }
}
    


