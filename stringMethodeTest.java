public class stringMethodeTest {
    public static void main(String[] args) {
        String text = "  Hello Java World! Java is fun.  ";
        String trimmed = text.trim(); // "Hello Java World! Java is fun."

        // contains()
        System.out.println("contains(): " + trimmed.contains("Java")); // true

        // substring()
        System.out.println("substring(6,10): " + trimmed.substring(6, 10)); // Java

        // join()
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("join(): " + joined); // Java - Python - C++

        // replace()
        System.out.println("replace(): " + trimmed.replace("Java", "C#")); // Hello C# World! C# is fun.

        // replaceAll()
        System.out.println("replaceAll(): " + trimmed.replaceAll("Java", "Python")); // Hello Python World! Python is fun.

        // replaceFirst()
        System.out.println("replaceFirst(): " + trimmed.replaceFirst("Java", "Go")); // Hello Go World! Java is fun.

        // charAt()
        System.out.println("charAt(1): " + trimmed.charAt(1)); // e

        // getBytes()
        byte[] bytes = trimmed.getBytes();
        System.out.print("getBytes(): ");
        for (byte b : bytes) System.out.print(b + " ");
        System.out.println();

        // indexOf()
        System.out.println("indexOf('World'): " + trimmed.indexOf("World")); // 11

        // compareTo()
        System.out.println("compareTo('hello java'): " + trimmed.compareTo("hello java")); // -32

        // compareToIgnoreCase()
        System.out.println("compareToIgnoreCase('hello java'): " + trimmed.compareToIgnoreCase("hello java")); // 0

        // trim()
        System.out.println("trim(): '" + text.trim() + "'");

        // format()
        String formatted = String.format("Name: %s, Age: %d", "Ishika", 20);
        System.out.println("format(): " + formatted);

        // split()
        String[] parts = trimmed.split(" ");
        System.out.println("split():");
        for (String p : parts) System.out.println(" - " + p);

        // toLowerCase()
        System.out.println("toLowerCase(): " + trimmed.toLowerCase());

        // toUpperCase()
        System.out.println("toUpperCase(): " + trimmed.toUpperCase());

        // valueOf()
        int number = 123;
        String strNum = String.valueOf(number);
        System.out.println("valueOf(): " + strNum);

        // toCharArray()
        char[] chars = trimmed.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        // matches()
        System.out.println("matches('Hello Java World! Java is fun.'): " + trimmed.matches("Hello Java World! Java is fun."));

        // startsWith()
        System.out.println("startsWith('Hello'): " + trimmed.startsWith("Hello"));

        // endsWith()
        System.out.println("endsWith('fun.'): " + trimmed.endsWith("fun."));

        // isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty(): " + emptyStr.isEmpty());

        // intern()
        String a = new String("Java").intern();
        String b = "Java";
        System.out.println("intern(): a == b? " + (a == b));

        // contentEquals()
        StringBuilder sb = new StringBuilder("Hello Java World! Java is fun.");
        System.out.println("contentEquals(): " + trimmed.contentEquals(sb));

        // hashCode()
        System.out.println("hashCode(): " + trimmed.hashCode());

        // subSequence()
        System.out.println("subSequence(6,16): " + trimmed.subSequence(6, 16));
    }
}
