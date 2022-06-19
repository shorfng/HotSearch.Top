package top.hotsearch.common;

/**
 * <p>Author：蓝田_Loto</p>
 * <p>Date：2021-01-27 19:43</p>
 * <p>PageName：EnumEmail.java</p>
 * Function：枚举类 - 邮件相关
 */

public class EnumEmail {
    public enum emailType {
        // 枚举
        REGISTER("1", "注册邮件"),
        VERIFYCODE("2", "邮件验证码"),
        CHANGEEMAIL("3", "更新邮箱"),
        CHANGEPWD("3", "更新密码"),
        EXCEPTIONLOGIN("4", "登录异常提醒");

        private String emailTypeCode; // 邮件类型
        private String emailTypeName; // 邮件类型名称

        emailType(String emailTypeCode, String emailTypeName) {
            this.emailTypeCode = emailTypeCode;
            this.emailTypeName = emailTypeName;
        }

        public String getEmailTypeCode() {
            return emailTypeCode;
        }

        public void setEmailTypeCode(String emailTypeCode) {
            this.emailTypeCode = emailTypeCode;
        }

        public String getEmailTypeName() {
            return emailTypeName;
        }

        public void setEmailTypeName(String emailTypeName) {
            this.emailTypeName = emailTypeName;
        }
    }
}
