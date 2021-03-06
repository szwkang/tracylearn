package cn.ibm.com.demo.rabbitmq.consumer2;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class},
        scanBasePackages = "cn.ibm.com.rabbitmqdemo.rabbitmq.consumer2")
@Profile("consumer2")
public class DirectQueueConsumer2 {

    @RabbitListener(queues = "queue2")
    public void receive(Channel channel, String in) {
        System.out.println("this is consumer2");
        System.out.println("Channel-" + channel.getChannelNumber() + " Received '" + in + "'" + System.nanoTime());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DirectQueueConsumer2.class, args);
        System.in.read();
    }
}
