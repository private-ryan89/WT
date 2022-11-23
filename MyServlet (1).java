import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResposne response) throws ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
String user=req.getParameter("name");
String aut=req.getParameter("author");
String yea=req.getParameter("year");
String pri=req.getParameter("price");
		//out.println("<html><body>");
		//out.println("name");
		//out.println("</body></html>");
		
// Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
}
	}
}
