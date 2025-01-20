package com.avinash.madha.dao;

import java.util.ArrayList;
import java.util.List;

public class HomeDao {
    private List<String> list = new ArrayList<>(List.of("Me", "Mine", "Myself", "MyKnowledge", "MyHouse", "MyFamily"));

    public String fetchInformation() {
        return list.get(3);
    }
}
