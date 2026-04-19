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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        if(root.left!=null) {
            List<Integer> leftRes = inorderTraversal(root.left);
            if(leftRes != null)
            result.addAll(leftRes);
        }
        result.add(root.val);
        if(root.right != null) {
            List<Integer> rightRes = inorderTraversal(root.right);
            if(rightRes != null)
            result.addAll(rightRes);
        }
        return result;
    }
}