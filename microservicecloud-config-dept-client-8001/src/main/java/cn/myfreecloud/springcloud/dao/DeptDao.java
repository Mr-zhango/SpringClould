package cn.myfreecloud.springcloud.dao;

import cn.myfreecloud.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//SpringBoot和Mybatis整合使用的注解
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
