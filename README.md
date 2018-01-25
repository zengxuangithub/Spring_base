# Spring 基础配置
- ## 配置文件
```
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id="helloWorld" class="main.HelloWorld">
       <property name="message" value="Hello World!"/>
   </bean>

</beans>
```
- ## 对应的bean
```
package main;

public class HelloWorld {
	   private String message;
	 
	    //提供set方法给Spring容器使用
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
}

```


- ## 在业务中使用
```

package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ApplicationContext context=new  ClassPathXmlApplicationContext("beans.xml");
		 HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
	         helloWorld.getMessage();
	
	}

}



```
