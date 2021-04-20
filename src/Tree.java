public class Tree<E extends Comparable<E>> {

    private TreeNode<E> root;
    private int size;

    private class TreeNode<E> {
        private E element;
        private TreeNode<E> left;
        private TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
            left = null;
            right = null;
        }
    }

    public Tree() {
        root = null;
        size = 0;
    }

    public Tree(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            insert(elements[i]);
        }
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = new TreeNode<>(e);
            else
                parent.right = new TreeNode<>(e);
        }
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    protected void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + "  ");
        inorder(root.right);
    }

    protected void preorder() {
        preorder(root);
    }
    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    protected void postorder() {
        postorder(root);
    }
    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + "  ");
    }
}
