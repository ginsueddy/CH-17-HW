package com.company;

public class Main {

    /*
        4.
            PreO: 3 5 1 2 4 6
            IO: 1 5 3 4 2 6
            PostO: 1 5 4 6 2 3

        5.
            PreO: 19 47 23 -2 55 63 94 28
            IO: 23 47 55 -2 19 63 94 28
            PostO: 23 55 -2 47 28 94 63 19

        6.
            PreO: 2 1 7 4 3 5 6 9 8
            IO: 2 3 4 5 7 1 6 8 9
            PostO: 3 5 4 7 8 9 6 1 2

        8.
            public void printPostorder() {
                System.out.print("postorder:");
                printPostorder(overallRoot);
                System.out.println();
            }

            private void printPostorder(IntTreeNode root) {
                if (root != null) {
                    printPostorder(root.left);
                    printPostorder(root.right);
                    System.out.print(" " + root.data);
                }
            }
        11.
            public int size() {
                return size(overallRoot);
            }

            private int size(IntTreeNode root) {
                if (root == null) {
                    return 0;
                }
                else {
                    return 1 + size(root.left) + size(root.right);
                }
            }

        16.
            IO traversal will wexamine the elements in a sorted order.

     */

    public static void main(String[] args) {
	// write your code here
    }
}
