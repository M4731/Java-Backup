public class IndexOfTheFirstOccurrenceInAString {

    int strStr(String haystack, String needle) {

        if ( !haystack.contains(needle) ){
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if ( needle.charAt(0) == haystack.charAt(i) ){
                String helper = haystack.substring(i, i+needle.length());
                if( helper.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

}
