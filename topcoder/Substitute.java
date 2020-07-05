import java.util.*;

// https://arena.topcoder.com/#/u/practiceCode/1282/1262/1333/2/1282
/*
"TRADINGFEW"
"LGXWEV"
Returns: 709
The L,X, and V are ignored since they do not appear in the key. G is the seventh letter in the key,
W is the 10th letter (for the last letter using 0), and E is the 9th letter.
*/
public class Substitute {
    public int getValue(String key, String code) {
        Map<Character, Integer> map = new HashMap<>(key.length());
        for(int i = 0; i < key.length(); i++) {
            if(i == (key.length() - 1)) {
                map.put(key.charAt(i), 0);
            }
            else {
                map.put(key.charAt(i), i + 1);
            }
        }
        String result = "";
        for(int i = 0; i < code.length(); i++) {
            Character ch = code.charAt(i);
            if(map.get(ch) == null) {
                continue;
            }
            result = result + map.get(ch);
        }
        return Integer.valueOf(result);
    }

    public static void main(String[] args) {
        Substitute sub = new Substitute();
    System.out.println(sub.getValue("TRADINGFEW", "LGXWEV"));
    }
}

/*
https://www.topcoder.com/my-dashboard
Click SRMS - PRACTICE PROBLEMS - Practice Problems toolbar green icon
or
https://arena.topcoder.com/#/u/practiceProblemList

Problem Archive:
https://community.topcoder.com/tc?module=ProblemArchive
One problem name is Substitute. Search for Substitute in Problem Archive - enter Substitute in the Class Name field.
Search results are in the table with columns Problem Name, Challenge, etc.
Problem Name    Challenge
Substitute      SRM 160
Click on Substitute
Scroll down:
This problem was used for:
       Single Round Match 160 Round 1 - Division II, Level One
Click on Single Round Match 160 Round 1 - Division II, Level One
Scroll down - click View under Java to see the top submission

To see editorials:
https://www.topcoder.com/tc?d1=match_editorials&d2=archive&module=Static
Search for SRM 160 and click on Problem Set & Analysis

Editorial:
The Problems
Substitute  discuss it
Used as: Division Two - Level One:
Value	250
Submission Rate	141 / 146 (96.58%)
Success Rate	135 / 141 (95.74%)
High Score	Jiggly for 246.77 points (3 mins 15 secs)
Average Score	211.54 (for 135 correct submissions)
The simplest way to solve this problem was to look at each character in the code, starting from the first character,
in order. As you go along, you keep an integer representing the value so far. If the character in the code is not in
the key, you simply ignore it. Otherwise, you multiply the integer by 10, and add the number represented by the character.
This is the standard way to parse numbers in any base: look at each character one at a time, multiplying by the base
(10 in this case) and then adding each time.

Top solution

import java.lang.*;
import java.util.*;
 
public class Substitute {
 
    public int getValue(String key, String code) {
        int  value, i;
        
        value = 0;
        for (i = 0; i < code.length(); i ++) {
            int  index = key.indexOf(code.charAt(i));
            if (index >= 0)
            value = (value * 10) + ((index + 1) % 10);
        }
        return value;
    }
}