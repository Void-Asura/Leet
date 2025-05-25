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
class Solution 
{
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        // if(root==null)
        // return 0;

        // int S=0;
        // if(root.val>=low&&root.val<=high)
        // S+=root.val;
        // S+=rangeSumBST(root.left,low,high);
        // S+=rangeSumBST(root.right,low,high);

        // return S;

        if (root == null) return 0;
        
        if (root.val < low) {
            return rangeSumBST(root.right, low, high); // Skip left subtree
        } else if (root.val > high) {
            return rangeSumBST(root.left, low, high); // Skip right subtree
        } else {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }

    }
}