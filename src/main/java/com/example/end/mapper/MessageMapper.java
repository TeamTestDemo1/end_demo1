package com.example.end.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.end.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface MessageMapper extends BaseMapper<Message> {

}
