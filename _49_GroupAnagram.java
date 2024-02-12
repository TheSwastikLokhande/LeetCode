import java.util.*;

class _49_GroupAnagram {

    public static void main(String[] args) {
        String[] sampleStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = _49_GroupAnagram.groupAnagrams(sampleStrings);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String val = new String(ch);
            if (map.containsKey(val)) {
                map.get(val).add(str);
            } else {
                map.put(val, new ArrayList<>());
                map.get(val).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}