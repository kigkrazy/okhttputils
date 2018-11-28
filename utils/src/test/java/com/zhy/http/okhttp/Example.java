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
                .build()
                .writeTimeOut(10000)//写超时时间
                .readTimeOut(10000)//读超时时间
                .connTimeOut(10000)//连接超时时间
                .proxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 1080)))
                .execute();
        System.out.println("the ip addr : "  + new String(response.body().bytes(), "GB2312"));
    }
}
