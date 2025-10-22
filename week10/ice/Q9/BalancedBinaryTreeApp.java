
import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTreeApp {

    public static void main(String[] args) {
        // System.out.println(node != -1)
    }

    public static int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = BalancedBinaryTreeApp.dfs(node.getLeft());
        if (left == -1) {
            return -1;
        }

        int right = BalancedBinaryTreeApp.dfs(node.getRight());
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
