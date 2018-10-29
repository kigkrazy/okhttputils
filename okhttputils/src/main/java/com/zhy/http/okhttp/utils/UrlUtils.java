package com.zhy.http.okhttp.utils;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

public class UrlUtils {
    public static String map2Form(Map<String, String> paramMaps, boolean isUrlEncode) {
        try {
            String rel = "";
            Iterator<Map.Entry<String, String>> iter = paramMaps.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();

                String key = entry.getKey();
                String val = entry.getValue();

                if (isUrlEncode) {
                    key = URLEncoder.encode(key, "utf-8");
                    val = URLEncoder.encode(val, "utf-8");
                }
                rel += key + "=" + val + "&";
            }
            if (!rel.equals(""))
                rel = rel.substring(0, rel.length() - 1);
            return rel;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
}
