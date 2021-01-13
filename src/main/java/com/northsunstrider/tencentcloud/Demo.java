package com.northsunstrider.tencentcloud;

import java.util.TreeMap;

import com.qcloud.QcloudApiModuleCenter;
import com.qcloud.Module.Cvm;
import com.qcloud.Utilities.Json.JSONObject;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年8月28日 上午6:31:26
 */
public class Demo {
	public static void main(String[] args) {
		/* 如果是循环调用下面举例的接口，需要从此处开始你的循环语句。切记！ */
		TreeMap<String, Object> config = new TreeMap<String, Object>();
		config.put("SecretId", "AKIDCOdosFkqz1yrcDT2Fap376SgbeZKqKb8");
		config.put("SecretKey", "i7RcmstpzDZmtvrz3yjeVFpHd0ELIXbb");
		/* 请求方法类型 POST、GET */
		config.put("RequestMethod", "GET");
		/* 区域参数，可选: gz:广州; sh:上海; hk:香港; ca:北美;等。 */
		config.put("DefaultRegion", "gz");

		/*
		 * 你将要使用接口所在的模块，可以从 官网->云api文档->XXXX接口->接口描述->域名
		 * 中获取，比如域名：cvm.api.qcloud.com，module就是new Cvm()。
		 */
		/*
		 * DescribeInstances
		 * 的api文档地址：http://www.qcloud.com/wiki/v2/DescribeInstances
		 */
		QcloudApiModuleCenter module = new QcloudApiModuleCenter(new Cvm(), config);
		TreeMap<String, Object> params = new TreeMap<String, Object>();
		/* 将需要输入的参数都放入 params 里面，必选参数是必填的。 */
		/* DescribeInstances 接口的部分可选参数如下 */
		params.put("offset", 0);
		params.put("limit", 3);
		/* 在这里指定所要用的签名算法，不指定默认为HmacSHA1 */
		// params.put("SignatureMethod", "HmacSHA256");
		/* generateUrl 方法生成请求串，但不发送请求。在正式请求中，可以删除下面这行代码。 */
		// System.out.println(module.generateUrl("DescribeInstances", params));

		String result = null;
		try {
			/* call 方法正式向指定的接口名发送请求，并把请求参数params传入，返回即是接口的请求结果。 */
			result = module.call("DescribeInstances", params);
			JSONObject json_result = new JSONObject(result);
			System.out.println(json_result);
		} catch (Exception e) {
			System.out.println("error..." + e.getMessage());
		}

	}	
}
