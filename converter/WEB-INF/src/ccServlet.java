package ex;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.*;
import java.net.*;


public class ccServlet extends HttpServlet {
 
   public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 //javac -d . -classpath /apache/tomcat/common/lib/servlet-api.jar ccServlet.java UriReport.java ccServletListener.java
      response.setContentType("text/html");
      
      PrintWriter out = response.getWriter();
 
     	 double res;
         out.println("<html>");
         out.println("<head><title>cc by xro7</title></head>");
         out.println("<body>");
         out.println("<h1>Currency Converter by xro7</h1>"); 
         
	 String a = request.getParameter("amount");
         
	 String c1 = request.getParameter("currency1");
         
	 String c2 = request.getParameter("currency2");
       
	 
	
	 String answer,answer2;

		
	
	URL convert = new URL("http://www.google.com/ig/calculator?hl=en&q="+a+c1+"=?"+c2);
	BufferedReader in = new BufferedReader(new InputStreamReader(convert.openStream()));
	answer = in.readLine();
	answer2 = answer;
	int q = answer2.indexOf('"');
	answer2 = answer2.substring(q);

	q = answer2.indexOf(' ');
	answer2 = answer2.substring(q);
	q = answer2.indexOf('"');
	answer2 = answer2.substring(0,q);

	int r=answer.indexOf("rhs");
	answer=answer.substring(r+6);
	int b=answer.indexOf(' ');
	int b2=answer.indexOf('"');
	String cur=answer.substring(b,b2);

	String after ="";
	String dec;
	answer=answer.substring(0,b);
	int d = answer.indexOf('.');
	if (d!=-1){
		dec = answer.substring(0,d);
		int len = answer.length();
		after = answer.substring(d,len);
	}
	else{
    		dec=answer;
	}
	dec=dec.replaceFirst("\\D", "");
	answer=dec.concat(after);
	answer=answer.concat(cur);


	out.println("<p>"+a+" "+answer2+ " ==> " +answer+"</p>");  
	


	

	


	

	out.println("<a href=\"/~poxariti/\"><button>go back</button></a>");
	out.println("</body></html>");
        out.close();  
	
      
   }
   




}