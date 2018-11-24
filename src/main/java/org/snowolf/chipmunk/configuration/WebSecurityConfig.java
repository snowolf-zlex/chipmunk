package org.snowolf.chipmunk.configuration;

import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
//  启用方法级别的权限认证
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${resources.ignoredPaths}")
    private String ignoredPaths[];

    @Autowired
    private UserService userService;

//    private AuthenticationManagerBuilder authenticationManagerBuilder;
////    private CorsFilter corsFilter;
//
//    public WebSecurityConfig(AuthenticationManagerBuilder authenticationManagerBuilder,
//            UserDetailsService userDetailsService) {
//        this.authenticationManagerBuilder = authenticationManagerBuilder;
//        this.userService = (UserService) userDetailsService;
////        this.corsFilter = corsFilter;
//
//    }
//
//    @PostConstruct
//    public void init() {
//        try {
//            authenticationManagerBuilder
//                    .userDetailsService(userService)
//                    .passwordEncoder(passwordEncoder());
//        } catch (Exception e) {
//            throw new BeanInitializationException("Security configuration failed", e);
//        }
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        UserDetailsService userDetailsService = //自定义或者使用①
//                auth.authenticationProvider(new LoginAuthenticationProvider(userDetailsService));
//        //这东西千万不能忘
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(new Md5PasswordEncoder());
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }

//    @Bean
//    DaoAuthenticationProvider daoAuthenticationProvider() {
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        daoAuthenticationProvider.setUserDetailsService(userService);
//        return daoAuthenticationProvider;
//    }

    @Override
    public void configure(WebSecurity web) {
        //设置静态资源不要拦截
        web.ignoring().antMatchers(ignoredPaths);
//        daoAuthenticationProvider();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //注入userDetailsService的实现类
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
//        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
