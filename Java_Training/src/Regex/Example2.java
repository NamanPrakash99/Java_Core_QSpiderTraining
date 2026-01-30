package Regex;

public class Example2 {
	public static void main(String[] args) {
		   // \d - Digit
        System.out.println("5".matches("\\d"));     // true
        System.out.println("12".matches("\\d"));    // false

        // \D - not digit
        System.out.println("A".matches("\\D"));     // true
        System.out.println("5".matches("\\D"));     // false

        // \w - word 
        System.out.println("a".matches("\\w"));     // true
        System.out.println("@".matches("\\w"));     // false

        // \W - not word
        System.out.println("@".matches("\\W"));     // true
        System.out.println("a".matches("\\W"));     // false

        // \s
        System.out.println(" ".matches("\\s"));     // true
        System.out.println("A".matches("\\s"));     // false

        // \S
        System.out.println("A".matches("\\S"));     // true
        System.out.println(" ".matches("\\S"));     // false

        // [a-z]
        System.out.println("g".matches("[a-z]"));   // true
        System.out.println("G".matches("[a-z]"));   // false

        // [A-Z]
        System.out.println("G".matches("[A-Z]"));   // true
        System.out.println("g".matches("[A-Z]"));   // false

        // [0-9]
        System.out.println("7".matches("[0-9]"));   // true
        System.out.println("a".matches("[0-9]"));   // false

        // [a-zA-Z]
        System.out.println("Z".matches("[a-zA-Z]")); // true
        System.out.println("9".matches("[a-zA-Z]")); // false

        // [abc]
        System.out.println("b".matches("[abc]"));   // true
        System.out.println("d".matches("[abc]"));   // false

        // [^abc]
        System.out.println("z".matches("[^abc]"));  // true
        System.out.println("a".matches("[^abc]"));  // false

        // [ ]?  (0 or 1 space)
        System.out.println("".matches("[ ]?"));     // true
        System.out.println(" ".matches("[ ]?"));    // true
        System.out.println("  ".matches("[ ]?"));   // false

        // [ ]+  (1 or more spaces)  ✅
        System.out.println(" ".matches("[ ]+"));    // true
        System.out.println("   ".matches("[ ]+"));  // true
        System.out.println("".matches("[ ]+"));     // false
        System.out.println(" a ".matches("[ ]+"));  // false

        // [ ]*  (0 or more spaces)
        System.out.println("".matches("[ ]*"));     // true
        System.out.println("   ".matches("[ ]*"));  // true
        System.out.println("a".matches("[ ]*"));    // false

        // [ ]{n}
        System.out.println("  ".matches("[ ]{2}")); // true
        System.out.println(" ".matches("[ ]{2}"));  // false

        // [ ]{x,y}
        System.out.println("   ".matches("[ ]{1,3}")); // true
        System.out.println("    ".matches("[ ]{1,3}")); // false
	}
}
