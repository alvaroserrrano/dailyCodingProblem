import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// Given a string and a dictionary HashSet, write a function to determine the minimun nmber of characters to delete to make a word
// dictionary: ["a", "aa", "aaa"]
// query: "abc"
//output: 2
//     abc
//    / | \
//   ab ac bc
//  /\  /\ /\
// a b a c b c

public class StringDeletion {
    public int delete(String query, HashSet<String> dictionary) {
        Queue<String> queue = new LinkedList<>();
        Set<String> queueElements = new HashSet<String>();
        queue.add(query);
        queueElements.add(query);
        while (!queue.isEmpty()) {
            String s = queue.remove();
            queueElements.remove(s);
            if (dictionary.contains(s)) {
                return query.length() - s.length();
            }
            for (int i = 0; i < s.length(); i++) {
                String sub = s.substring(0, i) + s.substring(i + 1, s.length());
                if (!queueElements.contains(sub) && sub.length() > 0) {
                    queue.add(sub);
                    queueElements.add(sub);
                }
            }
        }
        return -1;
    }
}