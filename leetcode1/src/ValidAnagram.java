import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) return true;
        if(s.length() != t.length()) return false;

        Map<Integer, Integer> frequence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequence.compute((int)s.charAt(i), (key, value) -> value == null ? 1 : value + 1);
        }
        for (int i = 0; i < t.length(); i++) {
           if (!frequence.containsKey((int)t.charAt(i))) {
               System.out.println("1");
               return false;
           }
           else if ( frequence.get((int)t.charAt(i)) == 1 ){
               frequence.remove((int)t.charAt(i));
           }
           else{
               frequence.put((int)t.charAt(i), frequence.get((int)t.charAt(i)) - 1);
           }
        }

        return frequence.isEmpty();
    }

}
