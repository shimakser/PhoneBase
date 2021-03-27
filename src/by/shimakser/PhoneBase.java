package by.shimakser;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBase {

    private static final Scanner numOfPoint = new Scanner(System.in);
    private static final Scanner search = new Scanner(System.in);

    private static void Actions() {
        System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:\n"
                + "1-Сведение о клиентах.\n"
                + "2-Сведения о клиентах в алфавитном порядке.\n"
                + "3-Сведения о клиентах, у которых время внутригородских разговоров превышает заданное.\n"
                + "4-Сведения о клиентах, которые пользовались междугородной.\n"
                + "5-Поиск по фамилии.\n"
                + "\t0-Список действий.");
    }

    public static void main(String[] args) {
        Functional base = new Functional();
        base.addUser(new User("Ivanov", "Ivan", "Ivanovich",
                "Lenina street, 15", 1234432156788765L,
                10, 3.7, 3954, 0));

        base.addUser(new User("Belova", "Tatyana", "Ivanovna",
                "Moskovskei avenue, 13", 2424427462764482L,
                7, 2.5, 1154.656, 34.535));

        base.addUser(new User("Sergeev", "Denis", "Grigorievich",
                "Ludnikova street, 18", 2345657829389287L,
                5, 4.93, 5445, 0));

        base.addUser(new User("Novikova", "Irina", "Vladimirovna",
                "microdistrict bilevo, 24", 5287981365752526L,
                25, 3.1, 458, 855.672));

        base.addUser(new User("Popov", "Andrey", "Vyacheslavovich",
                "Stroiteley avenue, 31", 7268275340360028L,
                15, 6.56, 1656, 3.456));

        base.addUser(new User("Petrova", "Anastasiya", "Igorevna",
                "Micro-district Yug-5, 24B", 4572784628233274L,
                10, 7.48, 4561, 0));

        base.addUser(new User("Ilyin", "Dmitry", "Petrovich",
                "Gagarina street, 4", 4072728628403274L,
                4, 5.32, 3656, 0));

        Actions();
        int input = numOfPoint.nextInt();
        String username;
        while (input != 9) {
            switch (input) {
                case 0:
                    Actions();
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                case 1:
                    System.out.println("\n\tСписок клиентов:");
                    User point1 = new User();
                    try {
                        for (int i = 0; i < point1.ID; i++) {
                            System.out.println(base.sortList.get(i));
                        }
                    } catch (java.lang.IndexOutOfBoundsException err) {
                        System.out.println(err.getMessage());
                    }
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                case 2:
                    System.out.println("\n\tСведения о клиентах, отсортированные по имени:");
                    ArrayList<User> listName = base.sortByAlphabet();
                    for (User usr : listName) {
                        System.out.println(usr);
                    }
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                case 3:
                    System.out.println("\n\tСведения о клиентах, у которых время внутригородских разговоров превышает 3600sec:");
                    ArrayList<User> listLocal = base.userWithBigValueLocalCalls(3600);
                    for (User usr : listLocal) {
                        System.out.println(usr);
                    }
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                case 4:
                    System.out.println("\n\tСведения о клиентах, которые пользовались междугородной связью:");
                    ArrayList<User> listInternational = base.userWithInternationalCalls(0);
                    for (User usr : listInternational) {
                        System.out.println(usr);
                    }
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                case 5:
                    System.out.println("Введите фамилию:");
                    username = search.nextLine();
                    for (User user : base.sortList) {
                        if (user.getLastname().equals(username)) {
                            System.out.println(user);
                        }
                    }
                    System.out.println("\nВЫБЕРИТЕ ДЕЙСТВИЕ:");
                    input = numOfPoint.nextInt();
                    break;
                default:
                    System.out.println("\nThere is no such command.");
                    input = 9;
            }
        }
    }
}