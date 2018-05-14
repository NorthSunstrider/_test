package com.northsunstrider.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年5月3日 上午10:29:00
 */
public class SerializationTest {

	/**
	 * @Description 将对象保存在文本中，如果父类未实现序列化，则将子类对象保存时不会储存父类中的属性
	 *              既如下例所示，当父类未实现序列化时，先保存再取出子类对象，发现a值为默认值，
	 */
	@Test
	public void testSave() {
		try {
			File file = new File("D:\\Matrix\\workspace\\1.txt");

			FileOutputStream fos = new FileOutputStream(file);

			Child child = new Child();
			child.a = 0;
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
			objectOutputStream.writeObject(child);
			objectOutputStream.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testRead() {

		try {
			File file = new File("D:\\Matrix\\workspace\\1.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fis);
			Child child = (Child) objectInputStream.readObject();
			System.out.println(child.a);
			objectInputStream.close();
			fis.close();

		} catch (Exception e) {
		}
	}

}
