import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0811_Subdomain_Visit_Count {
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> result = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] cp = cpdomain.split(" ");
            String visit = cp[0];
            int visitNum = Integer.parseInt(visit);
            String[] domain = cp[1].split("\\.");
            String s = "";
            for (int i = domain.length - 1 ; i >= 0 ; i--) {
                s = domain[i] + (i < domain.length - 1 ? "." : "") + s;
                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + visitNum);
                } else {
                    result.put(s, visitNum);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (String str : result.keySet()) {
            list.add(result.get(str) + " " + str);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] cpdomains1 = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(cpdomains1));

        String[] cpdomains2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(cpdomains2));
    }
}
