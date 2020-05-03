import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task6 {
    public static void main (String[] args) throws IOException {
        File myFile = new File("task6");
        Scanner sc = new Scanner(myFile);
        String line = sc.nextLine();

        System.out.println(line);
        sc.close();

        String[] words = line.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.toString().compareTo(t1.toString());
            }
        });
        System.out.println(Arrays.toString(words));

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }

        String maxWord = "";
        String word = "";
        int maxCount = 0;
        int count = 1;

        for (String s : words) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("Самое повторяющееся слово: " + maxWord + ". Оно встречается " + maxCount + " раз");
    }
}

