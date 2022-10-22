package com.example.app_alll;

public class recom {
    private int src_img;
    private String text1;
    public recom(int src_img, String text) {
        this.src_img = src_img;
        this.text1 = text;
    }
    public int getSrc_img() {
        return src_img;
    }
    public void setSrc_img(int src_img) {
        this.src_img = src_img;
    }
    public String getText1() {
        return text1;
    }
    public void setText(String text) {
        this.text1 = text;
    }
}
