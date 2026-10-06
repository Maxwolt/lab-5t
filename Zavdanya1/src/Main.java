public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. КОНСТРУКТОРИ ===");

        Timespan t1 = new Timespan();
        System.out.print("t1 ( за замовчуванням ): ");
        t1.whatTime();

        Timespan t2 = new Timespan(135);
        System.out.print("t2 (з 135 хв): ");
        t2.whatTime();

        Timespan t3 = new Timespan(90, 1);
        System.out.print("t3 (з 90 хв та 1 год): ");
        t3.whatTime();

        Timespan t4 = new Timespan(t3);
        System.out.print("t4 (копія t3): ");
        t4.whatTime();


        System.out.println("\n=== 2. ADD ===");

        t1.add(1, 45);
        System.out.print("t1 + 1 год 45 хв: ");
        t1.whatTime();

        t1.add(50);
        System.out.print("t1 + 50 хв: ");
        t1.whatTime();

        t1.add(t2);
        System.out.print("t1 + t2: ");
        t1.whatTime();


        System.out.println("\n=== 3. SUBTRACT ===");

        t1.subtract(1, 20);
        System.out.print("t1 - 1 год 20 хв: ");
        t1.whatTime();

        t1.subtract(40);
        System.out.print("t1 - 40 хв: ");
        t1.whatTime();

        t1.subtract(t2);
        System.out.print("t1 - t2: ");
        t1.whatTime();

        System.out.print("Спроба відняти 5 годин від t1: ");
        t1.subtract(5, 0);
        System.out.print("Стан t1 після невдалого віднімання: ");
        t1.whatTime();


        System.out.println("\n=== 4. ПЕРЕТВОРЕННЯ ТА МАСШТАБУВАННЯ ===");

        Timespan t5 = new Timespan(45, 2);
        System.out.print("Об'єкт t5: ");
        t5.whatTime();

        System.out.println("Загальна кількість хвилин у t5: " + t5.getTotalMinutes() + " хв");
        System.out.println("Загальна кількість годин у t5: " + t5.getTotalHours() + " год");

        t5.scale(2);
        System.out.print("t5 після scale(2): ");
        t5.whatTime();
    }
}