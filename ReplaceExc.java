// Write function removeExclamationMarks which removes all exclamation marks from a given string.

class ReplaceExc {
    static String removeExclamationMarks(String s) {
        s = s.replaceAll("[!]", "");
        return s;
    }
}
