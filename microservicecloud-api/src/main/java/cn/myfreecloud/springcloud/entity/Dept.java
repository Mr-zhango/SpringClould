package cn.myfreecloud.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//无参构造
@NoArgsConstructor
//@AllArgsConstructor
//自动加setGet
@Data
//链式编程支持
@Accessors(chain=true)
public class Dept implements Serializable{  // entity --orm--- db_table

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }


}
