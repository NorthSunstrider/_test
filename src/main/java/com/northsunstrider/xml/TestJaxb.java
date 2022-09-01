package com.northsunstrider.xml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

/*
 * jdk不在内置javax，需要在maven中额外引入 这样就麻烦了，不如直接使用dom4j这个类库
 * 
 * 莫名其妙，以前项目JDK8以上使用jaxbContext转换xml的时候提示找不到class。百度也确实发现java在逐步移除一些功能，解决方法就是手动引入，比如 <dependency>
 * <groupId>javax.xml.bind</groupId> <artifactId>jaxb-api</artifactId> <version>2.3.1</version> </dependency>
 * 可是在观察hutool xml相关代码的时候，发现其也是基于javax.xml下的类开发的，但是其又不依赖外部的javax jar包。
 * 又观察到BASE64,JDK8以上的项目是可以直接使用java.util.base64的，反而是JDK7没有base64，如果需要使用的话要手动引入。难道是我记错了了？高版本的项目是不需要额外引入的，反而是一些项目使用的是JDK7，
 * 所以才要引入？
 */
public class TestJaxb {

    @Test
    public void beanToXML() {
        Classroom classroom = new Classroom(1, "软件工程", 4);
        Student student = new Student(101, "张三", 22, classroom);

        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(student, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void XMLStringToBean() {
        String xmlStr =
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student><age>22</age><classroom><grade>4</grade><id>1</id><name>软件工程</name></classroom><id>101</id><name>张三</name></student>";
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlStr));
            System.out.println(student.getAge());
            System.out.println(student.getClassroom().getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
