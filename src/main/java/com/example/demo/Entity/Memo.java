package com.example.demo.Entity;

public class Memo {
    private  Integer id;
    private  String title;
    private  String createTime;
    private  String content;

    public Memo() {
    }

    public Memo(Integer id, String title, String createTime, String content) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
