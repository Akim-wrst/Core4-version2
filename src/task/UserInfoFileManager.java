package task;

import java.io.File;
import java.io.FileOutputStream;

public class UserInfoFileManager {
    static void infoFile(User user) {
        try {
            File file = new File("C:\\Java\\File.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(user.toString().getBytes());
            System.out.println("В файл запсиан: -> " + user);
        } catch (
                Exception e) {
            System.out.println(e);
        }
    }
}
