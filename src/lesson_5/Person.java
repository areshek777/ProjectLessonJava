package lesson_5;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String post;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Person(String surname, String name, String middleName, String post, String mail, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return ("surname: " + this.surname + ", name: " + this.name + ", middleName: " + this.middleName + ", post: " + this.post + ", mail: " + this.mail + ", phone: " + this.phone + ", salary: " + this.salary + ", age: " + this.age);
    }

    public String getSurname() {
            return this.surname;
    }

    public String setSurname(String surname) {
        return this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
