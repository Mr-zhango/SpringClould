package cn.myfreecloud.springcloud.cfgbeans;

import cn.myfreecloud.myrule.RandomRule_ZY;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml

    @Bean
    @LoadBalanced       //配置Ribbon客户端自带负载均衡//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        //return new RetryRule();//服务调用失败超过3次就放弃该服务
        return new RandomRule_ZY();//自定义的服务调用配置,每个服务消费5次
    }
}

//传统SpringMVC的配置
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
