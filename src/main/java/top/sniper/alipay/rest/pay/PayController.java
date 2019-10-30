package top.sniper.alipay.rest.pay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayController {
    @RequestMapping("/pay")
    public String pay(){
        return "pay";
    }
    @RequestMapping("/close")
    public String close(){
        return "close";
    }
    @RequestMapping("/query")
    public String query(){
        return "query";
    }
    @RequestMapping("/downloadurl")
    public String downloadurl(){
        return "downloadurl";
    }
    @RequestMapping("/refund")
    public String refund(){
        return "refund";
    }
    @RequestMapping("/refundquery")
    public String refundquery(){
        return "refundquery";
    }
}
