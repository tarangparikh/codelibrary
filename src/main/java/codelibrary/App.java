/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codelibrary;

import codelibrary.structure.SegmentTree;

public class App {
    public static String getGreeting() {
        return "--------------------";
    }

    public static void main(String[] args) {
        SegmentTree segmentTree = new SegmentTree(5);
        segmentTree.build();
        System.out.println(getGreeting());
        segmentTree.modify(4,45);
    }
}