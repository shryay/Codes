import java.util.*;
public class findcommonCharacter {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string array: ");
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        List<String> result = commonChars(str);
        System.out.println("Common characters:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
    public static List<String> commonChars(String words[]) {
        int minFreq[] = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int charFreq[] = new int[26];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                charFreq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charFreq[j]);
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }
}