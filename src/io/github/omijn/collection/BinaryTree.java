package io.github.omijn.collection;

class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    BinaryTreeNode(T data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}

public class BinaryTree<T> {

    private BinaryTreeNode<T> root;

    BinaryTree() {
        this.root = null;
    }

    BinaryTree(BinaryTreeNode<T> rootNode) {
        this.root = rootNode;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    protected void inOrder(BinaryTreeNode<T> current) {
        if (current == null) return;
        inOrder(current.leftChild);
        System.out.println(current.data + " ");
        inOrder(current.rightChild);
    }

    protected void preOrder(BinaryTreeNode<T> current) {
        if (current == null) return;
        System.out.println(current.data + " ");
        preOrder(current.leftChild);
        preOrder(current.rightChild);
    }

    protected void postOrder(BinaryTreeNode<T> current) {
        if (current == null) return;
        postOrder(current.leftChild);
        postOrder(current.rightChild);
        System.out.println(current.data + " ");
    }


}
