import javax.swing.*;
import java.lang.invoke.StringConcatException;
import java.util.ArrayList;
import java.util.List;

public class Javatest2 {

    public static void main(String[] args) {

        BinaryTree<Integer> intTree = new BinaryTree<>();
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        System.out.println();

        for (int v : values) intTree.insert(v);
        intTree.inorder(); // 20 30 40 50 60 70 80

        List<Human> students = new ArrayList<Human>();

        students.add(new Student());
        students.add(new Student("Bob",20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Carter", 1));
        students.add(new Student("", 15));

        System.out.println();

        for(Human stu : students){
            System.out.println(stu.getName() + " " + stu.getAge());
        }

        System.out.println();

        BinaryTree<String> strTree = new BinaryTree<>();
        String[] words = {"banana", "apple", "cherry"};
        for (String w : words) strTree.insert(w);
        strTree.inorder(); // apple banana cherry

    }

}

abstract class Human {
    protected String name;
    protected static final String DEFAULT_NAME = "DEFAULT";

    protected Human(String name){
        setName(name);
    }

    protected Human(){
        this.name = DEFAULT_NAME;
    }

    protected void setName(String name){
        if(name == null || name.isBlank()){
            this.name = DEFAULT_NAME;
        }
        else{
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public abstract int getAge();
}

class Student extends Human{
    private int age;
    private static final int DEFAULT_AGE = 10;

    public Student(String name, int age){
        super(name);
        setAge(age);
    }

    public Student(){
        super();
        setAge();
    }

    private void setAge(int age) {
        if(age < 10){
            this.age = DEFAULT_AGE;
        }
        else {
            this.age = age;
        }
    }

    private void setAge() {
            this.age = DEFAULT_AGE;
    }

    public int getAge() {
        return age;
    }

}


class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    BinaryTree() {
        root = null;
    }

    void insert(T data) {
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            return new Node<>(data);
        }
        int cmp = data.compareTo(root.data);
        if (cmp < 0) {
            root.left = insertRec(root.left, data);
        } else if (cmp > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    boolean search(T data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node<T> root, T data) {
        if (root == null) return false;
        int cmp = data.compareTo(root.data);
        if (cmp == 0) return true;
        return cmp < 0 ? searchRec(root.left, data) : searchRec(root.right, data);
    }
}

