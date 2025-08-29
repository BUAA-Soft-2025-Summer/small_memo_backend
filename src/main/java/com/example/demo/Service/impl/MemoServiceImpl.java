package com.example.demo.Service.impl;

import com.example.demo.Entity.Memo;
import com.example.demo.Mapper.MemoMapper;
import com.example.demo.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoMapper memoMapper;

    @Override
    public List<Memo> unDeleteList() {
        return memoMapper.unDeleteList();
    }

    @Override
    public List<Memo> deleteList() {
        return memoMapper.deleteList();
    }

    @Override
    public int deleteMemo(Integer id) {
        return memoMapper.deleteMemo(id);
    }

    @Override
    public int deleteMemoTotally(Integer id) {
        return memoMapper.deleteMemoTotally(id);
    }

    @Override
    public int addMemo(String title, String createTime, String content) {
        return memoMapper.addMemo(title,createTime,content);
    }
}
