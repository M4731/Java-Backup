import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MEDGroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0){
            return result;
        }

        List<Map<Integer,Integer>> frequenceList = new ArrayList<>();
        for (String word : strs){
            Map<Integer, Integer> frequence = findFrequence(word);
            boolean check = false;

            for (int i = 0; i < result.size(); i++) {
                if(frequenceList.get(i).equals(frequence)){
                    result.get(i).add(word);
                    check = true;
                }
            }

            if (!check){
                List<String> currentList = new ArrayList<>();
                currentList.add(word);
                frequenceList.add(frequence);
                result.add(currentList);
            }
        }

        return result;
    }

    public Map<Integer, Integer> findFrequence(String word) {

        int asciivalue;
        Map<Integer, Integer> frequence = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            asciivalue = word.charAt(i);
            if (frequence.containsKey(asciivalue)){
                frequence.put(asciivalue, frequence.get(asciivalue)+1);
            }
            else {
                frequence.put(asciivalue,1);
            }
        }

        return frequence;
    }
}
