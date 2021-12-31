package com.hanji.programmers.level1.크레인인형뽑기게임;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int height = board.length;
        int width = board[0].length;

        for (int move : moves) {

            int Y = move - 1;
            int target = 0;

            for (int X = 0; X < height; X++) {
                if (board[X][Y] > 0) {
                    target = board[X][Y];
                    board[X][Y] = 0;
                    break;
                }
            }


            if (target == 0) {
                continue;
            }

            if (stack.empty()) {
                stack.push(target);
            } else if (stack.peek() == target) {
                stack.pop();
                answer += 2;
            } else {
                stack.push(target);
            }

        }
        return answer;
    }
}
