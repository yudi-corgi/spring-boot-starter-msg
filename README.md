# spring-boot-starter-msg
自定义 SpringBoot starter 组件，模拟第三方短信服务的调用。该项目只是拿来练一下 starter 组件自定义以及做个代码笔记，极其简陋。 

#### 项目依赖
1. JDK 1.8
2. SpringBoot 2.5.5
3. Maven 构建

#### 使用方式
1. clone 项目到本地后，使用 Maven 编译打包到本地仓库（或发布私有/远程仓库）
2. 在其它项目中导入该项目依赖
3. 在 application.yml 文件进行参数配置，参考 `SmsProperties.java` 类中属性
```yaml
sms:
  enabled: true  # 默认 false
  url: xxx.com
  keyId: abc
  keySecret: 123
```
4. 注入 SmsService 对象即可
