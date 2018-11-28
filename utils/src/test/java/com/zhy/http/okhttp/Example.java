package com.zhy.http.okhttp;

import org.junit.Test;

import java.io.IOException;

import okhttp3.Response;

public class Example {
    @Test
    public void test() throws IOException {
        Response response = OkHttpUtils
                .get()
                .url("http://2018.ip138.com/ic.asp")
                .build()
                .execute();
        System.out.println("the respon : "  + response);
    }
}
