package com.northsunstrider.java8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月28日 上午9:02:47
 */
public class Test {

    /**
     * @Description TODO
     * @param args
     */
    public static void main(String[] args) {

        // findArticleByTag(initList(), "computer");
        //
        // System.out.println("\n" + getFirstJavaArticle(initList()));
        test(initList());

        getAllJavaArticles(initList());

    }

    /**
     * @Description 初始化list
     * @return
     */
    public static List<Article> initList() {
        List<Article> list = new ArrayList<>();
        List<String> tags = new ArrayList<>();
        tags.add("computer");
        tags.add("java");
        tags.add("spring");
        for (int i = 0; i < 5; i++)
            list.add(new Article("title" + i, "north", tags));
        return list;
    }

    /**
     * @Description 查询list中保护指定tag的article
     * @param list
     * @param tag
     */
    public static void findArticleByTag(List<Article> list, String tag) {
        for (Article article : list) {
            if (article.getTags().contains(tag))
                System.out.println(article);
        }
    }

    /**
     * @Description 使用Stream实现查询list中包含指定tag的article
     * @param list
     * @return
     */
    public static Optional<Article> getFirstJavaArticle(List<Article> list) {
        return list.stream().filter(article -> article.getTags().contains("java")).findFirst();
    }

    /**
     * @Description 观察Stream对象
     * @param list
     */
    public static void test(List<Article> list) {

        Stream<Article> stream = list.stream();
        Stream<Article> stream1 = stream.filter(article -> article.getTags().contains("java"));
        System.out.println(stream1);
        stream1.findFirst();

        System.out.println(stream1.findFirst());
    }

    /**
     * @Description 使用Stream查询list中包含指定tag的所有article
     * @param list
     * @return
     */
    public static List<Article> getAllJavaArticles(List<Article> list) {
        return list.stream().filter(a -> a.getTags().contains("Java")).collect(Collectors.toList());

    }

    public static void testCarCreate() {
        Car car = Car.create(Car::new);

    }

    public static void tryWithResource() {
        try (FileInputStream fis = new FileInputStream(""); FileOutputStream fos = new FileOutputStream("")) {

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void testOptional() {
        Person person = new Person();
        System.out.println(person.getTruck().get().getInsurance().get().getName());
        Optional<Person> optionalPerson = Optional.of(person);
        String str = optionalPerson.flatMap(Person::getTruck).flatMap(Truck::getInsurance).map(Insurance::getName)
            .orElse("unKnown");
        System.out.println(str);
    }
}
