package com.algorithm.codility.Lessons_2;

/**
 * Created by betterFLY on 2018. 8. 9.
 * Github : http://github.com/betterfly88
 */

/*
    A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

    For example, in array A such that:

      A[0] = 9  A[1] = 3  A[2] = 9
      A[3] = 3  A[4] = 9  A[5] = 7
      A[6] = 9
    the elements at indexes 0 and 2 have value 9,
    the elements at indexes 1 and 3 have value 3,
    the elements at indexes 4 and 6 have value 9,
    the element at index 5 has value 7 and is unpaired.
    Write a function:

    class Solution_Lambda { public int solution(int[] A); }

    that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

    For example, given array A such that:

      A[0] = 9  A[1] = 3  A[2] = 9
      A[3] = 3  A[4] = 9  A[5] = 7
      A[6] = 9
    the function should return 7, as explained in the example above.

    Assume that:

    N is an odd integer within the range [1..1,000,000];
    each element of array A is an integer within the range [1..1,000,000,000];
    all but one of the values in A occur an even number of times.
    Complexity:

    expected worst-case time complexity is O(N);
    expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
public class Solution_2 {
    //TODO : 방법 1. 전체를 낮은 순으로 정렬한 후 그 갯수가 홀수인 수를 리턴
    //TODO : 방법 2. 임의의 배열을 만들어서 수를 담아 놓고, 같은 값이 나오면 소멸, 없으면 남겨둠
    public static void main (String []args){
        int [] a = {1,6,7,6,1};

    }

    public static int restValue(int [] a){
        int result = 0;

        for(int ss : a){
            result = ss;
            if(ss == result){
                result = 0;
            }
        }

        return result;
    }
}
