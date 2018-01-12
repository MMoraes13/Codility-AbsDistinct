import java.util.HashMap;
class Solution {
    public int solution(int[] A) {
        HashMap <Integer, Integer> distinct = new HashMap <> ();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            Integer aux = Math.abs(A[i]);
            Integer auxCount = distinct.get (aux);
            if (auxCount == null) auxCount = 0;
            if (auxCount == 0) {
                auxCount++;
                distinct.put (aux, auxCount);
                count++;
            }
        }

        return count;
    }
}
