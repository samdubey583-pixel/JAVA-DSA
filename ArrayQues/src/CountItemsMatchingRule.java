//LeetCode 1773
import java.util.*;

public class CountItemsMatchingRule {

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = 0;

        if (ruleKey.equals("type")) {
            index = 0;
        }
        else if (ruleKey.equals("color")) {
            index = 1;
        }
        else if (ruleKey.equals("name")) {
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<List<String>> items = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            List<String> item = new ArrayList<>();

            System.out.println("Enter type, color and name:");

            item.add(sc.nextLine());
            item.add(sc.nextLine());
            item.add(sc.nextLine());

            items.add(item);
        }

        System.out.print("Enter rule key: ");
        String ruleKey = sc.nextLine();

        System.out.print("Enter rule value: ");
        String ruleValue = sc.nextLine();

        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println("Matching items: " + result);

        sc.close();
    }
}