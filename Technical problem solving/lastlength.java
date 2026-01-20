// Given a string s consisting of words and spaces,
//  return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
class lastlength {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String lastword = words[words.length-1];
        int length = lastword.length();
        return length;
    }
}