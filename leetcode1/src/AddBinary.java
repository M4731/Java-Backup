public class AddBinary {

    public String addBinary(String a, String b) {

        int i = a.length()-1, j = b.length()-1, carried = 0;
        StringBuilder result = new StringBuilder();

        while ( i >= 0 || j >= 0 || carried != 0 ){

            if (i >= 0){
                carried += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0){
                carried += b.charAt(j) - '0';
                j--;
            }

            result.append(carried % 2);
            carried/=2;

        }
        return result.reverse().toString();
    }

//    public static void main(String[] args) {
//
//        AddBinary solution = new AddBinary();
//        System.out.println(solution.addBinary("11","1"));
//    }

}
