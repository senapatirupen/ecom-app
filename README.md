##### Install and configure kafka on windows
    >   https://www.youtube.com/watch?v=EUzH9khPYgs
    >   download and unzip kafka and rename folder to kafka and place it inside c drive
    >   open server.properties file from config directory and change log file location
        log.dirs=c:/kafka/kafka-logs
    >   open zookeeper.properties file from config directory and change data file location
        dataDir=c:/kafka/zookeeper-data
    >   command to start zookeeper server
        .\bin\windows\kafka-server-start.bat .\config\zookeeper.properties
    >   command to start kafka
        .\bin\windows\kafka-server-start.bat .\config\server.properties
    >   command to start the topics
        .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic TestTopic 
    >   create another topic
        .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic NewTopic
    >   command to list all the topics
        .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
    >   command to create messages to producer
        .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic TestTopic
        > Test data
        > Hello world!
    >   command to consume topic input data
        .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic TestTopic --from-beginning
##### Install and configure RabbitMQ on windows
    >   https://www.youtube.com/watch?v=V9DWKbalbWQ&t=148s
    >   Erlang is available for download at www.erlang.org/downloads (download OTP 23.3 64bit)
        https://erlang.org/download/otp_win64_23.3.exe
    >   Dowonload RabbitMQ from https://www.rabbitmq.com/download.html
        https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.19/rabbitmq-server-3.8.19.exe
    >   Now install erlang first then rabbitmq
    >   open RabbitMQ cmd and type below command
        rabbitmq-plugins enable rabbitmq_management
    >   sbin/rabbitmq-server.bat to start the rabbitmq server  // not require if you have installed the server by running exe file
    >   open localhost:15672 with and provide guest/guest
        