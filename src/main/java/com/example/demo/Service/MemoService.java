package com.example.demo.Service;

import com.example.demo.Entity.Memo;

import java.util.List;

public interface MemoService {
    public List<Memo> unDeleteList();
    public List<Memo> deleteList();
    public int deleteMemo(Integer id);
    public int deleteMemoTotally(Integer id);
    public int addMemo(String title,String createTime,String content);
}
