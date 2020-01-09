package com.java.DesignPattern.Behavioral.Interpreter.Exam01;

import java.util.StringTokenizer;

public class Context {

    // StringTokenizer 클래슨는 공백, 탭, 줄바꿈, 캐리지 리턴, 폼피트로 구분해서 토큰(단어)로 나눠줌.
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    // 다음 토큰을 얻는다.
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }

        return currentToken;
    }

    // 현재 토큰을 얻는다.
    public String currentToken() {
        return currentToken;
    }

    // 주어진 토큰을 스킵한다.
    public void skipToken(String token) throws ParseException {

        // 없다면 예외 발생
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning : " + token + "is expected, but " + currentToken + "is found.");
        }

        // 다음 것을 가리킴
        nextToken();
    }

    // 현재 숫자를 가져옴.
    public int currentNumber() throws ParseException {

        int number = 0;

        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }

        return number;
    }

}
