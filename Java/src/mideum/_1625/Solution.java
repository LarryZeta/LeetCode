package mideum._1625;


class Solution {


    public String findLexSmallestString(String s, int a, int b) {


        int[] ints = s.chars().map(c -> { return c - 48 ; }).toArray();

        // b 奇数 所有位 不是单独的是整体的 统计频率找个频率最高的 而且加值最低的 加值最小
        // b 偶数 奇数位 加值最小


        for ( int i : ints ) {

        }


        boolean odd = b % 2 == 0;

        for (int i = 0 ; i < ints.length; i ++) {
            if ( i % 2 == 0 && odd ) {
                continue;
            }
            ints[i] = minNum(ints[i], a);
        }

        int minIndex = 0;
        int minValue = ints[0];

        StringBuffer stringBuffer = new StringBuffer();

        for ( int i = b; i < ints.length; i = i + b ) {
            if ( ints[i] < minValue ) {
                minIndex = i;
                minValue = ints[i];
            }
        }

        for ( int i = minIndex; i < ints.length; i ++ ) {
            stringBuffer.append(ints[i]);
        }
        for ( int i = 0; i < minIndex; i ++ ) {
            stringBuffer.append(ints[i]);
        }

        return stringBuffer.toString();
    }

    public int minNum(int n, int a) {


        if ( a == 5 ){
            if ( n >= 5 ) {
                return n - 5;
            } else {
                return n;
            }
        } else if ( a % 2 == 1 ) {
            return 0;
        } else {
            if ( n % 2 == 0 ) {
                return 0;
            } else {
                return 1;
            }
        }

    }

    public static void main(String[] args) {
        String s = new Solution().findLexSmallestString("5525", 9, 2);
        System.out.printf(s);
    }

}
