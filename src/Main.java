public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1 \n");
        int savings = 15000;
        int total = 0;
        int m1 = 1;
        while (total < 2_459_000) {
            m1++;
            total = total + total / 100;
            total = total + savings;
            if (m1 % 1 == 0) ;
            {
                System.out.println("Месяц " + m1 + ", сумма накоплений равна " + total + " рублей");
            }
        }

        // Задание 2
        System.out.println("Задание 2 \n");
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println("");

        for (int n1 = 10; n1 >= 1; n1--) {
            System.out.print(n1 + " ");
        }


        // Задание 3
        System.out.println("\nЗадание 3 \n");
        int y = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 2022;
        int yearPeriod = 1;
        int resultPerYear = y / 1000 * birthRate / deathRate;
        while (yearPeriod <= 10) {
            int yearCount = year + yearPeriod;
            int result = resultPerYear * yearPeriod;
            int r = result * yearPeriod + y;
            System.out.println("Год " + yearCount + ", численность населения составляет " + r);
            yearPeriod++;
        }

        // Задание 2.1
        System.out.println("Задание 2.1 \n");
        int vasyaSavings = 15000;
        int month = 1;
        while (vasyaSavings <= 12_000_000) {
            vasyaSavings *= 1.07;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + vasyaSavings);
            month++;
        }

        // Задание 2.2
        System.out.println("Задание 2.2 \n");
        int vasyaSavings1 = 15000;
        int month1 = 1;
        while (vasyaSavings1 <= 12_000_000) {
            vasyaSavings1 *= 1.07;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " , сумма накоплений равна " + vasyaSavings1);
            }
            month1++;

        }

        // Задание 2.3
        System.out.println("Задание 2.3 \n");
        int vasyaSavings2 = 15000;
        int month2 = 1;
        while (vasyaSavings2 <= 12_000_000) {
            vasyaSavings2 *= 1.07;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + vasyaSavings2);
            }
            month2++;
        }

        // Задание 2.4
        System.out.println("Задание 2.4 \n");
        int firstFriday = 7;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. необходимо подготовить отчет.");
        }

        // Задание 3.1
        System.out.println("Задание 3.1 \n");
        int yearNow = 2022;
        int oldYear = yearNow - 200;
        int newYear = yearNow + 100;
        for (int i = oldYear; i < newYear; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        // Задание 3.2
        System.out.println("Задание 3.2 \n");
        int i=0;
        for(;i<=10;i++) {
            System.out.println(" 2 х "+i + " = " + 2 * i);

        }
    }
}