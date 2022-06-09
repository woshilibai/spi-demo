# spi-demo

# 要使用Java SPI，需要遵循如下约定：
1、当服务提供者提供了接口的一种具体实现后，在jar包的META-INF/services目录下创建一个以“接口全限定名”为命名的文件，内容为实现类的全限定名；
2、接口实现类所在的jar包放在主程序的classpath中；
3、主程序通过java.util.ServiceLoder（可以跨越jar包获取META-INF下的配置文件）动态装载实现模块，它通过扫描META-INF/services目录下的配置文件找到实现类的全限定名，把类加载到JVM；
4、SPI的实现类必须携带一个不带参数的构造方法；

Java SPI机制=面向接口编程+策略模式+配置文件，实现动态加载机制。
根据调用者实际使用需要，启用、扩展或者替换框架的实现策略。

# 比较常见的例子：
## 数据库驱动加载接口实现类的加载
JDBC加载不同类型数据库的驱动
## 日志门面接口实现类加载
SLF4J加载不同提供商的日志实现类