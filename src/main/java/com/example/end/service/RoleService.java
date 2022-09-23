package com.example.end.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.end.mapper.RoleMapper;
import com.example.end.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService extends ServiceImpl<RoleMapper, Role> {

    @Resource
    private RoleMapper roleMapper;

}
