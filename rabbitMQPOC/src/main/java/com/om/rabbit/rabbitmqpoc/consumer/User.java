package com.om.rabbit.rabbitmqpoc.consumer;

/*import com.om.rabbit.rabbitmqpoc.config.MessagingConfig;*/
import com.om.rabbit.rabbitmqpoc.dto.MenuOrder;
import com.om.rabbit.rabbitmqpoc.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
   /* @RabbitListener(queues = MessagingConfig.QUEUE)  // Once uncomment then start receiving msg from queue : messagingConfig class
   public void consumerMessageFromQueue(OrderStatus status){
        System.out.println("Message Recieved from queus : "+status);
    }*/
    @RabbitListener(queues = "rabbitmq.queue", id = "listener1")
    public void consumerRabbitMQ(MenuOrder status){
        System.out.println("Message Recieved from queus : "+status);
    }
}
