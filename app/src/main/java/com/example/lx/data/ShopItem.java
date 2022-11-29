package com.example.lx.data;

import java.io.Serializable;

public class ShopItem implements Serializable {


    public ShopItem(String title, String author, int resourceId) {
        this.title = title;
        this.author = author;
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    private String title;
    private String author;
    private int resourceId;
}
