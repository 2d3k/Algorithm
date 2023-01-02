# 문제

Implement a first in first out (FIFO) queue using only two stacks. 
The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
먼저 들어온 것이 먼저 나가는 (선입선출) '큐'를 오직 두가지 스택을 사용해서 구현하라.
구현된 큐는 모든 큐의 기능에 사용할 수 있다(push, peek, pop, empty)

Implement the MyQueue class:
MyQueue를 구현하세요.

`void push(int x)` Pushes element x to the back of the queue.
`void push(int x)`는 x를 큐의 뒤로 밀어낸다.
`int pop()` Removes the element from the front of the queue and returns it.
`int pop()`은 큐의 맨 앞의 요소를 제거하고 그것을 반환한다.
`int peek()` Returns the element at the front of the queue.
`int peek()`은 큐의 맨 앞의 요소를 반환한다.
`boolean empty()` Returns true if the queue is empty, false otherwise.
`boolean empty()`은 만약 큐가 비어있으면 true를 반환하고, 비어있지 않다면 false를 반환한다.

Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
반드시 스택의 표준 운영만을 사용하세요. 즉, 맨 위에서 밀어내기, 맨 위에서 보기/팝하기, 크기 및 빈 작업만 사용할 수 있습니다.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
언어에 따라 스택이 기본적으로 지원되지 않을 수 있습니다. 스택의 표준 작업만 사용하는 경우 리스트 또는 데크(이중 종단 큐)를 사용하여 스택을 시뮬레이션할 수 있습니다.

Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false


Constraints:
제약 조건

1 <= x <= 9
At most 100 calls will be made to push, pop, peek, and empty.
push, pop, peek, empty를 최대 100번 호출.
All the calls to pop and peek are valid.
pop, peek는 모든 호출에 유효.

Follow-up:
후속 조치

Can you implement the queue such that each operation is amortized O(1) time complexity?
각 작업의 시간 복잡성이 O(1) 되도록 대기열을 구현할 수 있습니까?
In other words, performing n operations will take overall O(n) time even if one of those operations may take longer.
즉, n개의 연산을 수행하는 데는 그 연산 중 하나가 더 오래 걸릴 수 있더라도 전체 O(n) 시간이 소요됩니다.

# 문제 풀이

```java
class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        if (output.empty()) {
            while(!input.empty()) {
                output.push(input.pop());
            }
        }

        return output.pop();

    }

    public int peek() {

        if (output.empty()) {
            while(!input.empty()) {
                output.push(input.pop());
            }
        }

        return output.peek();

    }

    public boolean empty() {
        return input.size() == 0 && output.size() == 0 ? true:false;
    }
}

```

# 문제점

pop과 peek에 공통으로 들어가는 부분을 따로 메소드로 만들어 사용하면 더 깔끔한 코드를 만들 수 있다.
```java
if (output.empty()) {
    while(!input.empty()) {
    output.push(input.pop());
    }
}
```