import java.util.ArrayList;
import java.util.List;

public class _0933_Number_of_Recent_Calls {
    List<Integer> call;
    public _0933_Number_of_Recent_Calls() {
        call = new ArrayList<>();
    }

    public int ping(int t) {
        call.add(t);
        int startRange = t - 3000;
        int count = 0;
        for (Integer i : call) {
            if (i >= startRange && i <= t) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _0933_Number_of_Recent_Calls obj = new _0933_Number_of_Recent_Calls();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }
}
