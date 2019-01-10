package com.zhy.http.okhttp;

import org.junit.Test;

import java.io.IOException;

public class PostBytesTest {
    @Test
    public void test() throws IOException {
        String url = "";
        OkHttpUtils
                .postBytes()
                .url(url)
                .content("xxxx".getBytes())
                .build()
                .execute();
    }
}
