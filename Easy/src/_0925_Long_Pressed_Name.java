import java.util.ArrayList;
import java.util.List;

public class _0925_Long_Pressed_Name {
    public static boolean isLongPressedName(String name, String typed) {
        CountString countName = count(name);
        CountString countTyped = count(typed);
        if (!countName.value.equals(countTyped.value)) {
            return false;
        } else {
            List<Integer> countListName = countName.count;
            List<Integer> countListTyped = countTyped.count;
            if (countListName.size() != countListTyped.size()) {
                return false;
            } else {
                for (int i = 0 ; i< countListName.size() ; i++) {
                    if (countListName.get(i) > countListTyped.get(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static CountString count(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> countList = new ArrayList<>();
        stringBuilder.append(str.charAt(0));
        int count = 1;
        for (int i = 1 ; i < str.length() ; i++) {
            if (str.charAt(i) == stringBuilder.charAt(stringBuilder.length() - 1)) {
                count++;
            } else {
                countList.add(count);
                count = 1;
                stringBuilder.append(str.charAt(i));
            }
        }

        if (stringBuilder.length() != countList.size()) {
            countList.add(count);
        }

        return new CountString(stringBuilder.toString(), countList);
    }

    public static void main(String[] args) {
        String name1 = "alex", typed1 = "aaleex";
        System.out.println(isLongPressedName(name1, typed1));

        String name2 = "saeed", typed2 = "ssaaedd";
        System.out.println(isLongPressedName(name2, typed2));

        String name3 = "leelee", typed3 = "lleeelee";
        System.out.println(isLongPressedName(name3, typed3));

        String name4 = "laiden", typed4 = "laiden";
        System.out.println(isLongPressedName(name4, typed4));
    }
}

class CountString {
    String value;
    List<Integer> count;
    CountString(String value, List<Integer> count) {
        this.value = value;
        this.count = count;
    }

    @Override
    public String toString() {
        return "CountString{" +
                "value='" + value + '\'' +
                ", count=" + count +
                '}';
    }
}
