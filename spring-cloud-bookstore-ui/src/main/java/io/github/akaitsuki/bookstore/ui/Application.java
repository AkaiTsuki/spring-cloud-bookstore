package io.github.akaitsuki.bookstore.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Map;

/**
 * Created by Jiachi on 7/11/2016.
 */
@SpringBootApplication
@RestController
@EnableZuulProxy
public class Application {

    @RequestMapping("/token")
    @ResponseBody
    public Map<String,String> token(HttpSession session) {

        return Collections.singletonMap("token", session.getId());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
