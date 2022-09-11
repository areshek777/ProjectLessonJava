package lesson_5;

public class Employee {
    private String surname;
    private String name;
    private String middleName;
    private String post;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Employee() {
        this.surname = "Ivanov";
        this.name = "Ivan";
        this.middleName = "Ivanovich";
        this.post = "Engineer";
        this.mail = "ivivan@mailbox.com";
        this.phone = "892312312";
        this.salary = 30000;
        this.age = 25;

    }

    public static void main(String[] args) {
        printAllEmployee();
        printPerson();

    }

    public String toString() {
        return ("surname: " + this.surname + ", name: " + this.name + ", middleName: " + this.middleName + ", post: " + this.post + ", mail: " + this.mail + ", phone: " + this.phone + ", salary: " + this.salary + ", age: " + this.age);
    }

    public static void printAllEmployee() {
        System.out.println(new Employee());
//
    }

    public static void printPerson() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov", "Ivan", "Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov", "Evgeniy", "Vladimirovich", "Manager", "evgeniy@mailbox.com", "892356312", 30000, 28);
        persArray[2] = new Person("Sidorov", "Andrey", "Petrovich", "Director", "andrey@mailbox.com", "892387312", 80000, 56);
        persArray[3] = new Person("Frolov", "Igor", "Vasilievich", "mainIngener", "igor@mailbox.com", "892390712", 75000, 44);
        persArray[4] = new Person("Zheltkov", "Timur", "Ivanovich", "Programmer", "timur@mailbox.com", "892312456", 75000, 35);
        for(int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}
