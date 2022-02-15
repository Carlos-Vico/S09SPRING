

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter saida = resp.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<olá mundo>");
		saida.println("</body>");
		saida.println("<html>");
	}

}
