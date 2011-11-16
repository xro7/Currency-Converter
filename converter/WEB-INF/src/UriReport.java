package ex;
import javax.servlet.*;



public class UriReport {

 private String uri;
   public UriReport(String uri){
	this.uri = uri;
   }
   public String getUri(){
	
	return uri;
   }
   public void setUri(String newUri){

	uri= newUri;
   }

}



