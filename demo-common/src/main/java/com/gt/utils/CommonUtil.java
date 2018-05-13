package com.gt.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/2.
 */
public class CommonUtil {
    private CommonUtil() {
    }
    /**
     * 返回json数据到客户端
     *
     * @param response
     * @param obj
     * @throws IOException
     */
    public static void write(HttpServletResponse response, Object obj) throws IOException {
        response.setCharacterEncoding("UTF-8");
        if (obj instanceof List || obj instanceof Object[]) {
            response.getWriter().print(com.alibaba.fastjson.JSONArray.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss"));
        }else{
            response.getWriter().print(JSONObject.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss"));
        }
        response.getWriter().flush();
        response.getWriter().close();
    }
}