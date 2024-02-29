public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if ( p == null && q == null ){
            return true;
        }

        if ( p == null || q == null ){
            return false;
        }

        boolean leftCheck = isSameTree(p.left, q.left);
        boolean rightCheck = isSameTree(p.right, q.right);
        return p.val == q.val && leftCheck && rightCheck;

    }

}
