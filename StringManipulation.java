public class StringManipulation {
	public String trimAndConcat(String str1, String str2){
		String concatString = "";
		concatString += str1.trim() + str2.trim();
		return concatString;
	}
	public Integer getIndexOrNull(String str3, char letter){
		if(str3.indexOf(letter) == -1) {
			return null;
		}
		else return str3.indexOf(letter);
	}
	public Integer getIndexOrNull(String str4, String subString){
		if(str4.indexOf(subString) == -1) {
			return null;
		}
		else return str4.indexOf(subString);
	}
	public String concatSubstring(String str5, int start, int end, String str6) {
		String concatNewString = "";
		String substring = str5.substring(start, end);
		concatNewString += substring + str6;
		return concatNewString;
	}
}

