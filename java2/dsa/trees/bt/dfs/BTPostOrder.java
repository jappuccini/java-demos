package java2.dsa.trees.bt.dfs;

import java2.dsa.trees.bt.BinaryNode;
import java2.dsa.trees.bt.DataSample;

public class BTPostOrder {

  public static void main(String[] args) {
    BTPostOrder.traverse(DataSample.getExampleBinaryTree());
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
    walk(node.right);
    System.out.print(node.value + " ");
  }
}
