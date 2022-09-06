public class Main {
    public static void main(String[] args) {
        System.out.println(" Блок 1 Задание 1");
        for (int i = 1; i < 10; i++) {
            System.out.println(" Итерация цикла " + i);
        }

        System.out.println("Блок 1 Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println("Блок 1 Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" Итерация цикла четных чисел " + i);
        }
        System.out.println(" Блок 1 Задание 4 ");
        for (int i = 10; i >= -10; i--) {
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println(" Блок 2 Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }
        System.out.println(" Блок 2 Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();



          System.out.println( " Блок 2 Задание 3 ");
            int i =1;
        System.out.print( i + " " );
        for ( i = 2; i <=512; i = i * 2) {
            System.out.print(i + " ");
        }
            System.out.println( );


        System.out.println( " Блок 3 Задание 1");
        int saccumulation = 29000;
        int total = 0;
        for ( int x = 1; x <=  12; x++) {
            total = total + saccumulation;
            System.out.println(" Месяц " + x + " сумма накоплений равна " + total + " рублей ");
        }
        System.out.println( " Блок 3 Задание 2");
        double total1 = 0;
        double percent = 0.01;
        for ( int x = 1; x <= 12; x++) {
            total1 = (total1 +saccumulation) * ( 1 + percent)  ;
            System.out.println( " Месяц " + x + "  сумма накоплений равна " + total1 + " рублей " );

        }


            }
        }


