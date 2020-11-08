# B-spring-ioc-container-homework
## 主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？
***
简单来说，@Component是针对类的注解，而@Bean是针对方法的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。

如果想要将第三方库中的组件import到自己的应用中，但是打包好的jar包，我们并不能在class上面加@Component注解，在这种情况下就需要使用@Bean。

@Component注解在Spring的Application运行之时就被IOC容器扫描并配置Bean，而@Bean注解则是在配置中显示的声明单个Bean

```
@Configuration
public class MyClass {
  // class1和class2就是jar包里写好的
  @Bean
  public Class1 getClass1() {
    return new Class1();
  }
  @Bean
  public Class2 getClass1() {
    return new Class2();
  }
  .....
}
```
