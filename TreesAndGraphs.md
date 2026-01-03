# 1. Maximum Depth of Binary Tree
<details>
<summary>Click to view Solution & Explanation</summary>

# Explanation
Given the root of a binary tree, find the length of the longest path from the root to a leaf.
# Code
```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
```
```python
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        left = self.maxDepth(root.left)
        right = self.maxDepth(root.right)
        return max(left, right) + 1
```
