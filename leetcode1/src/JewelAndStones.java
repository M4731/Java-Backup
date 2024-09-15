import java.util.Arrays;
import java.util.List;

public class JewelAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        if (jewels.isEmpty()){
            return 0;
        }

        if (stones.isEmpty()){
            return 0;
        }

        int numberOfJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if ( jewels.indexOf(stones.charAt(i)) != -1  ){
                numberOfJewels++;
            }
        }

        return numberOfJewels;
    }

//    public static void main(String[] args) {
//        String a = "Briana";
//        var sSplit = a.split("");
//
//        List y =  Arrays.stream(sSplit).toList();
//
//        for ( var i : y ){
//            System.out.println(i);
//        }
//    }

}
