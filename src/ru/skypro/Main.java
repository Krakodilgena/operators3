package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");


            //Задание 2
            int clientDeviceYear = 2016;
            if (clientOS == 0 ) {
                if (clientDeviceYear <= 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите нынешнюю версию для iOS");
                }
            } else {
                if (clientDeviceYear <= 2015 ) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите нынешнюю версию для Android");

                    //Задание 3
                    int year = 2022;
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.println(year + "Является високосным");
                    } else {
                        System.out.println(year + "Не является високосным");

                        //Задание 4
                        int deliveryDistance = 95;
                        int deliveryDays = 1;
                        if (deliveryDistance <= 20) {
                            System.out.println("Один день");
                        } else if (deliveryDistance > 20 && deliveryDistance <= 40) {
                            System.out.println("Два дня");
                        } else if (deliveryDistance > 40 && deliveryDistance <= 60) {
                            System.out.println("Три дня");
                        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                            System.out.println("Четыре дня");
                        }

                        if (deliveryDistance > 100) {
                            System.out.println("У нас появилась проблема");
                            return;
                        }

                        if (deliveryDistance > 20) {
                            deliveryDays++;
                        }

                        System.out.println("Дней для доставки: " + deliveryDays);

                        //Задание 5
                        int monthOfYear = 9;
                        switch (monthOfYear) {
                            case 12:
                            case 1:
                            case 2:
                                System.out.println("Зима");
                                break;
                            case 3:
                            case 4:
                            case 5:
                                System.out.println("Весна");
                                break;
                            case 6:
                            case 7:
                            case 8:
                                System.out.println("Лето");
                                break;
                            case 9:
                            case 10:
                            case 11:
                                System.out.println("Осень");
                                break;
                            default:
                                System.out.println("Некоректный номер");
                        }
                    }
                }
            }


        }
    }
}
    }
}
