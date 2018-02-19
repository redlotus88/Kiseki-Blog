package cn.newtouch.kiseki.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dragon on 2018/2/14.
 */
@Controller
public class IndexController {

    private static Log LOGGER = LogFactory.getLog(IndexController.class);

    @RequestMapping("/")
    public String index() {
        LOGGER.info("登录index界面");
        return "index";
    }
}
