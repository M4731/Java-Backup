public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int index = prefix.length();

        for (int i = 1; i < strs.length; i++) {
           // index = strs[i].length() < index ? strs[i].length() : index;
            if ( index > strs[i].length() ){
                index = strs[i].length();
                prefix = prefix.substring(0,index);
            }

            if( prefix.equals("") ){
                return "";
            }

            for (int j = 0; j < index; j++) {
                if ( prefix.charAt(j) != strs[i].charAt(j)){
                    index = j;
                    prefix = prefix.substring(0,index);
                }
            }
        }

        return prefix;
    }

}
