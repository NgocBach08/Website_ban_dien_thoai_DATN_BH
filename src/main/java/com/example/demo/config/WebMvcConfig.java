package com.example.demo.config;

import com.example.demo.intercepter.CartIntercepter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:
 *
 * @author: Hieu
 * @version: 1.0
 * @since 3/20/2022 2:41 PM
 */
@RequiredArgsConstructor
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
 private final CartIntercepter categoryIntercepter;

 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(categoryIntercepter)
          .addPathPatterns("/product/**")
          .addPathPatterns("/cart/**")
          .addPathPatterns("/home/**")
          .addPathPatterns("/order")
          .addPathPatterns("/check-out/**")
          .excludePathPatterns("");
 }
}
