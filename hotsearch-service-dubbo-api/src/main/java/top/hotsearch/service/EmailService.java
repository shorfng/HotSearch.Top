package top.hotsearch.service;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 0:52</p>
 * <p>PageName：EmailService.java</p>
 * <p>Function：</p>
 */

public interface EmailService {

    boolean sendEmail(String email, String code);
}
