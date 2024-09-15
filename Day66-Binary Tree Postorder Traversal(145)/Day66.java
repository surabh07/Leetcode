class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        
        if (root == null) {
            return output;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            output.add(0, current.val); // Add to the beginning of the list
            
            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }

        return output;
    }
}
