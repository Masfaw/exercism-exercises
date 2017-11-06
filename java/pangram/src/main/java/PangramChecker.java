public class PangramChecker {

    public boolean isPangram(String input) {

        if (input.equals("")){
            return false;
        }

        boolean isPan = true;
        boolean [] letters = new boolean[26];

        for (int i = 0 ; i < input.length(); i++){

            int index = Character.toLowerCase(input.charAt(i)) - 'a';
            if (index >= 0 && index < 26){
                letters[index] = true;
            }

        }

        for (int i =0 ; i < letters.length; i++){
            if (!letters[i]){
                isPan = false;
            }
        }

        return isPan;

    }

}
