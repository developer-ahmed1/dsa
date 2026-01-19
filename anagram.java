// using sorting approach

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
       String duplicate1 = sorting(s);
       String duplicate2 = sorting(t);

       if (duplicate1.equals(duplicate2)){
        return true;
       }
         return false;
   }

    public String sorting(String a){

      char[] charArray = a.toCharArray();

      Arrays.sort(charArray);
       String sortedString = new String(charArray);
      return sortedString;
 

    }
}
