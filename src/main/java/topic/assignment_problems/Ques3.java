import java.util.HashMap;
import java.util.Map;

public class Ques3 {

    public static Object[] mostPopular(String[] orders) {
        Map<String, Integer> frequency = new HashMap<>();

        for (String item : orders) {
            frequency.put(item, frequency.getOrDefault(item, 0) + 1);
        }

        String popularItem = orders[0];
        int maxCount = frequency.get(popularItem);

        for (String item : orders) {
            int count = frequency.get(item);

            if (count > maxCount) {
                popularItem = item;
                maxCount = count;
            }
        }

        return new Object[]{popularItem, maxCount};
    }

    public static void main(String[] args) {
        String[] orders1 = {
            "dosa", "idli", "vada", "dosa", "idli", "dosa", "tea"
        };

        String[] orders2 = {
            "tea", "coffee", "coffee", "tea"
        };

        Object[] result1 = mostPopular(orders1);
        Object[] result2 = mostPopular(orders2);

        System.out.println("(" + result1[0] + ", " + result1[1] + ")");
        System.out.println("(" + result2[0] + ", " + result2[1] + ")");
    }
}