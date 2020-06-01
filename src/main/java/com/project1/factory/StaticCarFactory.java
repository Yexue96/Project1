package com.project1.factory;

import com.project1.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
    private static Map<Long, Car> carMap;
    //静态代码块
    static {
        carMap = new HashMap<Long, Car>();
        carMap.put(1L, new Car(1L,"宝马"));
        carMap.put(2L,new Car(2L,"奔驰"));
    }

    public static Car getCar(long id){
        return carMap.get(id);
    }
}
