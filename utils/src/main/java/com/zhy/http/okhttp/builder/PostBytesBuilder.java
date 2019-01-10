package com.zhy.http.okhttp.builder;

import com.zhy.http.okhttp.request.PostBytesRequest;
import com.zhy.http.okhttp.request.PostStringRequest;
import com.zhy.http.okhttp.request.RequestCall;

import okhttp3.MediaType;

/**
 * Created by zhy on 15/12/14.
 */
public class PostBytesBuilder extends OkHttpRequestBuilder<PostBytesBuilder> {
    private byte[] content;
    private MediaType mediaType;

    public PostBytesBuilder content(byte[] content) {
        this.content = content;
        return this;
    }

    public PostBytesBuilder mediaType(MediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RequestCall build() {
        return new PostBytesRequest(url, tag, params, headers, content, mediaType, id).build();
    }
}
