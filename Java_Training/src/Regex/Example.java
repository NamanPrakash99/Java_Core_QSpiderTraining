package Regex;

public class Example {
	public static void main(String[] args) {
		String s="Java";
//		System.out.println(s.matches("java"));
//      System.out.println("Hello".matches("[asH]elo"));   //false
//		System.out.println("Hello".matches("[asH]ello"));  //true
//		System.out.println("apple".matches("[ap]pple"));
		
		// .-> used to match any character
		
//		System.out.println("Hai".matches("H..i"));  // false
//		System.out.println("Hai".matches("H.i"));  // true
//		System.out.println("Haai".matches("H..i"));  // true
		
		
		// to check range [a-z][A-Z][0-9]
		
//		System.out.println("h".matches("[A-Z]"));  // false
//		System.out.println("H".matches("[A-Z]"));  // true
//		
//		
//		System.out.println("h".matches("[a-z]")); 
//		
//		System.out.println("5".matches("[0-9]")); 
		
//      \\d->	digit (0-9)
//   	\\D -> not a digit
//		\\w ->letter, digit, underscore
//		\\W -> not character
//		\\s -> Space
//		\\S -> not space

//		System.out.println("7".matches("\\d"));
//		System.out.println("H".matches("\\w"));   // false
//		System.out.println("_".matches("\\w"));   // true
//		System.out.println(" ".matches("\\s"));  // true
		
		
//  ? -> 0 or 1 time
// * -> 0 or more
// + -> 1 or more
// {n} -> exactly n times
	
		System.out.println("kak".matches("k?"));  // false
		System.out.println("kh".matches("h+"));

	}
}
