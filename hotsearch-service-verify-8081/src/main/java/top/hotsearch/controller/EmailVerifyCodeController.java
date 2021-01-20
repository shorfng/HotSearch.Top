package top.hotsearch.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hotsearch.service.EmailService;

import java.util.UUID;

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

    @RequestMapping(value = "/sendemailverifycode/{email}")
    public boolean sendEmailVerifyCode(@PathVariable String email) {
        emailService.sendEmail(email, UUID.randomUUID().toString().substring(0, 6));
        return true;
    }
}
