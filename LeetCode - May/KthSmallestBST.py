class Solution:
    def kthSmallest(self, root: TreeNode, k: int) -> int:
        
        stack = []

        while(root is not  None or len(stack) is not 0):
            while(root is not None):
                stack.append(root)
                root = root.left
            
            
            root = stack.pop()
            k-=1
            if k == 0: 
                return root.val
            root = root.right
        return -1