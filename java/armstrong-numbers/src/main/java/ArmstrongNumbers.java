class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int numDigits = String.valueOf(numberToCheck).length();
		String numString = "" + numberToCheck;
		int sum =0;

		for (int i =0; i < numString.length(); i++){
		    int n = Character.getNumericValue (numString.charAt(i));

		    sum += (int) Math.pow(n,numDigits);
        }

        if (sum == numberToCheck){
		    return true;
        }
        return false;
		
	}

}
