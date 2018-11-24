package org.snowolf.chipmunk.configuration;

import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

public class LoginAuthenticationProvider extends DaoAuthenticationProvider {
//
//
//    public LoginAuthenticationProvider(UserDetailsService userDetailsService) {
//        super();
//        // 这个地方一定要对userDetailsService赋值，不然userDetailsService是null (这个坑有点深)
//        setUserDetailsService(userDetailsService);
//    }

//    protected void additionalAuthenticationChecks(UserDetails userDetails,
//            org.springframework.security.authentication.UsernamePasswordAuthenticationToken authentication)
//            throws AuthenticationException {
//        if (authentication.getCredentials() == null) {
//            logger.debug("Authentication failed: no credentials provided");
//
//            throw new BadCredentialsException(messages.getMessage(
//                    "AbstractUserDetailsAuthenticationProvider.badCredentials",
//                    "Bad credentials"));
//        }
//
//        String presentedPassword = authentication.getCredentials().toString();
//
//        if (!super.passwordEncoder.matches(presentedPassword, userDetails.getPassword())) {
//            logger.debug("Authentication failed: password does not match stored value");
//
//            throw new BadCredentialsException(messages.getMessage(
//                    "AbstractUserDetailsAuthenticationProvider.badCredentials",
//                    "Bad credentials"));
//        }
//    }

//    protected void additionalAuthenticationChecks(
//            UserDetails userDetails, UsernamePasswordAuthenticationToken authentication)
//            throws AuthenticationException {
//        Object salt = null;
//
//        if (super.getSaltSource() != null) {
//            salt = this.getSaltSource().getSalt(userDetails);
//        }
//
//        if (authentication.getCredentials() == null) {
//            logger.debug("Authentication failed: no credentials provided");
//
//            throw new BadCredentialsException(
//                    messages.getMessage(
//                            "AbstractUserDetailsAuthenticationProvider.badCredentials",
//                            "Bad credentials"));
//        }
//
//        String presentedPassword = authentication.getCredentials().toString();
//        // 我就改了这个地方，增加一个验证码登录标识(具体怎么做就看自己了)
//        // 【原本的是登录密码和数据密码不等就抛出异常，我用验证码登录时压根都不知道密码(ー`´ー)】
//        // so 我给短信登录时赋值一个默认密码（验证码登录标识）来判断，不让这儿报异常
//        if (!presentedPassword.equals("YZMLG_KSssdS1D145Sd4S")) {
//            if (!getPasswordEncoder()
//                    .isPasswordValid(userDetails.getPassword(), presentedPassword, salt)) {
//                logger.debug("Authentication failed: password does not match stored value");
//
//                throw new BadCredentialsException(
//                        messages.getMessage(
//                                "AbstractUserDetailsAuthenticationProvider.badCredentials",
//                                "Bad credentials"));
//            }
//        }
//    }
}