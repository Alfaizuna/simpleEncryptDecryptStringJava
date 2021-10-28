package com.encryptdecrypt.testjava.service;

import org.springframework.stereotype.Service;

@Service
public class RestApiService {

    int key = 11;

    public String encrypt(String string) {
        String text = "";
        char[] chars = string.toCharArray();
        for (char c : chars) {
            c += key;
            text = text + c;

        }
        return text;
    }

    public String decrypt(String string) {
        String text = "";

        char[] chars = string.toCharArray();
        for (char c : chars) {
            c -= key;
            text = text + c;

        }
        return text;
    }
}
