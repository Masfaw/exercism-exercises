
public class Hamming {

    private String leftStrand, rightString;
    Hamming(String leftStrand, String rightStrand) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.leftStrand = leftStrand;
        this.rightString = rightStrand;

        if (leftStrand.length() != rightStrand.length()){
            throw  new IllegalArgumentException("leftStrand and rightStrand must be of equal length.") ;

        }
    }

    int getHammingDistance() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int distance = 0;
        if (leftStrand.length() == rightString.length()){
            for (int i = 0 ;i < leftStrand.length(); i++){
                if (leftStrand.charAt(i) != rightString.charAt(i)){
                    distance++;
                }
            }

        }else {
            throw  new IllegalArgumentException("leftStrand and rightStrand must be of equal length.") ;
        }

        return distance;


    }

}
