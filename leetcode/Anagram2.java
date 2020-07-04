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

Approach: sort two string and compare

Results: great:
Runtime: 2 ms, faster than 94.66% of Java online submissions for Valid Anagram.
Memory Usage: 39.6 MB, less than 7.09% of Java online submissions for Valid Anagram.

Time complexity: O(nlog(n))
*/

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        if(s.equals("") && t.equals("")) {
            return true;
        }   
        
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        // if(Arrays.equals(charS, charT) - true; othervise - false
        String sortedS = new String(charS);
        String sortedT = new String(charT);
        // if(Arrays.equals(charS, charT)
        if(sortedS.equals(sortedT)) {
            return true;
        }
        return false;
    }