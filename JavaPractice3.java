import java.util.ArrayList;
import java.util.List;

public class JavaPractice3 {

    public static void main(String[] args){
        List<Human> students = new ArrayList<Human>();

        students.add(new Student());
        students.add(new Student("Bob", 20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Carter", 1));
        students.add(new Student("", 15));

        System.out.println();

        for(Human stu : students){
            System.out.println(stu.getName() + " " + stu.getAge());
        }
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

class Student extends Human {
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
            System.out.println("age must be 10 or more, setting to 10");
            this.age = DEFAULT_AGE;
        }
        else {
            this.age = age;
        }
    }

    private void setAge() {
        this.age = DEFAULT_AGE;
    }

    @Override
    public int getAge() {
        return age;
    }
}
