public class Test {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(6);
        tree.insert(2);
        tree.insert(10);
        tree.insert(14);
        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
    }
}
