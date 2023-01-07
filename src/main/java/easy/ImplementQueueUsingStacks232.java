package easy;

import java.util.LinkedList;

/**
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 *
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 *
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */
/*
Runtime 0 ms Beats 100%
Memory 40 MB Beats 99.5%
 */
public class ImplementQueueUsingStacks232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(5);
        obj.push(4);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.printf("param_2: %d, param_3: %d, param_4: %b", param_2, param_3, param_4);


    }

    static class MyQueue {
        private static LinkedList<Integer> s1, s2;

        public MyQueue() {
            s1 = new LinkedList<>();
            s2 = new LinkedList<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) s2.push(s1.pop());
            }
            return s2.pop();
        }

        public int peek() {
            if (!s2.isEmpty()) {
                return s2.peek();
            } else {
                while (!s1.isEmpty()) s2.push(s1.pop());
            }
            return s2.peek();
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }

    }
}
