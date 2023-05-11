package pl.sda.OrangeJavaPL2.security;
//
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BakerySecurityConfig implements WebMvcConfigurer {
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////
////        http
////                .csrf().disable()
////                .authorizeRequests()
////                .mvcMatchers("/*/**")
////                .permitAll();
////    }
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        UserDetails user = User.withDefaultPasswordEncoder()
////                .username("admin")
////                .password("admin")
////                .roles("ADMIN")
////                .build();
////        auth.inMemoryAuthentication()
////                .withUser(user);
////    }
//
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*");
    }
}
