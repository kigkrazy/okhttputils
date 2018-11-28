package com.zhy.http.okhttp;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import okhttp3.Response;

public class Example {
    @Test
    public void test() throws IOException {
        Response response = OkHttpUtils
                .get()
                .url("http://2018.ip138.com/ic.asp")
                .proxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 1080)))
                .build()
                .execute();
        System.out.println("the ip addr : "  + new String(response.body().bytes(), "GB2312"));
    }
}
