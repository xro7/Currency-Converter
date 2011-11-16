package ex;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.*;
import java.net.*;


public class RedirectServlet extends HttpServlet {
 
   public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 //javac -d . -classpath /apache/tomcat/common/lib/servlet-api.jar ccServlet.java UriReport.java  RedirectServlet.java
     
      response.setContentType("text/html");
     
      PrintWriter out = response.getWriter();
 
      
         out.println("<html>");
         out.println("<head><title>cc by xro7</title></head>");
         out.println("<body>");
         out.println("<h1>Currency Converter by xro7</h1>"); 

	 UriReport ur = (UriReport)getServletContext().getAttribute("redirectsite");
         response.sendRedirect(ur.getUri());
	  out.close();  // Always close the output writer
         
    }

}