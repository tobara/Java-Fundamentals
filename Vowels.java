public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
        vowelsCount += 1;
      }
    }
    return vowelsCount;
  }

}
