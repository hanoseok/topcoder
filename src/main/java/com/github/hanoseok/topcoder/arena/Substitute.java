package com.github.hanoseok.topcoder.arena;

import java.util.Scanner;

/**
 * Created by hanoseok on 2016. 11. 9..
 */
public class Substitute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String code = sc.nextLine();
        System.out.println(new Substitute().getValue(key, code));

    }

    public int getValue(String key, String code) {
        String result = new String();
        char keys[] = key.toCharArray();
        char codes[] = code.toCharArray();
        for (char c : codes) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] == c) {
                    result += ((i + 1) % 10);
                    break;
                }
            }
        }
        return Integer.parseInt(result);
    }
}