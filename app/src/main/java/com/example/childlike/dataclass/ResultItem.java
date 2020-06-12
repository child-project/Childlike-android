package com.example.childlike.dataclass;

public class ResultItem {

    String img;
    String date, result;

    public ResultItem(String img, String date, String result) {
        this.img = img;
        this.date = date;
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public String getImg() {
        return img;
    }

    public String getResult() {
        return result;
    }
}
