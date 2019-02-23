package cn.myfreecloud.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();
        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
        //return new RetryRule();//服务调用失败超过3次就放弃该服务
        return new RandomRule_ZY();//新需求,使用轮询策略,让每个服务被调用5次
    }
}
