package com.task.chapter1.task11;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        //test String
//        String input = "-lrb-300-rrb-┬á922-6590";
        System.out.println("Text: ");
        Scanner in = new Scanner(System.in);
        String lineOfText = in.next();

       Pattern noASCII = Pattern.compile("\\p{ASCII}");
        Matcher matcher = noASCII.matcher(lineOfText);
        String cos = matcher.replaceAll("");
        System.out.print(cos);
    }
}
