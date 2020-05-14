class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i:preorder)
        {
            root=insertIntoBST(root,i);
        }
        return root;
    }
    
    public TreeNode insertIntoBST(TreeNode root,int i)
    {
        if(root==null)
        {
            return new TreeNode(i);
        }
        
        if(i<root.val)
        {    
            root.left=insertIntoBST(root.left,i);          
        }else{      
            root.right=insertIntoBST(root.right,i);      
        }
        
    return root;    
    }
}