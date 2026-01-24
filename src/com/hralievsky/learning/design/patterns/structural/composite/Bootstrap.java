package com.hralievsky.learning.design.patterns.structural.composite;


/*Requirements - File System

Create a file system structure that represents both files and directories. The system should:

    1. Define a common interface for all file system entries with methods:
    - getName() - returns the entry name
    - getSize() - returns size in bytes (for files: actual size, for directories: sum of all contents)
    - getPath() - returns full path string
    - search(String keyword) - finds entries matching the keyword
  2. Implement a File class that:
        - Has a name and size in bytes
    - Has extension (e.g., ".txt", ".jpg")
    - Cannot contain other entries
  3. Implement a Directory class that:
        - Has a name
    - Can contain any number of file system entries (files or other directories)
    - Supports adding and removing entries
    - Size is calculated as the total size of all contained entries
    - Search looks through all contained entries recursively
  4. Demonstrate the pattern with a bootstrap class that creates:
     - A root directory with several files
    - Subdirectories within directories
    - Nested directory structures (e.g., /projects/java/src/main)
    - Shows operations like calculating total size of a directory tree
    - Shows searching for files across nested directories

Key constraint: Operations should work uniformly whether performed on a single file or an entire directory tree - the client shouldn't need different
logic for files vs directories.*/

public class Bootstrap {

    public static void main(String[] args) {
        File one = new File("One", 1);
        File two = new File("Two", 2);
        File three = new File("Three", 3);
        File four = new File("Four", 4);
        File five = new File("Five", 5);
        File six = new File("Six", 6);
        File seven = new File("Seven", 7);
        File eight = new File("Eight", 8);

        Directory root = new Directory("root", "/");
        Directory dirB = new Directory("B", "/b");
        Directory dirC = new Directory("C", "/c");
        Directory dirD = new Directory("D", "/d");


        dirB.addChild(two);
        dirB.addChild(three);
        dirD.addChild(four);
        dirD.addChild(five);
        dirD.addChild(six);
        dirB.addChild(dirD);

        dirC.addChild(seven);
        dirC.addChild(eight);

        root.addChild(one);
        root.addChild(dirB);
        root.addChild(dirC);

        System.out.println("Total size: expected - 36, actual - " + root.getSize());
        System.out.println("Furthest file path: \n" + four.getPath() + "\n" + five.getPath() + "\n" + six.getPath());
        System.out.println("Dir D size: expected - 15, actual - " + dirD.getSize());
        System.out.println("File one path: expected \"/One\", actual - " + one.getPath());
        System.out.println("File two path: expected \"/B/Two\", actual - " + two.getPath());
    }
}
