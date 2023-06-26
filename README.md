# SpringBoot

- 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
- 例如：本来应该到success.jsp页面的，则其显示success.
- 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
- 如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
- 預設view 都放在classpath/template 底下
- application.properties  設定spring 一些屬性server.port=8081 指定run 時的port

CLOB 配置
```java
@Column(name="DESCRIPTION", columnDefinition="CLOB NOT NULL")
@Lob
String DESCRIPTION;
```
Long Raw字段的JPA配置

```java
@Basic(fetch = FetchType.LAZY)
@Column(name = "FILE_DATA")
byte[] FILE_DATA;
```

Controller如果與Application不同package , 不work的話加上
```java
@ComponentScan({"com.example.controller"})
 ```
 
模板引擎Thymeleaf

```xml
<dependency>
<groupId>org.springframework.boot</groupId> 
<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

|  Example   | Note  |
|  ----  | ----  |
| SpringBootRestApiExample  | Rest開發風格範例 |
| SpringSecurityLoginTutorial-mysql   | 利用SpringSecurity 進行login DB為mysql |
| demo | springmvc 前端為jsp |
| demo3   | springmvc 前端為jsp version 3 |
| spring-boot-example-02   | TEST |
| springboot-web-app   | TEST |
| Springboot view   | https://github.com/max12311023/SpringBoot demo3|

|  Annotation   | Note  |
|  ----  | ----  |
| @RestController  | 注解相当于@ResponseBody ＋ @Controller合在一起的作用。 |
| @SpringBootApplication  | 注解等於使用@Configuration，@EnableAutoConfiguration和@ComponentScan。 |
| @Configuration  | 表示這個類別是用來做為spring 設定。 |
| @EnableAutoConfiguration  | 啟用Spring Boot 自動配置，將自動判斷專案使用到的套件，建立相關的設定。 |
| @ComponentScan  | 自動掃描Spring Bean 元件。 |
| @Controller  | 控制層組件，用於標示controller類別。 |
| @ResponseBody  | 用來輸出HTTP body資訊。 |
| @RequestMapping  | 指定URL為/index會被對應到此index()方法 |
 
 參考<br>
http://ithelp.ithome.com.tw/articles/10161665<br>
http://jinnianshilongnian.iteye.com/blog/1997192

