package com.northsunstrider.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.northsunstrider.clz.PersonClass;
import com.northsunstrider.jiekou.UserDao;
import com.northsunstrider.jiekou.UserDaoImple;
import com.northsunstrider.json.Animal;
import com.northsunstrider.json.BankCardInfo;
import com.northsunstrider.json.Corlor;
import com.northsunstrider.json.Person;
import com.northsunstrider.json.Student;
import com.northsunstrider.json.StudentList;
import com.northsunstrider.json.User;
import com.northsunstrider.thread.DoSomething;
import com.northsunstrider.unifiedorder.RequestUnifiedOrder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class TestA {

	public static void main(String[] args) {
		try {
			// String s0=Status.staticStr;
			// System.out.println(s0);
			// test();
			//
			// double value = 2.6d;
			// int intValue = (int) value;
			// System.out.println(intValue);
			 testPersonClass();
			// testThread();
			// char a = 'A';
			// System.out.println((int) a);
			// testXML();
			// testJaxb();
			// testA(1);
			// testInterface();
			// testException();
			// testMap();
			// testJson5();
			// testString();
			// testPerson();
			// testUrl();
			// System.out.println((int) 'A');
			// String abc = InvitationCodeUtil.getRandomString(10);
			// System.out.println(abc);
//			test0x();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test() {
		String abc = "sdfs{0}sss{1}";
		System.out.println(MessageFormat.format(abc, "aa", "bb"));

	}

	public static void testPersonClass() {

		// create an object by passing in a name and age:
		PersonClass variable1 = new PersonClass("Mary", 32);

		PersonClass variable2;

		// Both variable2 and variable1 now both name the same object
		variable2 = variable1;

		/*
		 * this also changes variable1, since variable 2 and variable1 name the
		 * same exact object:
		 */

		variable2.setName("Jack");
		variable2.setAge(22);

		System.out.println(variable1.getName() + "***" + variable1.getAge());
	}

	public static void testThread() {
		DoSomething doSomething = new DoSomething("hello");
		doSomething.run();
	}

	public static void testXML() {

		RequestUnifiedOrder requestUnifiedOrder = new RequestUnifiedOrder("appid", " mch_id", " device_info", " nonce_str", " sign",
				" body", " detail", " attach", " out_trade_no", " fee_typel", 10, " spbill_create_ip", " time_start", " time_expire",
				" goods_tag", " notify_url", " trade_type", " product_id", " limit_pay", " openid");
		// 解决XStream对出现双下划线的bug
		XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		// xStreamForRequestPostData.alias("blog", RequestUnifiedOrder.class);
		xStreamForRequestPostData.alias("xml", RequestUnifiedOrder.class);
		xStreamForRequestPostData.omitField(RequestUnifiedOrder.class, "com.tronsis.unifiedorder.RequestUnifiedOrder");
		// 将要提交给API的数据对象转换成XML格式数据Post给API
		String postDataXML = xStreamForRequestPostData.toXML(requestUnifiedOrder);
		System.out.println(postDataXML);
	}

	public static void testJaxb() {

		try {
			RequestUnifiedOrder requestUnifiedOrder = new RequestUnifiedOrder("appid", " mch_id", " device_info", " nonce_str", " sign",
					" body", " detail", " attach", " out_trade_no", " fee_typel", 10, " spbill_create_ip", " time_start", " time_expire",
					" goods_tag", " notify_url", " trade_type", " product_id", " limit_pay", " openid");
			JAXBContext context = JAXBContext.newInstance(RequestUnifiedOrder.class);
			Marshaller marshaller;
			marshaller = context.createMarshaller();
			marshaller.marshal(requestUnifiedOrder, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/** 
	* @Title: testA 
	* @Description: TODO 
	* @param @param m  
	* @return void   
	* @throws 
	*/
	public static void testA(int m) {
		String str = "abcde";
		// for()
		Map<String, Object> map = new HashMap();
		map.put("name", null);
		System.out.println(map);

		String a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCmkFinImrCyZjF6ljUq84ns8tq1aWnQciqUXStj4WBkBYmwHq8YA51t1Da6LyHIwVBWoIopdpuKT+Yn0MXDsK9Z/BM3EF3OANCybcKuwhKQIu28U7DwhzIqH1WJD+mdIUL8IDdEdbuAR4PD4j685Qb17j9bWl965RzftqnKWUi8wIDAQAB";
		String b = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD5Gurl8BZUYUA3y7PU+QkbuHhqZQbHPA397rK1s+BA+CoIx9bfxtKAvVHktfWqBLI8D1GjGwcKIVgO6PmZnCptz2ugKXXJj9mBHOJH65dF2ilazROUxpGkAVeek//bgK48Y//NvljfvzxE9c3OJtkl9cnmiROrkDEospLJmr0nVQIDAQAB";
	}

	public static void testAAA() {
		int i = 1;

	}

	public static void testJson() {
		String str = "{\"student\":[{\"name\":\"leilei\",\"age\":23},{\"name\":\"leilei02\",\"age\":23}]}";
		Student stu = null;
		HashSet<Student> list = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			StudentList studentList = objectMapper.readValue(str, StudentList.class);
			list = studentList.getStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student s : list) {
			System.out.println(s.getName());
		}

	}

	public static void testJson2() {
		String str = "{\"username\":\"north\",\"password\":\"123456\",\"bankCardInfos\":[{\"bankCardNum\":\"4444444444444\",\"bankCardName\":\"cmb\"},{\"bankCardNum\":\"4444444444444\",\"bankCardName\":\"cmb\"}]}";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			User user = objectMapper.readValue(str, User.class);
			for (BankCardInfo bankCardInfo : user.getBankCardInfos())
				System.out.println(bankCardInfo.getBankCardName());
			System.out.println(user.getBankCardInfos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testInterface() {
		UserDao userDao = new UserDaoImple();
		userDao.save("hh");
	}

	public static void testJson3() throws JsonParseException, JsonMappingException, IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("[{\"name\":\"leilei\",\"age\":23}");
		for (int i = 0; i < 100000; i++)
			sb.append(",{\"name\":\"leilei02\",\"age\":23}");
		sb.append("]");
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("start:" + System.currentTimeMillis());
		Student[] studentList = objectMapper.readValue(sb.toString(), Student[].class);
		System.out.println("end:" + System.currentTimeMillis());

	}

	public static void testException() {
		System.out.println(NullPointerException.class.getSimpleName());
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println(e);
			e.toString();
			e.getMessage();

		}
	}

	/**
	 * 
	 */
	public static void testMap() {
		Person person = new Person();
		person.setIdNumber("2342342");
		Map<String, ?> map = (Map<String, ?>) person;
		System.out.println(map.get("idNumber"));
	}

	public static void testBase64() {
		Base64.getUrlDecoder();
	}

	public static void testJson4() throws JsonProcessingException {
		Person person = new Person("234");
		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(person);
		System.out.println(str);
	}

	public static void testJson5() throws JsonProcessingException {
		Animal animal = new Animal("Dog", Corlor.BLUE);
		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(animal);
		System.out.println(str);
	}

	public static void testString() {
		String[] str = { "a", "bc", "d" };
		System.out.println(str[0]);
		// ArrayList<String> strList;
		// 此处如果使用ArrayList定义strList，在自动转换时会出错。
		List<String> strList;
		strList = Arrays.asList(str);
		for (String s : strList)
			System.out.println(s);
	}

	public static void testPerson() {
		Person person = new Person("id123");
		System.out.println(person.toString());
	}

	public static void testUrl() {
		String redirectUrl = "http://www.tronsis.com/wowo-wechat/view/html/base.html";
		try {
			String temp = "name=a&address=身上发生";
			temp = URLEncoder.encode(temp, "UTF-8");
			System.out.println(redirectUrl + "?" + temp);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void test0x() {
		Long min = 0x8000000000000000l;
		Long max = 0x7fffffffffffffffl;
		System.out.println("===============================");
		System.out.println(min);
		System.out.println(max);

		Long a = 0x80l;
		System.out.println("===============================");
		System.out.println("a" + a);

		Long b = 0x8fl;
		System.out.println("===============================");
		System.out.println("b" + b);

		Long c = 0xffffffffffffffffl;
		System.out.println("===============================");
		System.out.println("c" + c);

		Long d = 0x9000000000000001l;
		System.out.println("===============================");
		System.out.println("d" + d);

	}

}
