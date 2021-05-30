package com.cdp.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapController {
    private static final int SUCCESS_CODE = 0;
    private static final int ERROR_CODE = 500;

    private Map<String,Object> paramMap = new HashMap<>();

    private MapController(){

    }
    public static MapController getInstance(){
        return new MapController();
    }
    public Map<String,Object> getMap(){
        return paramMap;
    }
    public MapController put(String key, Object val){
        paramMap.put(key,val);
        return this;
    }
    public MapController put(Map<String,Object> map){
        for (Map.Entry<String,Object> entry : map.entrySet()){
            paramMap.put(entry.getKey(),entry.getValue());
        }
        return this;
    }
    public MapController add(String key, Object val){
        return this.put(key,val);
    }

    public MapController success(){
        return this.put("msg","操作成功！").put("code",SUCCESS_CODE);
    }

    public MapController error(){
        return this.put("msg","操作失败！").put("code",ERROR_CODE);
    }
    public MapController success(String str){
        return this.put("msg",str).put("code",SUCCESS_CODE);
    }

    public MapController error(String str){
        return this.put("msg",str).put("code",ERROR_CODE);
    }

    public MapController page(List<?> data,Integer count){
        return this.put("msg","返回成功！")
                .put("code",SUCCESS_CODE)
                .put("data",data)
                .put("count",count);
    }
}
