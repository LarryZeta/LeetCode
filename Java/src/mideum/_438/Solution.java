package mideum._438;

import java.util.*;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> pMap = new HashMap<>(p.length());
        Map<Character, Integer> sMap = new HashMap<>(p.length());
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        for ( int i = 0; i < p.length(); i ++ ) {

            char pChar = p.charAt(i);
            char sChar = s.charAt(i);

            if (pMap.containsKey(pChar)) {
                pMap.put(pChar, pMap.get(pChar) + 1);
            } else {
                pMap.put( pChar, 1 );
            }

            if (sMap.containsKey(sChar)) {
                sMap.put( sChar, sMap.get(sChar) + 1);
            } else {
                sMap.put( sChar, 1 );
            }

        }

        if ( check( sMap, pMap ) ) {
            list.add( 0 );
        }

        for ( int i = 1, j = p.length(); j < s.length(); i ++, j ++ ) {

            char iChar = s.charAt(i - 1);
            char jChar = s.charAt(j);

            if (sMap.get(iChar) == 1) {
                sMap.remove(iChar);
            } else {
                sMap.put(iChar, sMap.get(iChar) - 1);
            }

            if (sMap.containsKey(jChar)) {
                sMap.put( jChar, sMap.get(jChar) + 1);
            } else {
                sMap.put( jChar, 1 );
            }

            if ( check( sMap, pMap ) ) {
                list.add( i );
            }

        }
        return list;
    }

    public boolean check( Map<Character, Integer> sMap, Map<Character, Integer> pMap ) {

        for (Map.Entry<Character, Integer> entry : pMap.entrySet() ) {
            if (!sMap.containsKey(entry.getKey()) || !sMap.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

}
