package com.test.springboot_web.configure;

import com.test.springboot_web.interceptor.WebInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 对所有访问路径，都通过MyInterceptor类型的拦截器进行拦截
        registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/", "/js/**","/index.html");
        //放行登录页，登陆操作，静态资源
    }

}
