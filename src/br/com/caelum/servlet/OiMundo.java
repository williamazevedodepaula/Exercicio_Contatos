package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundo
 */
@WebServlet(name = "primeiraServlet2", urlPatterns = {"/ola"},
initParams={
		@WebInitParam(name="param1", value="value1"),
		@WebInitParam(name="param2", value="value2")
})  
public class OiMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OiMundo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	@Override
	protected void service (HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        // escreve o texto
        out.println("<html>"+
  "<body>"+
    "<form action=\"adicionaContato\">"+
      "Nome: <input type=\"text\" name=\"nome\" /><br />"+
      "E-mail: <input type=\"text\" name=\"email\" /><br />"+
      "Endere�o: <input type=\"text\" name=\"endereco\" /><br />"+
      "Data Nascimento: <input type=\"text\" name=\"dataNascimento\" /><br />"+
      
      "<input type=\"submit\" value=\"Gravar\" />"+
    "</form>"+
  "</body>"+
"</html>");            
    }

}
