package Task6;

import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Arrays;

public class File {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Java2.0\\src\\main\\java\\Task6\\textfile.txt"));
        String str;
        String [ ] words = new String[0];

        while((str = reader.readLine()) != null ){
            words = str.trim ( ).split ( "[\\s]+" );
        }

        Arrays.sort(words);
        System.out.println("Сортировка: " + Arrays.toString(words));

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println("Слово: " + word + " (встречается: " + wordToCount.get(word)+ " раз)");
        }

        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (h.containsKey(words[i])) {
                h.replace(words[i], h.get(words[i]) + 1);
            } else {
                h.put(words[i], 1);
            }
        }
        String wordPopular = null;
        int count = 0;
        for (String w : h.keySet()) {
            if (count < h.get(w)) {
                count = h.get(w);
                wordPopular = w;
            }
        }
        System.out.println("Самое повторяющееся слово: " + wordPopular + " (встречается " + count + " раз)");
    }
}
