# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: TreeNode) -> TreeNode:
        def inorder_trav(node):
            if not node:
                return []
            return inorder_trav(node.left)+[node.val]+inorder_trav(node.right)
        sorted_values = inorder_trav(root)
        def build_balanced_bst(values):
            if not values:
                return None
            mid = len(values)//2
            root = TreeNode(values[mid])
            root.left = build_balanced_bst(values[:mid])
            root.right = build_balanced_bst(values[mid+1:])
            return root
        return build_balanced_bst(sorted_values)
        