package top.hotsearch.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hotsearch.common.EnumEmail;
import top.hotsearch.service.EmailService;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 1:13</p>
 * <p>PageName：EmailVerifyCodeController.java</p>
 * <p>Function：</p>
 */

@RestController
@RequestMapping("/email")
public class EmailVerifyCodeController {
	@Reference
	private EmailService emailService;

	@RequestMapping(value = "/sendemailverifycode/{emailReceiver}")
	public boolean sendEmailVerifyCode(@PathVariable String emailReceiver) {
		emailService.sendEmail("11111",String.valueOf(EnumEmail.emailType.VERIFYCODE.getEmailTypeCode()), emailReceiver);
		return true;
	}
}
