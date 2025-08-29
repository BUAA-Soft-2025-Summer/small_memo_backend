package com.example.demo.Mapper;

import com.example.demo.Entity.Memo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemoMapper {
    @Select("select * from memo where deleteFlag = 0")
    public List<Memo> unDeleteList();
    @Select("select * from memo where deleteFlag = 1")
    public List<Memo> deleteList();
    @Update("update memo set deleteFlag = 1 where id = #{id}")
    public int deleteMemo(Integer id);
    @Delete("delete from memo where id = #{id}")
    public int deleteMemoTotally(Integer id);
    @Insert("INSERT INTO Memo(id, title, createTime, content,deleteFlag) VALUES (NULL,#{title},#{createTime},#{content},0)")
    public int addMemo(String title,String createTime,String content);
}

