public class StringReverse {

    /* Schreiben Sie eine Methode, die einen String als Parameter übergeben bekommt und in umgekehrter Reihenfolge zurückgibt.*/
    public static String kataStringReversed(String str) {
        return "";
    }

    public static void main(String[] args) {
        String toReverse = "!tcerroC";

        String reversed = kataStringReversed(toReverse);

        if(reversed.equals("Correct!")) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your String contains \"" + reversed + "\" but it should contain \"Correct!\"");
        }
    }
}
