package io.github.omijn.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree<Integer> binaryTree;

    BinaryTreeTest() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        binaryTree = new BinaryTree<>(root);
        BinaryTreeNode<Integer> n1 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> n2 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> n3 = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> n4 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> n5 = new BinaryTreeNode<>(16);
        BinaryTreeNode<Integer> n6 = new BinaryTreeNode<>(10);
        root.leftChild = n1;
        root.rightChild = n2;
        n1.leftChild = n3;
        n1.rightChild = n4;
        n3.leftChild = n5;
        n5.leftChild = n6;
    }

    @Test
    void inOrder() {
        binaryTree.inOrder();
    }

    @Test
    void preOrder() {
        binaryTree.preOrder();
    }

    @Test
    void postOrder() {
        binaryTree.postOrder();
    }
}