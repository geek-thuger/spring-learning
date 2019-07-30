# spring learning
learning spring   
Java EE 开发巅峰者
Spring Boot 实战

初学spring，简单实力上手，
模拟书中前三章例子，代码实现。

编译环境：
java IDEA编辑器。

注意IDEA找不到.properties 文件的坑，可以在pom.xml
中增加：

```
<build>
  ...
        <resources>
            <resource>
                <directory>src/main/com/test/spring/basis/resource</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.txt</include>
                </includes>
                <filtering>false</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </resource>
        </resources>

    </build>
  ```




