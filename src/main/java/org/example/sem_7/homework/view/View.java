package org.example.sem_7.homework.view;

import org.example.sem_7.homework.data.Logging;
import org.example.sem_7.homework.data.Komplex;
import org.example.sem_7.homework.data.Rational;
import org.example.sem_7.homework.dataService.Calculate;


import java.util.Scanner;

public class View {
    Logging logging;

    public View() {
        this.logging = new Logging();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите с чем работать(1, 2, 3 или 4 для выхода): " +
                    "\n" + "1.Рациональные числа." + "\n" + "2.Комплексные числа." + "\n" + "3. Посмотреть логирование.");
            int n = scanner.nextInt();
            switch (n) {
                case (1) -> doingRac();
                case (2) -> doingKomplex();
                case (3) -> logging.login();
                default -> {
                    System.out.println("Выходим из программы");
                    flag = false;
                }
            }
        }
    }

    private void doingRac() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Давайте введем первое число: ");
            Rational rational1 = creatRacional();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Еще раз попробуем?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Ну тогда досвидания!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Давайте введем второе число: ");
            Rational rational2 = creatRacional();
            Calculate calculat = new Calculate();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", rational1, rational2, calculat.sum(rational1, rational2));
                    logging.saveLogin("LOG: использован метод sum(Rational, Rational) " + calculat.sum(rational1, rational2).toString());
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", rational1, rational2, calculat.raznoct(rational1, rational2));
                    logging.saveLogin("LOG: использован метод raznoct(Rational, Rational) " + calculat.raznoct(rational1, rational2).toString());
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", rational1, rational2, calculat.multy(rational1, rational2));
                    logging.saveLogin("LOG: использован метод multy(Rational, Rational) " + calculat.multy(rational1, rational2).toString());
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", rational1, rational2, calculat.div(rational1, rational2));
                    logging.saveLogin("LOG: использован метод div(Rational, Rational) " + calculat.div(rational1, rational2).toString());
                }
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Ну тогда досвидания!");
                flag = false;
            }
        }

    }

    private void doingKomplex() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Давайте введем первое число: ");
            Komplex number1 = creatkomplex();
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Еще раз попробуем?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Ну тогда досвидания!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Давайте введем второе число: ");
            Komplex number2 = creatkomplex();
            Calculate calculat = new Calculate();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", number1, number2, calculat.sum(number1, number2));
                    logging.saveLogin("LOG: использован метод sum(Komplex, Komplex) " + calculat.sum(number1, number2).toString());
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", number1, number2, calculat.raznoct(number1, number2));
                    logging.saveLogin("LOG: использован метод raznoct(Komplex, Komplex) " + calculat.raznoct(number1, number2).toString());
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", number1, number2, calculat.multy(number1, number2));
                    logging.saveLogin("LOG: использован метод multy(Komplex, Komplex) " + calculat.multy(number1, number2).toString());
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", number1, number2, calculat.div(number1, number2));
                    logging.saveLogin("LOG: использован метод div(Komplex, Komplex) " + calculat.div(number1, number2).toString());
                }
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Ну тогда досвидания!");
                flag = false;
            }
        }

    }


    private Rational creatRacional() {
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        int tmp2 = 1;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите числитель: ");
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите знаменатель: ");
                int n1 = scanner.nextInt();
                if (n1 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n1;
                    flag = false;
                    flag2 = false;
                }
            }

        }
        return new Rational((double) tmp, (double) tmp2);
    }

    private Komplex creatkomplex() {
        Scanner scanner = new Scanner(System.in);
        double tmp = 1.0;
        double tmp2 = 1.0;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите первое слагаемое(например - 3,5): ");
                double n = scanner.nextDouble();
                if (n <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите второе слагаемое(например - 12,7): ");
                double n3 = scanner.nextDouble();
                if (n3 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n3;
                    flag = false;
                    flag2 = false;
                }
            }

        }
        return new Komplex((double) tmp, (double) tmp2);
    }

}
