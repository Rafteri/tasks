package com.fsep.servlet.utils;

/**
 * 30.09.16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class HTML {
    public static final String Hello(String name) {
        return "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                " \t<meta charset=\"utf-8\">\n" +
                "\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                "\t<tr>\n" +
                "\t\t<td align=\"center\" style=\"font-size: 80px; line-height: 85px; font-family: Helvetica, Arial, sans-serif; color: #333333; padding-top: 15%;\" class=\"padding-copy\">\n" +
                "\t\t\t\t\t\tПривет, " + name + "!\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "</html>";
    }
}
