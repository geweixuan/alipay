package top.sniper.alipay.rest.qrcode;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import top.sniper.alipay.utils.CommonUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RequestMapping("/image")
@RestController
public class Image {

    @GetMapping("test")
    public String getQrCode(HttpServletRequest request) {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/get", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getRandomImage(@RequestParam String name, HttpServletRequest request) throws Exception {
        Resource resource = new ClassPathResource("static/image/" + name);
        File file = resource.getFile();
        if (!file.isDirectory()) {
            return "无对应用户".getBytes();
        }
        try {
            File[] files = file.listFiles();
            File imageResult = files[CommonUtils.getRandomIndex(files.length)];
            return FileUtils.readFileToByteArray(imageResult);
        } catch (Exception e) {
            return "无对应用户".getBytes();
        }
    }
}
