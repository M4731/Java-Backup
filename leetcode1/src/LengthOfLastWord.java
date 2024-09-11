public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if (s.isEmpty()){
            return 0;
        }

        if (!s.contains(" ")){
            return s.length();
        }

        int lastWordLength = 0;
        for (int i = s.length()-1; i >= 0; i--) {

            if (s.charAt(i) != ' '){
                while(s.charAt(i) != ' '){

                    if (i == 0){
                        return lastWordLength +1;
                    }

                    lastWordLength ++;
                    i--;
                }

                return lastWordLength;
            }
        }

        return 0;
    }

}
