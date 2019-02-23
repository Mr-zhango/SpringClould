package cn.myfreecloud.springcloud;

import cn.myfreecloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient     //整合Eureka并作为Eureka的客户端
//在启动改微服务的时候就能去加载我们自定义的Ribbon配置类,从而使之生效
//注意:MySelfRule这类的位置
//不能放在@ComponentScan所扫描的包下以及子包下,否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享,也就是说我们达不到特殊定制化的目的了
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
