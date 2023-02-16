import javax.servlet.http*;
import javax.servlet*;
import java.io*;

public class DemoServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        res.setContentType("text/html"); //setting the content type
        PrintWriter out = res.getWriter(); //get the stream to write the data

        //writing html in the stream
        out.println("<html><body>");
        out.println("Welcome to Servlet");
        out.println("</body></html>");

        out.close(); 
    }
}