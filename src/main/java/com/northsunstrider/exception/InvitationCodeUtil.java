/**
 * 
 */
package com.northsunstrider.exception;

import java.util.Random;

/** 
 * @author North 
 * @date 2016年1月22日 上午10:37:03 
 * @version V1.0
 */
public class InvitationCodeUtil {

	private static int INVITATION_CODE_LENGTH = 10;

	/** 
	* @Description: 根据Id生成唯一邀请码，邀请码长度默认为10，在Constants中设置。最大支持Id为68719476735，超过则抛出IllegalArgumentException。	* 				 
	* @param @param id
	* @param @return  
	* @return String   
	* @throws 
	*/
	public static String generateCodeById(Long id) {
		StringBuffer code = new StringBuffer(INVITATION_CODE_LENGTH);
		code.append(Long.toHexString(id));
		if (code.length() > INVITATION_CODE_LENGTH - 1)
			throw new IllegalArgumentException();
		code.append('T');
		if (code.length() < INVITATION_CODE_LENGTH)
			code.append(getRandomString(INVITATION_CODE_LENGTH - code.length()));
		return code.toString();
	}

	/** 
	* @Description: 将验证码解析为用户ID，如果解析失败则抛出异常 
	* @param @param code
	* @param @return
	* @param @throws ParameterNotAvaliableException  
	* @return Long   
	* @throws 
	*/
	public static Long parseIdFromCode(String code) throws ParameterNotAvaliableException {
		try {
			int i = code.lastIndexOf((int) 'T');
			code = code.substring(0, i);
			Long id = Long.parseLong(code, 16);
			return id;
		} catch (Exception e) {
			throw new ParameterNotAvaliableException(e);
		}
	}

	public static String getRandomString(int length) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer(length);
		for (int i = 0; i < length; i++) {
			int tempInt = random.nextInt(52) + 65;
			sb.append((char) tempInt);
		}
		return sb.toString();
	}

	public static Long parseIdFromCode2(String code) {

		int i = code.lastIndexOf((int) 'T');
		if (i < 0)
			return null;
		code = code.substring(0, i);
		Long id = Long.parseLong(code, 16);
		return id;

	}

}
