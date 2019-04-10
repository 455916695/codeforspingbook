package com.decisive.base.String;

import java.util.regex.Matcher;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class StringTest {

    public boolean match(String matchStr) {
        return matchStr.matches("\\d");//匹配一个数字
    }

    public static void main(String[] args) {

        StringTest stringTest = new StringTest();

        boolean match = stringTest.match("4");  // true
        System.out.println(match);
        match = stringTest.match("45");  // false
        System.out.println(match);
        match = stringTest.match("zx");  // false
        System.out.println(match);
        match = stringTest.match("");  // false
        System.out.println(match);


    }

}
