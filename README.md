# SpringBoot
Spring Boot Test

IMB2 
公佈欄系統範例

SpringBootRestApiExample 
Rest開發風格範例

SpringSecurityLoginTutorial-mysql 
利用SpringSecurity 進行login DB為mysql

demo  
springmvc 前端為jsp

demo3
springmvc 前端為jsp version 3

spring-boot-example-02
springboot-web-app
網路範例



參考


http://ithelp.ithome.com.tw/articles/10161665


http://jinnianshilongnian.iteye.com/blog/1997192



@RestController is a stereotype annotation that combines @ResponseBody and @Controller.
意思是：
@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。

1)如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
例如：本来应该到success.jsp页面的，则其显示success.

2)如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
3)如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。

CLOB 配置

@Column(name="DESCRIPTION", columnDefinition="CLOB NOT NULL")
@Lob
String DESCRIPTION;

Long Raw字段的JPA配置

@Basic(fetch = FetchType.LAZY)
@Column(name = "FILE_DATA")
byte[] FILE_DATA;

CascadeType 與 FetchType

在 關聯映射中，如一對一、一對多、多對一等，都有設定cascade為CascadeType.ALL，這表示儲 存其中一方實例時，若有參考至另一方實例，另一方實例也一併儲存，這個稱之為聯級（Cascade）操作。

預設是不使用聯級操作，而可設定的聯級操作如下所示：
CascadeType.PERSIST
在儲存時一併儲存 被參考的物件。
CascadeType.MERGE
在合併修改時一併 合併修改被參考的物件。
CascadeType.REMOVE
在移除時一併移除 被參考的物件。
CascadeType.REFRESH
在更新時一併更新 被參考的物件。
CascadeType.ALL
無論儲存、合併、 更新或移除，一併對被參考物件作出對應動作。

在 一對多 中略為介紹過Fetch模式，FetchType.LAZY時， 除非真正要使用到該屬性的值，否則不會真正將資料從表格中載入物件，所以EntityManager後，才要載入該屬性值，就會發生例外錯誤，解決的方式 之一是在EntityManager關閉前取得資料，另一個方式則是標示為FetchType.EARGE， 表示立即從表格取得資料。

一些標註的Fetch模式有其預設值，例如：
@Basic
FetchType.EARGE
@OneToOne
FetchType.EARGE
@ManyToOne
FetchType.EARGE
@OneToMany
FetchType.LAZY
@ManyToMany
FetchType.LAZY

不過，即使標註為FetchType.LAZY，此一 標註僅為建議，實作廠商仍可以將之實作為FetchType.EARGE。

使用@SpringBootApplication注解等於使用@Configuration，@EnableAutoConfiguration和@ComponentScan。
@Configuration，表示這個類別是用來做為spring 設定。
@EnableAutoConfiguration，啟用Spring Boot 自動配置，將自動判斷專案使用到的套件，建立相關的設定。
@ComponentScan，自動掃描Spring Bean 元件
 
 
使用@RestController註解，等於使用@Controller和@ResponseBody。
@Controller，控制層組件，用於標示controller類別。
@ResponseBody，用來輸出HTTP body資訊。
@RequestMapping，指定URL為/index會被對應到此index()方法
5.撰寫完上述兩支類別後，我們可以直接執行JavaApplication，執行後可以從console看到印出的訊息，包括Spring Boot的版本以及
 
來自 <http://blog.xuite.net/hs19890622/job/385041630-%E5%BB%BA%E7%AB%8B%E7%B0%A1%E5%96%AE%E7%9A%84spring+boot+%E5%B0%88%E6%A1%88>
 
 
 
Controller如果與Application不同package , 不work的話
加上@ComponentScan({"com.example.controller"})
 
application.properties  設定spring 一些屬性
server.port=8081 指定run 時的port
 
Springboot view部分
參考
https://github.com/max12311023/SpringBoot demo3
 
模板引擎Thymeleaf

<dependency>
 
 
<groupId>org.springframework.boot</groupId>
 
<artifactId>spring-boot-starter-thymeleaf</artifactId>
 
</dependency>

 
 
預設view 都放在classpath/template 底下
