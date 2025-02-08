
启动顺序：

先启动 eureka-server（废除了，不用了，本地要开启nacos,然后再配置那里填写好nacos）

再启动 service-provider

最后启动 service-consumer

访问验证：

Eureka控制台：http://localhost:8761

直接调用提供者：http://localhost:8081/api/hello

通过消费者调用：http://localhost:8082/test/call
