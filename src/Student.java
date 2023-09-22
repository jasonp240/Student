public class Student {
    private String name;
    private int grade;

    public Student(String n, int g) {
        name = n;
        grade = g;
    }

    public void introduce() {
        System.out.println("Hello my name is " + name + " and I am a student!");
    }

    public void studentInfo() {
        System.out.print("I am in grade " + grade);
    }

}
