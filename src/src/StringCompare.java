// To compare string objects

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "Goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
                "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n",
                s1, s2, s3, s4
        );

        // Object comparison
        if (s1.equals("hello")) {
            System.out.println("s1 equals \"hello\"\n");
        } else {
            System.out.println("s1 does not equal \"hello\"\n");
        }

        if (s1.equals("hello")) {
            System.out.println("s1 is the same object as \"hello\"\n");

        } else {
            System.out.println("s1 is not the same as \"hello\"\n");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.printf(
                    "%s equals %s with case ignored%n",
                    s3, s4
            );
        } else {
            System.out.println("s3 does not equal s4");
        }

        System.out.printf("%ns2.compareTo(s) is %d", s1.compareTo(s2));
        System.out.printf("%ns1.compareTo(s) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s) is %d", s1.compareTo(s1));
        System.out.printf("%ns4.compareTo(s) is %d", s3.compareTo(s4));
        System.out.printf("%ns3.compareTo(s) is %d%n%n", s3.compareTo(s3));

        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("First five characters of s3 match s4 with case ignored!");
        } else {
            System.out.println("First five characters of s3 do not match the first five of s4!");
        }
    } // main
} // StringCompare