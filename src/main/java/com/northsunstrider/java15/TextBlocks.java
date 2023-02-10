package com.northsunstrider.java15;

import org.junit.Test;

/**
 * @author North
 * @date 2022/09/15 java15新特性，文本块，用""" """表示，可保留文本格式
 */
public class TextBlocks {

    @Test
    public void TestTextBlocks() {
        String html = """
            <html>
            <body>
                <h1> hello world! </h1>
            </body>
            </html>
            """;
        System.out.println(html);
    }
}
