package by.academy.servlet.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

import static by.academy.util.Constants.CHARACTER_ENCODING;

@WebFilter(urlPatterns = {"/*"})
public class EncodingFilter implements javax.servlet.Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        servletRequest.setCharacterEncoding(CHARACTER_ENCODING);
        servletResponse.setCharacterEncoding(CHARACTER_ENCODING);
        filterChain.doFilter(servletRequest,servletResponse);

    }
}