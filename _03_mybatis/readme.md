#mybatis练习三
新增加了mybatis-config.xml配置
```xml
<?xml version="1.0" encoding="UTF8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<!--configuration核心配置文件-->
<configuration>
<!--    引入外部配置-->
    <properties resource="database.properties"/>
<!--    配置setting文件，例如日志输出-->
    <settings>
        <setting name="logImpl" value="STDOUT_LOGGING"/>
    </settings>
<!--    给实体类设置别名-->
    <typeAliases>
        <package name="com.why.start.mybatis.pojo"/>
    </typeAliases>

<!--    链接数据源-->
    <environments default="develop">
        <environment id="develop">
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
                <property name="driver"     value="${driver}"/>
                <property name="url"        value="${url}"/>
                <property name="username"   value="${user}"/>
                <property name="password"   value="${password}"/>
            </dataSource>
        </environment>
    </environments>

<!--    配置映射-->
    <mappers>
        <mapper resource="com/why/start/mybatis/mapper/UserMapper.xml"/>
    </mappers>
</configuration>

```