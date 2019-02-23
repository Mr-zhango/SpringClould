package cn.myfreecloud.springcloud.service;

import cn.myfreecloud.springcloud.entity.Dept;

import java.util.List;

/**
 * 真正服务提供者的接口
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}