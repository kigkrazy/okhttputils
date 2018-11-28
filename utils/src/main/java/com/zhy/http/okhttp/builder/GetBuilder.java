package com.zhy.http.okhttp.builder;

import com.zhy.http.okhttp.request.GetRequest;
import com.zhy.http.okhttp.request.RequestCall;
import com.zhy.http.okhttp.utils.UrlUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhy on 15/12/14.
 */
public class GetBuilder extends OkHttpRequestBuilder<GetBuilder> implements HasParamsable {
    @Override
    public RequestCall build() {
        if (params != null) {
            try {
                url = appendParams(url, params);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return new GetRequest(url, tag, params, headers, id).build();
    }

    /**
     * 添加参数
     *
     * 修改去除安卓API的引用
     *
     * @param url
     * @param params
     * @return
     * @throws URISyntaxException
     */
    protected String appendParams(String url, Map<String, String> params) throws URISyntaxException {
        if (url == null || params == null || params.isEmpty()) {
            return url;
        }
        String realUrl = url;
        String paramsForm = UrlUtils.map2Form(params, true);
        //todo url解析
        URI uri = new URI(url);
        if (uri.getQuery() != null) {
            realUrl = realUrl + "&" + paramsForm;
        } else {
            realUrl = realUrl + "?" + paramsForm;
        }
        return realUrl;
    }

//    protected String appendParams(String url, Map<String, String> params) {
//        if (url == null || params == null || params.isEmpty()) {
//            return url;
//        }
//        Uri.Builder builder = Uri.parse(url).buildUpon();
//        Set<String> keys = params.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            builder.appendQueryParameter(key, params.get(key));
//        }
//        return builder.build().toString();
//    }

    @Override
    public GetBuilder params(Map<String, String> params) {
        this.params = params;
        return this;
    }

    @Override
    public GetBuilder addParams(String key, String val) {
        if (this.params == null) {
            params = new LinkedHashMap<>();
        }
        params.put(key, val);
        return this;
    }
}
