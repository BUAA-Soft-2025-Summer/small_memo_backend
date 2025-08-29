package com.example.demo.Controller;

import com.example.demo.Entity.Memo;
import com.example.demo.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    public MemoService memoService;


    @PostMapping("/add")
    public String add(@RequestBody Map<String,Object> params) {
        String title = (String) params.get("title");
        String createTime = (String) params.get("createTime");
        String content = (String) params.get("content");
        memoService.addMemo(title,createTime,content);
        return "增加成功";
    }
    @PostMapping("/delete")
    public String delete(@RequestBody Map<String,Object> params) {
        Integer id = (Integer) params.get("id");
        memoService.deleteMemo(id);
        return "删除成功";
    }
    @PostMapping("/deleteTotally")
    public String deleteTotally(@RequestBody Map<String,Object> params) {
        Integer id = (Integer) params.get("id");
        memoService.deleteMemoTotally(id);
        return "彻底删除成功";
    }
    @GetMapping("/get/undelete")
    public List<Memo> getUnDeleteList() {
        return memoService.unDeleteList();
    }

    @GetMapping("/get/delete")
    public List<Memo> getDeleteList() {
        return memoService.deleteList();
    }
}