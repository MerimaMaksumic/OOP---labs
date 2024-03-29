
package week11;

import java.util.Set;


public interface MultipleEntryDictionary {
    void add(String word, String translation);
    Set<String> translate(String word);
    void remove(String word);
}
