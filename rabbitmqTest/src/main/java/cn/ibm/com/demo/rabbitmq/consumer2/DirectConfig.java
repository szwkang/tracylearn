package cn.ibm.com.demo.rabbitmq.consumer2;

import org.springframework.amqp.core.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DirectConfig {
    @Bean
    public DirectExchange direct() {
        return new DirectExchange("spring.routing");
    }

    @Bean
    public Queue queue1() {
        return new Queue("queue1");
    }

    @Bean
    public Queue queue2() {
        return new Queue("queue2");
    }

    @Bean
    @ConditionalOnBean(value = {Queue.class, DirectExchange.class})
    public Binding bind1(DirectExchange direct, Queue queue1) {
        return BindingBuilder.bind(queue1).to(direct).with("orange");
    }

    @Bean
    @ConditionalOnBean(value = {Queue.class, DirectExchange.class})
    public Binding bind2(DirectExchange direct, Queue queue2) {
        return BindingBuilder.bind(queue2).to(direct).with("green");
    }
}
