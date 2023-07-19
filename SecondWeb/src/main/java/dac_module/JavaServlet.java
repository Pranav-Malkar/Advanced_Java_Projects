package dac_module;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/Java" }, 
		initParams = { 
				@WebInitParam(name = "subject", value = "Java")
		})
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out =response.getWriter();
		
		//either in the same class or super classes
		ServletConfig config = this.getServletConfig();
		String subject = config.getInitParameter("subject");
		
		ServletContext ctx = getServletContext();
		String provider = ctx.getInitParameter("provider");
		
		out.println("Training on "+subject+" by "+provider);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
