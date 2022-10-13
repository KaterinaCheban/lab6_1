package ad211.cheban;

public class Student implements Person{
    private String name ;
    private String surname;
    private int age;
    private String group;
    private int number;
    public Student(String name, String surname, int age, String group, int number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.number = number;
    }

    //getter/setter
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public int getNumber() {
        return number;
    }
    public void printInfo() { // метод виводу інформації
        System.out.println("Студент групи " + getGroup() + " " + getSurname() + ", " + getName() +
                ", вік: " + getAge() + ". Номер студентського квитка :" + getNumber());
    }
}
