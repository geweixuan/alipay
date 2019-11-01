package top.sniper.alipay.config;

public class AlipayConfig {
    // 商户appid
    // evey_angle-2019102968691874  Destiny_Baby-2019102968690817   test-2016101700707502
    public static String APPID = "2016101700707502";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC2PZP55oqY04kYCATpWkt4L/Nfg0C1V1btZKcW6+lef92WFQbTCxV//vTx6uN4/ERQKGo1iY4a3BZL2IUS1SveBeE59kl27TeLgrYCzq6gcjLb5YMGD3k7XANo7ZscadaCglruzK2OguEMrk9SqdhIn3JiTUhL0gmWO8ivtBrsXVII6H5V1Ik38LQjuYuPS+Ec8Hfmv6QqDPZszUkjbRwhiTAyGyGyPMoeAhVLO/zsz/X+nZ5o8yo9xH/biZY9Sy0G7PbI6zL3q5TuXGeiCf/yKobha7OCBMWQBBraPO2jRSRZqUyXpQbvPcNmns+kAbpj17IvogEdFwtUuWLmckYzAgMBAAECggEAWFf9lhV2dqOFQAsTJnRJRZgpKNId2krervIuNeRjGxZtOsYyqrgi0gusfmHZp9rS2vDcm9t08fxjKp1p1TlVrKm5BzonXumcFZtl1HKRIOJ7WTInlBaINIhkdsdIfDuqa1X58u1x7TXxFw6hEXeYi4wQDStdsrO9RgDxRovOyWmYoX3aWl5Qy1KUjOkgUawiq6BGP9rjIGqVxVYOZszlVKTIRC/cOoculJL8T5IlLwTRbIMMYkfP4MKLR2gfG60JHgWKsTwV8iRmW1Is/g+vtIYuksFRFWqQtdGtEK4ynFUF2cCE5BqOyPjEeESvLiquHBA9SeJ4aH9FaX3UXEm0AQKBgQD10bzougBXJPVlTmF7gqpefQDFIi3C/rm8p9VkD7o3eTgc3NMZVwITvSX2Riod4/IzyyUdLGXSyrerh1n3HZIXh6hHBON2JZ09UNf8HXZH5C07SjMRRO2602ygGf9jtSf9H/PxziKGLO1kxnd7uFc7MZbgbfwn0zPrRgf4YgE7MwKBgQC9ycGHAYfQNKL2Q830yoEEmdIgc39/5lHGExEqpGBUqo5O8BKrdinlCSD1/AJQOQ11OJudL9Gr5ErsY+M+l3qEE1Gz0hfT6aWV1z1pPl75RhLNEuk/mpSuEUsdlRqvmsxIUjOVs5zgnqtZFusCvP7kq/UIJXikOj3HCyM2DzLJAQKBgFCuRDiGQ/JWOQzFCw3EtzJICOaq7yYfAMtAsrMizlXCvX4LpGWevxnHbRxFrzEcTbReKpJGrizfSCVOSWLoG7kJV1vn6NgwREmJrTocWWQDKi1ZjyVN4FD/b5mkrsQFA1j7Ec/9fitXt5rp4PGEcW0GO6TxtF9F3LaNx7PoRsstAoGBAJLnIE2H+cBHffxw73KTbNpK1kMYI5C0jodrKtZ+9bGTcyPW4ByoEjWeo0zEDGZcQvaBIrLA2OLcisH/b157kfG5onw2GwuExw781CQqiwkYHGVwRetdk8hIyoPTbhyPDaDNP/CYXs3fA3KqMq6j7AjEsZ3ko0U7b6YqEM8/ZGgBAoGAT+llgE8euX6/DZh8CQ8gEKvGvd+POFANqyVaXv3xnzOZixnNNDbsCL9bpkZGeHtHk+9L32fN6GBPBJ1igdgTM5wrsfyhe3xGYBfMfAYMEuoCQOG+q6ffo9hoCderVtGDEzUr0WFFgPsw76EYs3St2M0xipg5+PoqaGfZXvSrvSI=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
//    public static String URL = "https://openapi.alipay.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtj2T+eaKmNOJGAgE6VpLeC/zX4NAtVdW7WSnFuvpXn/dlhUG0wsVf/708erjePxEUChqNYmOGtwWS9iFEtUr3gXhOfZJdu03i4K2As6uoHIy2+WDBg95O1wDaO2bHGnWgoJa7sytjoLhDK5PUqnYSJ9yYk1IS9IJljvIr7Qa7F1SCOh+VdSJN/C0I7mLj0vhHPB35r+kKgz2bM1JI20cIYkwMhshsjzKHgIVSzv87M/1/p2eaPMqPcR/24mWPUstBuz2yOsy96uU7lxnogn/8iqG4WuzggTFkAQa2jzto0UkWalMl6UG7z3DZp7PpAG6Y9eyL6IBHRcLVLli5nJGMwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
