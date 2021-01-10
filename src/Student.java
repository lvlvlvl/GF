public class Student extends Teacher {
    //学生姓名，学号，年龄，专业——私有属性
    private String stuName;
    private int stuNumber;


    public String getStuName() {
        return this.stuName;
    }

    public void setStuNumber(String name) {
        this.stuName = name;
    }

    public int getStuNumber() {
        return this.stuNumber;
    }

    public void setStuNumber(int number) {
        this.stuNumber = number;
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.stuName = "绿绿";
        stu.stuNumber = 2018108826;
        System.out.println("名字为："+stu.stuName);
        System.out.println("学号为："+stu.stuNumber);
    }
}