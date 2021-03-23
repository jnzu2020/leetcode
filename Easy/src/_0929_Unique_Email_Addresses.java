import java.util.HashSet;
import java.util.Set;

public class _0929_Unique_Email_Addresses {
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String localName = split[0];
            String domainName = split[1];
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }
            String replaceLocalName = localName.replace(".", "");
            set.add(replaceLocalName + "@" + domainName);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails1));

        String[] emails2 = {"a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"};
        System.out.println(numUniqueEmails(emails2));
    }
}
