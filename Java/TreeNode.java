package Java;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static int minDepth(TreeNode root) {
        int depth=0;
        if(root!=null) {
          int leftDepth = minDepth(root.left);
          int rightDepth = minDepth(root.right);
          System.out.println("left depth is "+leftDepth);
          System.out.println("right depth is "+rightDepth);
          if (root.left == null || root.right == null) {
            return leftDepth + rightDepth + 1;
          }
          depth = Math.min(leftDepth, rightDepth)+1;
        }
        return depth;
    }

    public static void main(String[] args) {

//      TreeNode root = new TreeNode(3);
//      root.left = new TreeNode(9);
//      root.right = new TreeNode(20);
//      root.right.left = new TreeNode(15);
//      root.right.right = new TreeNode(7);
      TreeNode root = new TreeNode(2);
      root.left=new TreeNode(3);
      root.left.left=new TreeNode(4);
      root.left.left.left=new TreeNode(5);
      root.left.left.left.left=new TreeNode(6);
      System.out.println(minDepth(root));
    }
}