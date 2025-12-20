package arithmetic.tree;

public class TreeNodeSum {
    public static void main(String[] args) {
        boolean b = new TreeNodeSum().checkTree(new TreeNode(22, new TreeNode(4), new TreeNode(6)));
        System.out.println("b = " + b);

    }

    public static boolean checkTree(TreeNode root) {
        return root.left.val+root.right.val==root.val;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
