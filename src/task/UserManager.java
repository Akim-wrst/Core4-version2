package task;

import java.util.*;
import java.util.stream.Collectors;

public class UserManager extends User {
    public static List<User> list = new ArrayList<>();

    UserManager(int id, String name, int age, String mail, String address) {
        super(id, name, age, mail, address);
    }

    public static void create(int id, String name, int age, String mail, String address) {
        list.add(new UserManager(id, name, age, mail, address));
        System.out.println("Создан User");
    }

    public static void get(int id) {
        for (User u : list) {
            if(u.getId()==id) {
                System.out.println("Найден пользователь" + u);
            }else {
                System.out.println("Не найден пользователь с таким айди");
            }
        }
    }

    public static void update(int id) {
        for (User user : list) {
            if (user.getId() == id) {
                System.out.println("Введите: name age mail address -> через один пробел, в одну строку!");
                Scanner scanner = new Scanner(System.in);
                String string1 = scanner.nextLine();
                String[] parts = string1.split(" ");
                user.setName(String.valueOf(parts[0]));
                user.setAge(Integer.parseInt(parts[1]));
                user.setMail(String.valueOf(parts[2]));
                user.setAddress(String.valueOf(parts[3]));
            } else {
                System.out.println("Не найден пользователь с таким айди");
            }
        }
    }

    public static void delete(int id) {
        list.removeIf(user -> user.getId() == id);
    }

    public static void sortAddress() {
        list = list.stream().sorted((x, y) -> x.getAddress().compareTo(y.getAddress())).collect(Collectors.toList());
    }

    public static void sortName() {
        list = list.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
    }
}
