class Solution {
      public int sumEvenGrandparent(TreeNode root) {
        return helper(root, 1, 1);
    }

    public int helper(TreeNode node, int p, int gp) {
        if (node == null) return 0;
        return helper(node.left, node.val, p) + helper(node.right, node.val, p) + (gp % 2 == 0 ? node.val : 0);
    }
}


//OR  

//  class Solution {
//     public int sumEvenGrandparent(TreeNode root) {
//     return helper(root,null,null); //Perform DFS
// }    
//   private int helper(TreeNode current,TreeNode parent,TreeNode grandParent){
//     int sum=0;
//     if(current==null) return 0;
//     if(grandParent!=null && grandParent.val % 2 == 0){
//          sum+=current.val;
//     }
//     sum+= helper(current.left,current,parent);
//     sum+=helper(current.right,current,parent);
//     return sum;

// }
//  }
