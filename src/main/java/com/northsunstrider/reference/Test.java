package com.northsunstrider.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

import com.northsunstrider.dota2.Unit;

/**
 * @Description: java 四种引用规则的测试
 * @author: North
 * @date: 2018年4月19日 上午9:32:24
 */
public class Test {

	/**
	 * @Description main
	 * @param args
	 */
	public static void main(String[] args) {
		weakReference();
		weakReferenceEnhance();
	}

	// 虚引用
	public static void phantomReference() {

		ReferenceQueue<String> queue = new ReferenceQueue<String>();
		PhantomReference<String> pr = new PhantomReference<String>(new String("hello"), queue);
		System.out.println(pr.get());
	}

	// 弱引用
	public static void weakReference() {
		/*
		 * 假设要将一个Unit对象传递给另外一个对象 以下是我通常使用的方法，先创建一个unit存储该对象，再讲unit传递给要用的方法
		 * 可以看到，unit对象一直没有被回收，这就是这种做法的缺点 如果unit只是一个临时对象，如前文所述，其确实为临时对象
		 * 所以最高效的做法是将该Unit对象的初始化放在引用方法内，不要用新建一个unit来保存它
		 * 该unit只使用一次，却因为是指向了一个引用的对象，所以不会被垃圾回收，这就浪费了空间
		 */
		Unit unit = new Unit("name", 1.0, 1.0, 1.0, 100, 100);
		WeakReference<Unit> weakReference = new WeakReference<Unit>(unit);
		System.out.println("weakReference: " + weakReference.get());
		System.out.println("unit:          " + unit);
		System.gc();
		System.out.println("weakReference: " + weakReference.get());
		System.out.println("unit:          " + unit);

	}

	// 弱引用，在上一种方法上面的改进
	public static void weakReferenceEnhance() {

		WeakReference<Unit> weakReference = new WeakReference<Unit>(new Unit("name", 1.0, 1.0, 1.0, 100, 100));
		System.out.println(weakReference.get());
		System.gc();
		System.out.println(weakReference.get());

	}
}
