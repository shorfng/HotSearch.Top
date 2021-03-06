package top.hotsearch.service;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 0:52</p>
 * <p>PageName：EmailService.java</p>
 * <p>Function：邮箱服务类</p>
 */

public interface EmailService {
	/**
	 * 功能：发送邮件
	 * @param emailType 邮件类型
	 * @param email 收件人
	 * @return
	 */
	boolean sendEmail(String emailType, String email);

}
