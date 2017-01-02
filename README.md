##1.Introduction  
这是一个 Spring Boot 简单集成 JDBC Template的例子  
  
涉及的知识点有:  
1. Spring Boot  
2. JDBC Template  
3. /Controller /Service /DAO  
4. Spring Boot 链接 MySQL  
5. MAVEN项目管理工具

在这个例子中，严格的按照Spring Boot 层次关系的结构进行命名和文件布置
  
##2.启动方式
- 参考`application.properties`中的配置信息，链接MySQL，新建schema和数据库表
- 本机安装配置maven  

然后，可以用maven的命令进行项目装载，例如  
	`mvn build`  
	`mvn package`  
	`mvn install`  
接着用spring-boot的插件启动项目  
	`mvn spring-boot:run`  
跑起来之后，用任意浏览器，输入`http://localhost:8080/test`就可以了  

##3.值得注意的点  
这个例子用到了Spring Boot的开发者工具，即，当项目有更改的时候，会自动更新项目  

`若需要引用，请查看 pom.xml中的dependency 和 plugin`

