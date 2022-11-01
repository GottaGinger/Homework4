public class Main {
    public static void capitalize(String word) {
        System.out.println(word.toUpperCase().charAt(0)+word.substring(1).toLowerCase());
    }
    public static void wheresWaldo(String phrase) {
        System.out.println(phrase.indexOf("Waldo"));
    }
    public static void firstThingsFirst(String a, String b) {
        if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0)) {
            System.out.println(a.concat(" " +b));
        }
        else
            System.out.println(b.concat(" " +a));
    }
     public static void reverse( String s) {
         String backwardsWord = "";

        for(int i = s.length() - 1; i >= 0; i--)
         {
             backwardsWord += (s.charAt(i) + "");

         }
         System.out.println(backwardsWord );

     }
     public static void soLong(String c, String d) {
         if (c.length() > d.length()) {
             System.out.println(c);
         }
        else if (c.length() == d.length()) {
            System.out.println(c.concat(" "+d));
         }
        else {
            System.out.println(d);
         }

     }
    public static void afterMath(String phrase){
        if (phrase.contains("math")) {
           System.out.println(phrase.substring(phrase.indexOf("math")));
       } else {
           System.out.println("dud");
       }
    }
    public static void letterize(String word) {
        for (int i = 0; i <= word.length() -1; i++) {
            System.out.println(word.charAt(i));
        }
    }
    public static void main(String[] args) {
        String line1 = "bLAzE";
        String line2 = "Where is Waldo";
        String a = "Glory";
        String b = "Candle";
        String s = "base";
        String c = "Butter";
        String d = "Hotter";
        String line3 = "We love math tests";
        String f = "Java";
        capitalize(line1);
        wheresWaldo(line2);
        firstThingsFirst(a,b);
        reverse(s);
        soLong(c,d);
        afterMath(line3);
        letterize(f);

    }
}


