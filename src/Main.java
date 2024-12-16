import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.println(num);
            }
        }

        System.out.println("_______________");

        Set<Integer> integerSet = new HashSet<>();

        for (Integer num : nums) {
            if (!integerSet.contains(num) && num % 2 == 0) {
                System.out.println(num);

                integerSet.add(num);
            }
        }

        System.out.println("_______________");

        List<String> strs = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> stringSet = new HashSet<>(strs);

        for (String str : stringSet) {
            System.out.println(str);
        }

        System.out.println("_______________");

        Map<String, Integer> charMap = new HashMap<>();

        for (String str : strs) {
            charMap.merge(str, 1, Integer::sum);
        }

        for (Integer value : charMap.values()) {
            System.out.println(value);
        }
    }
}