public class _0748_Shortest_Completing_Word {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        String lowerCaseLicensePlate = licensePlate.toLowerCase();
        for (char c : lowerCaseLicensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        String result = "";
        for (String word : words) {
            int[] countOfWord = new int[26];
            for (char c : word.toCharArray()) {
                countOfWord[c - 'a']++;
            }
            for (int i = 0 ; i < 26 ; i++) {
                if (count[i] > countOfWord[i]) {
                    break;
                } else if (i == 25) {
                    if (result.length() == 0) {
                        result = word;
                    } else {
                        result = result.length() > word.length() ? word : result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        System.out.println(shortestCompletingWord(licensePlate1, words1));

        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord(licensePlate2, words2));

        String licensePlate3 = "Ah71752";
        String[] words3 = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
        System.out.println(shortestCompletingWord(licensePlate3, words3));

        String licensePlate4 = "OgEu755";
        String[] words4 = {"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"};
        System.out.println(shortestCompletingWord(licensePlate4, words4));

        String licensePlate5 = "iMSlpe4";
        String[] words5 = {"claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use"};
        System.out.println(shortestCompletingWord(licensePlate5, words5));
    }
}
