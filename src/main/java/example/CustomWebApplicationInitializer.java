package example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class CustomWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		throw new ServletException();
	}
}
