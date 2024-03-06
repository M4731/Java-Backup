public class RepeatedSubstringPattern {

    public boolean solution(String s) {
        if ( s.length() == 1 ){
            return false;
        }

        for (int i = 1; i < s.length()/2+1; i++) {
            if ( s.length()%i == 0){
                String helper = s.substring(0,i);

                boolean result = true;

                for (int j = i; j < s.length(); j+=i) {
                    String checker = s.substring(j,j+i);
                    if ( !helper.equals(checker) ){
                        result = false;
                    }
                }

                if (result){
                    return true;
                }
            }
        }

        return false;

    }

}
