public class DiameterOfBinaryTree {

    private int maxH;

    public int helper(TreeNode root){
        if ( root == null ){
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        maxH=  Math.max(maxH, left+right);

        return Math.max(left,right) +1;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        maxH = 0;
        helper(root);
        return maxH;

    }
}
