public class StringReverse {

    /* Schreiben Sie eine Methode, die einen String als Parameter übergeben bekommt und in umgekehrter Reihenfolge zurückgibt.*/
    public static String stringReversed(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }

        String reversed = "";

        // Die for-Schleife zählt vom Index des letzten Zeichens bis 0 runter.
        for (int i = str.length()-1; i >= 0; i--) {
            // Die Zeichen werden in umgkehrter Reihenfolg an reversed konkateniert.
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String toReverse = "!tcerroC";

        String reversed = stringReversed(toReverse);

        if(reversed.equals("Correct!")) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your String contains \"" + reversed + "\" but it should contain \"Correct!\"");
        }
    }
}
