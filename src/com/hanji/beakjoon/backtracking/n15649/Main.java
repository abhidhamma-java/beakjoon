package com.hanji.beakjoon.backtracking.n15649;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

//백트래킹1
public class Main {
    public static int N;
    public static int M;
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정적변수 N과 M을 초기화해준다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        //M개를 담고 다 담으면 StringBuilder에 쌓고 리턴한다
        arr = new int[M];

        //중복되는 노드를 방문하지 않기위한 배열
        visit = new boolean[N];

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {

            //중복이 아니면(false) 방문한다
            if (!visit[i]) {
                //방문하고나면 방문할 수 없게 true 로 바꾼다
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);

                //자식노드 방문이 끝나고 돌아오면
                //방문노드를 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }
}
