# 문제 설명
배열 'price'에 'price[i]'는 i번째 날짜에 주어진 주식의 가격입니다.
당신은 한 주식을 사기 위해 하루를 선택하고 그 주식을 팔기 위해 미래에 다른 날을 선택함으로써 이익을 극대화하라.
이 거래로 얻을 수 있는 최대 수익을 반환하십시오. 이익을 얻을 수 없으면 0을 반환합니다.

---

# 예시
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

---

# 아이디어 / 설계
1. prices의 길이 만큼 반복한다
2. 이익을 얻을 수 없는 경우가 있기 때문에, 최소값을 구하는 if문에서 최대값도 저장한다
3. 추가로 최대값도 저장한다
4. max 함수를 이용해서 최대의 결과값을 저장한다

---

# 문제 풀이
```java
class Solution {
    public int maxProfit(int[] prices) {

        int max = prices[0];
        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {

            if (min > prices[i]) {
                min = prices[i];
                max = prices[i];
            }

            if (max < prices[i]) {
                max = prices[i];
            }

            result = Math.max(result, max - min);

        }

        return result;
        
    }
}
```