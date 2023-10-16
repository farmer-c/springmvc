package hello.servlet.basic.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("[전체 파라미터 조회] - start");
    req.getParameterNames().asIterator().forEachRemaining(
        // httpServletRequest.getParameter()는 GET URL 쿼리 파라미터, POST HTML Form 형식 모두 조회가능
        name -> System.out.println(name + ": " + req.getParameter(name))
    );
    System.out.println("[전체 파라미터 조회] - end");
  }
}
