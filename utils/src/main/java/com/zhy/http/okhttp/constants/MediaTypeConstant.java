package com.zhy.http.okhttp.constants;

import okhttp3.MediaType;

public class MediaTypeConstant {
    public static MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");
    public static MediaType MEDIA_TYPE_FORM = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    public static MediaType MEDIA_TYPE_XML = MediaType.parse("application/xml; charset=utf-8");
}
