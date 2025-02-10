package java2.dsa.trees.bt.dfs;

import java2.dsa.trees.bt.BinaryNode;
import java2.dsa.trees.bt.DataSample;

public class BTInOrder {

    public static void main(String[] args) {
        BTInOrder.traverse(DataSample.getExampleBinaryTree());
    }

    public static void traverse(BinaryNode root) {
        walk(root);
        System.out.println();
    }

    public static void walk(BinaryNode node) {
        if (node == null) {
            return;
        }
        walk(node.left);
        System.out.print(node.value + " ");
        walk(node.right);
    }
}