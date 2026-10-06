public class Main {
    public static void main(String[] args) {

        Person student1 = new Student("Шевченко", "Тарас", 20, "КН-21", "KB12345678");
        Person student2 = new Student("Коваленко", "Олена", 19, "ІПЗ-12", "KB87654321");

        Person lecturer1 = new Lecturer("Мельник", "Іван", 45, "Комп'ютерних наук", 25000.0);
        Person lecturer2 = new Lecturer("Петренко", "Ольга", 38, "Програмної інженерії", 22000.0);

        Person person1 = new Person("Сидоренко", "Андрій", 30);

        Person[] people = new Person[] {
                person1,
                student1,
                student2,
                lecturer1,
                lecturer2
        };

        System.out.println("=== Список осіб ===");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}