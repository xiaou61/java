package stream流;

import java.util.stream.Stream;

public class a5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6).forEach(s-> System.out.println(s));
    }
}
