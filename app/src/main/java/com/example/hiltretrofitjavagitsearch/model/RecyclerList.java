package com.example.hiltretrofitjavagitsearch.model;

import java.util.List;

public class RecyclerList {

    private List<RecyclerData> items;

    public RecyclerList(List<RecyclerData> items) {
        this.items = items;
    }

    public List<RecyclerData> getItems() {
        return items;
    }

    public void setItems(List<RecyclerData> items) {
        this.items = items;
    }
}
