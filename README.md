这是一个 Spring Boot 简单集成 JDBC Template的例子

在这个例子中，严格的按照Spring Boot 层次关系的结构进行命名和文件布置

这个例子用到了Spring Boot的开发者工具，即，当项目有更改的时候，会自动更新项目
<br/>
`若需要引用，请查看 pom.xml中的dependency 和 plugin`

这个项目用maven进行项目管理

所以，可以直接用maven的命令装载该项目：
eg.mvn build / mvn package / mvn install 
<br/>
`当然前提是，你本机安装配置了maven`

首先，请查看application.properties先进行本地数据库的配置    
1.新建schema  
2.建立user表以及字段

项目装载后，可以用`mvn spring-boot:run`来运行程序  
然后通过任何浏览器，输入localhost:8080/test 即可查看到运行结果