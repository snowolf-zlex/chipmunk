package org.snowolf.chipmunk.configuration;

import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

  //    private final AuthenticationManagerBuilder authenticationManagerBuilder;
  //
  @Value("${resources.ignoredPaths}")
  private String ignoredPaths[];

  @Autowired private UserService userService;
  //
  //    private final CorsFilter corsFilter;
  //
  //    private final SpringSecurityConfig problemSupport;
  //
  //    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder,
  // UserDetailsService userDetailsService, CorsFilter corsFilter, SpringSecurityConfig
  // problemSupport) {
  //        this.authenticationManagerBuilder = authenticationManagerBuilder;
  //        this.userDetailsService = userDetailsService;
  //        this.corsFilter = corsFilter;
  //        this.problemSupport = problemSupport;
  //    }
  //
  //    @PostConstruct
  //    public void init() {
  //        try {
  //            authenticationManagerBuilder
  //                    .userDetailsService(userDetailsService)
  //                    .passwordEncoder(passwordEncoder());
  //        } catch (Exception e) {
  //            throw new BeanInitializationException("Security configuration failed", e);
  //        }
  //    }
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // 注入userDetailsService的实现类
    auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    AuthenticationProvider provider = new DaoAuthenticationProvider();
    ((DaoAuthenticationProvider) provider).setPasswordEncoder(passwordEncoder());
    ((DaoAuthenticationProvider) provider).setUserDetailsPasswordService(userService);
    ((DaoAuthenticationProvider) provider).setUserDetailsService(userService);
    auth.authenticationProvider(provider);
  }

  @Override
  @Bean
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    // 设置静态资源不要拦截
    web.ignoring().antMatchers(ignoredPaths);
  }
}
