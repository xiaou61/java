package fanshe;

import java.lang.reflect.Constructor;

public class a2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("fanshe.Student");

        Constructor<?>[] cons = clazz.getConstructors();

        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }
    }
}
