import java.util.ArrayList;
import java.util.List;

public class DataType {

    public static void main(String[] args) {
        byte number1 = 100;
        short number2 = 10000;
        int number3 = 10000000;
        long number4 = 10000000000L;

        float number5 = 3.14f;
        double number6 = 3.14;

        char letter = 'a';
        boolean isValid = true;

        Byte number11 = number1; // auto-boxing osztály típusúra átalakítás
        number11.byteValue();
        number11.toString();

        String name = "John"; // string pool-ban tárolódik
        String name2 = "john";
        String name3 = "John";
        String name4 = new String("John"); // heap-ben tárolódik

        boolean isSame1 = name == name2;
        System.out.println(isSame1);
        boolean isSame2 = name == name3;
        System.out.println(isSame2);
        boolean isSame3 = name == name4;
        System.out.println(isSame3);
        boolean isSame4 = name.equals(name2); // egyenlőség érték alapján
        System.out.println(isSame4);
        boolean isSame5 = name.equalsIgnoreCase(name2); // kis és nagybetű figyelmen kívül hagyása
        System.out.println(isSame5);
        boolean isSame6 = name.equals(name4); // egyenlőség érték alapján
        System.out.println(isSame6);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.contains(1);
        numbers.remove(0);
        int size = numbers.size();
        System.out.println(size);

        int[] nums = {1, 2, 3, 4, 5};
        int lenght = nums.length;
        System.out.println(lenght);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.toArray();
        Integer[] num2 = {1, 2, 3, 4, 5};
        
    }
}
