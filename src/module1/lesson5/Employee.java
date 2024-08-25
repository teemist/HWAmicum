package module1.lesson5;

public class Employee {
    private String fio;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fio, String post, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник:\n" +
                "ФИО: " + fio + "\n" +
                "Должность: " + post + "\n" +
                "Почта: " + email + "\n" +
                "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age;
    }

    public static void older40() {
        Employee[] employees = new Employee[]{
                new Employee("Антонов Антон Антонович", "Сис.админ",
                        "sisadmin@gmail.com", "89991234567",
                        32450, 24),
                new Employee("Иванов Геннадий Антонович", "Сис.админ",
                        "sisadmin@gmail.com", "89991234567",
                        32450, 42),
                new Employee("Иванов Игорь Антонович", "Сис.админ",
                        "sisadmin@gmail.com", "89991234567",
                        32450, 51),
                new Employee("Антонов Антон Антонович", "Сис.админ",
                        "sisadmin@gmail.com", "89991234567",
                        32450, 39),
                new Employee("Антонов Антон Антонович", "Сис.админ",
                        "sisadmin@gmail.com", "89991234567",
                        32450, 24)
        };
        for (Employee emp : employees) {
            if (emp.age >= 40) {
                System.out.println(emp);
            }
        }
    }
}
