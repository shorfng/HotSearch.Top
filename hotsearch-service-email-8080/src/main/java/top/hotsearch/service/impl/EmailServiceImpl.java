package top.hotsearch.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import top.hotsearch.service.EmailService;

import java.util.Map;

/**
 * Author：蓝田_Loto
 * <p>Date：2021-01-21 0:53</p>
 * <p>PageName：EmailServiceImpl.java</p>
 * <p>Function：邮件服务端 - 发送邮件实现类</p>
 */

@Service
@RefreshScope   // 全局刷新（Nacos 实时更新配置文件）
public class EmailServiceImpl implements EmailService {
    @Autowired(required = true)
    private JavaMailSender mailSender;

    @Value("${spring.mail.from}")
    private String from;

    @Value("#{${emailsubjectmap}}")
    private Map<String, String> emailInfoMap;

    private static String EMAIL_CONTENT = "#{user}，欢迎使用HotSearch！";

    @Override
    public boolean sendEmail(String userName, String emailType, String emailReceiver) {
        // 创建SimpleMailMessage对象
        SimpleMailMessage message = new SimpleMailMessage();

        // 邮件发送人
        message.setFrom(from);

        // 邮件接收人
        message.setTo(emailReceiver.split(";"));

        // 邮件主题
        message.setSubject(emailInfoMap.get("subject" + emailType));

        // 邮件内容
        message.setText(EMAIL_CONTENT.replace("#{user}",userName));

        // 发送邮件
        mailSender.send(message);
        return true;
    }

}
