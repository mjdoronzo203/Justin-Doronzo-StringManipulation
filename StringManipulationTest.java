public class StringManipulationTest {
	public static void main(String[] args) {
		StringManipulation trimConcat = new StringManipulation();
		String str = trimConcat.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str); // HelloWorld 

		StringManipulation stringChar = new StringManipulation();
		char letter = 'o';
		Integer a = stringChar.getIndexOrNull("Coding", letter);
		Integer b = stringChar.getIndexOrNull("Hello World", letter);
		Integer c = stringChar.getIndexOrNull("Hi", letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null

		StringManipulation twoStrings = new StringManipulation();
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer d = twoStrings.getIndexOrNull(word, subString);
		Integer e = twoStrings.getIndexOrNull(word, notSubString);
		System.out.println(d); // 2
		System.out.println(e); // null

		StringManipulation subConcat = new StringManipulation();
		String wordTwo = subConcat.concatSubstring("Hello", 1, 2, "world");
		System.out.println(wordTwo); // eworld
	}
}