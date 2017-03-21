package com.jk.rx.multitype;

import android.support.annotation.NonNull;

/**
 * Created by ZC on 2017/3/21.
 */
public class Category {
    @NonNull
    private String name;

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}