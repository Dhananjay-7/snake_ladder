package repository;

import dto.Snake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
package com.dk.package.repository;

public class SnakeRepository {


    public static Map<Integer, Integer> getStartLastMap() {
        return startLastMap;
    }

    public SnakeRepository() {
        startLastMap = new HashMap<>();
    }

    static  Map<Integer,Integer> startLastMap;
}

