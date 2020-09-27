package azubi.challenges.task001;

public class PermutationTester {

    /**
     * isPermutationOfOther return true, when first is a permutation of second, 
     * false otherwise.
     * 
     * A permutation is an reordering of the characters.
     * 
     * @param first String
     * @param second String
     */
    public static boolean isPermutationOfOther(String first, String second) {
        int d = 0;
        if (first.length()==second.length()){
        for (int i = 0; i < first.length(); i++){
            for(int j = 0; j<second.length(); j++){
                if(first.charAt(i) == second.charAt(j)){
                    d++;
                }
            }

        }
            if (d==first.length()){
                return true;
            }
        }

        return false;
    }
}