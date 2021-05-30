package com.cdp.utils;

import com.cdp.model.Department;
import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanMapUtils {

    public static <T> Map<String,Object> beanToMap(T bean){
        Map<String,Object> map = Maps.newHashMap();
        if (bean != null){
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()){
                map.put(key+"",beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将map转化为javabean对象
     * @param bean
     * @param <T>
     * @return
     */
    public static <T> Map<String,Object> beanToMapForUpdate(T bean){
        Map<String,Object> map = Maps.newHashMap();
        if (bean != null){
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()){
                map.put(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,"update_"+key),beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将map转化为javabean对象
     * @param map
     * @param bean
     * @param <T>
     * @return
     */
    public static <T> T mapToBean(Map<String,Object> map,T bean){
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    /**
     * 将list<T> 转化为List<Map<String,Object>>
     * @param objList
     * @param <T>
     * @return
     */
    public static <T> List<Map<String,Object>> objectsToMaps(List<T> objList){

        List<Map<String,Object>> list = Lists.newArrayList();
        if (objList != null && objList.size() > 0){
            Map<String,Object> map = null;
            T bean = null;
            for (int i = 0, size = objList.size(); i<size; i++){
                bean = objList.get(i);
                map = beanToMap(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 将List<Map<String,Object>>转化为list<T>
     * @param maps
     * @param tClass
     * @param <T>
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> List<T> mapsToObjects(List<Map<String,Object>> maps,Class<T> tClass) throws InstantiationException, IllegalAccessException{

        List<T> list = Lists.newArrayList();
        if (maps != null && maps.size() > 0){
            Map<String,Object> map = null;
            T bean = null;
            for (int i = 0, size = maps.size(); i<size; i++){
                map = maps.get(i);
                bean = tClass.newInstance();
                mapToBean(map,bean);
                list.add(bean);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Department department = new Department();
        department.setD_id(1);
        department.setD_name("user_name");
        Map<String, Object> stringObjectMap = beanToMap( department);
        System.out.println(stringObjectMap);
//        Map<String,Object> stringObjectMap2 = beanToMapForUpdate(department);
//        System.out.println(stringObjectMap2);
    }
}
