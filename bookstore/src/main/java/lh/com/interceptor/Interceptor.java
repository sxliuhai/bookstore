package lh.com.interceptor;

import lh.com.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {
        Object user = request.getSession().getAttribute("user");
        if(user==null){
            response.sendRedirect(request.getContextPath()+"/resources/pages/user/login.jsp");
            return false;
        }
        else
            return true;
    }
}
