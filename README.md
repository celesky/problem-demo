
# problem-demo
gateway problem
### step1: 
start eureka, it will run at localhost:1111
### step2: 
start sms-service,it will run at localhost:8080 ,
you can access this interface directly from
http://localhost:8080/sms/send
In order to reproduce the problem, I set a sleep time of 60 seconds.
### step3:
start gateway-server,it will run at localhost:7001
now access the interface through gateway 

http://localhost:7001/sms-service/sms/send
