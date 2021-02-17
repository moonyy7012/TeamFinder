package kr.co.mulcam.teamfinder.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "kr.co.mulcam.teamfinder.controller")
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/mypage", "/memberEdit");
	}

//	js, css, image 등이 dispatcher servlet으로 들어오지 않고 따로 처리하도록. 
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/static/fonts/");
		registry.addResourceHandler("/sass/**").addResourceLocations("classpath:/static/sass/");
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
		
	}

// view의 확장자 정보를 viewresolver에게 알려줌. 첫번째 인자 : prefix(파일경로) 두번째 인자: suffix(확장자)
// web-inf 파일은 url로 요청 못 함(run on server로 띄우지 못함) 따라서 중요한 파일들은 web-inf에 넣는게 좋음(jsp파일)
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/member_edit/",".jsp");
	}
	

}
