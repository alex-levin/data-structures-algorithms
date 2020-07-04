/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Example 3:
Input: s = "aacc", t = "ccac"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

Results: not good:
Runtime: 16 ms, faster than 11.65% of Java online submissions for Valid Anagram.
Memory Usage: 40.7 MB, less than 5.16% of Java online submissions for Valid Anagram.

*/

class Anagram1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        if(s.equals("") && t.equals("")) {
            return true;
        }       
        // Map key is a string's char, value is the number of occurrences
        Map<Character, Integer> mapS = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(mapS.get(s.charAt(i)) != null) {
                int occurs = mapS.get(s.charAt(i));
                mapS.put(s.charAt(i), ++occurs);
            }
            else {
                mapS.put(s.charAt(i), 1);
            }
        }
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            if(mapT.get(t.charAt(i)) != null) {
                int occurs = mapT.get(t.charAt(i));
                mapT.put(t.charAt(i), ++occurs);
            }
            else {
                mapT.put(t.charAt(i), 1);
            }
        }                       

        for(int i = 0; i < s.length(); i++) {
           if(!mapS.get(s.charAt(i)).equals(mapT.get(s.charAt(i)))) {
               return false;
           }
        }
        return true;
    }
}