package kr.co.mulcam.teamfinder.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

//	요청이 서블릿으로 들어가기 전에 utf-8 처리하고 들어가게 함
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("utf-8");
		return new Filter[] {encodingFilter};
	}

	//web.xml대신 java config파일 사용 선호함. 에러 확인 쉬움 web application이 열릴 때 dao, service쪽 클래스들도 생성해야하는데 그 설정을 applicationconfig가 담고 있음을 알려줌
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {MvcConfig.class};
	}

	
//	dispatcher servlet이 모든 요청을 받을 수 있도록 설정한 것.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
