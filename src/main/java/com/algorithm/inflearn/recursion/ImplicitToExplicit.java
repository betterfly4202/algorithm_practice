package com.algorithm.inflearn.recursion;

/**
 * Created by betterFLY on 2017. 11. 19.
 * Github : http://github.com/betterfly88
 */

public class ImplicitToExplicit {
    /**
     * implicit(암시적) 매개변수를 사용하지 말고,
     * explicit(명시적) 매개변수로 사용하라.
     */

    //순차 탐색(Sequential Search)... 배열을 하나씩 순차적으로 탐색해서 값의 여부를 체크함
    public int search(int [] data, int n, int target){
        for(int i=0; i<n; i++)
            if(data[i] == target)
                return i;
        return -1;

        /*
            이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다
            하지만 검색 구간의 시작 인덱스 0은 보통 생략한다 ==> 즉 암시적 매개변수 이다.

            이게 무슨말이냐면, 지금 이 함수는 배열 [0, n-1] 까지의 공간을 검색하는데,
            search의 매개변수로 int n 을 나타낸 것은 n-1 을 표현했지만, 이 함수가 0부터 시작한다는 것은 for 문의 i=0 이라는 것을 보고 암시적으로 파악할 수 있다
            일반적으로 매개변수가 많을 필요가 없기 때문에 이렇게 표현하는게 일반적이다
            하지만...
            recursion 으로 표현할때는 일반적으로 이렇게 표현하는 것은 좋지 않다 다음을 살펴보자
         */
    }
//
//    public int toExplicit(int [] data, int begin, int end, int target){
//        if(begin>end)
//            return -1;
//        else if(target == data[begin])
//            return begin;
//        else
//            return search(data, begin+1, end, target);
//
//        /*
//            같은 순차탐색을 recursion으로 표현했다
//            지금 이 재귀함수는,
//            else if (target == items[begin]
//             ==> 만약 target 값이 시작하는 값과 같다면 그 begin 값을 return 하고 종료시킨다
//             그렇지 않다면,
//             첫번째(items[begin]) 을 제외한 나머지 값들을 대입하여 결과를 도출할 수 있다
//
//         */
//    }

    //매개변수의 명시화 : 최대값 찾기
    public int findMax(int [] data, int begin, int end){
        if(begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin+1, end));
        /*
             return Math.max(data[begin], findMax(data, begin+1, end));
             이 말은, findMax(data, begin+1, end)); 재귀를 통해 begin+1 부터 end 까지의 값 중 가장 큰 값을 찾은 후
             data[begin]과 비교해서 둘 중 더 큰 값 (Math.max) 로 최종 값을 산출한다
         */
    }


    //binary search 이진검색
    public int binarySearch(String [] items, String target, int begin, int end){
        // 이진검색을 재귀함수로 할때 중요한 로직은 데이터가 순서대로 배열에 저장되어 있다고 가정한다
        // 이진검색은... 전체의 값 중 중앙값(begin+end)/2 을 내가 찾는 값과 비교한다.
        // 만약 가운데 값이 내가 찾는 값보다 크다면... 데이터는 크기 순으로 정렬되어 있기 때문에
        // 가운데 값 뒤로는 무의미한 값이다. 다 날려버리면된다, 반대로 작다면 그 앞을 날린다

        if(begin > end) // base case : 데이터가 0인 경우
            return -1;
        else{
            int middle = (begin+end)/2;
            int compResult = target.compareTo(items[middle]); // String 은 compareTo 로 한다 > target이 작으면 음수, 크면 양수, 같으면 0
            if(compResult == 0) // 값이 동일하다면 middle이 결국 target이 된다!
                return middle;
            else if(compResult < 0)
                return binarySearch(items, target, begin, middle-1);
            else
                return binarySearch(items, target, middle+1, end);
        }
    }
}
