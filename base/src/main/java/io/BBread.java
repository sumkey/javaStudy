package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alibeibei on 2017/12/5.
 */
public class BBread {
    public static void main(String[] args) {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                c = (char) br.read();
                System.out.println("c=" + c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');
    }
}
