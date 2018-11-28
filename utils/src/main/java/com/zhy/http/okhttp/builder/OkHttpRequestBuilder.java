package com.zhy.http.okhttp.builder;

import com.zhy.http.okhttp.request.RequestCall;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class OkHttpRequestBuilder<T extends OkHttpRequestBuilder>
{
    protected String url;//url
    protected Object tag;//tag可以通过tag取消请求
    protected Map<String, String> headers;//header
    protected Map<String, String> params;//params
    protected int id;
    protected Proxy proxy;//代理

    public T id(int id)
    {
        this.id = id;
        return (T) this;
    }

    public T url(String url)
    {
        this.url = url;
        return (T) this;
    }


    public T tag(Object tag)
    {
        this.tag = tag;
        return (T) this;
    }

    public T headers(Map<String, String> headers)
    {
        this.headers = headers;
        return (T) this;
    }

    public T addHeader(String key, String val)
    {
        if (this.headers == null)
        {
            headers = new LinkedHashMap<>();
        }
        headers.put(key, val);
        return (T) this;
    }

    public T proxy(Proxy proxy)
    {
        this.proxy = proxy;
        return (T) this;
    }

    public abstract RequestCall build();
}
