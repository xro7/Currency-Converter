package ex;

import javax.servlet.*;


public class ccServletListener implements ServletContextListener {
 
   public void contextInitialized(ServletContextEvent event){
 	
	ServletContext sc = event.getServletContext();
    	String report = sc.getInitParameter("report");
	UriReport ur = new UriReport(report);
	sc.setAttribute("redirectsite",ur);
    
   }
   public void contextDestroyed(ServletContextEvent event){  
    
   }


}



