class ReverseString {
  
    String reverse(String stringToReverse) {

        if (stringToReverse.equals("")){
            return "";

        }else {
            return new StringBuffer(stringToReverse).reverse().toString();
        }

    }
  
}