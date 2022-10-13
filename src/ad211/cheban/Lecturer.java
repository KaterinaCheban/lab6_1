package ad211.cheban;

public class Lecturer implements Person{
    private  String name ; // поля
    private  String surname;
    private  int age;
    private String department;
    private int salary;

    public Lecturer(String name, String surname, int age, String department, int salary) { // конструктор
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.salary = salary;
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
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    // гетери та сетери
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void printInfo() { // метод виводу інформації
        System.out.println("Викладач кафедри " + getDepartment() + ", " + getSurname() + ", " + getName() + ", " + getAge() + ". Зарплата: " + getSalary());
    }
}
