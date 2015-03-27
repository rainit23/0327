package exam.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String a = request.getParameter("이름");
		String b = request.getParameter("pw");
		String c = request.getParameter("gender");
		String d = request.getParameter("mycolor");
		String e = request.getParameter("myemail");
		String[] f = request.getParameterValues("hobby"); //체크박스는 저 메소드로 사용, 스트링배열 값으로 리턴됌...
		String g = request.getParameter("subject");
		String h = request.getParameter("textarea");
		
		
		
		out.println(a+"<br>");
		out.println(b+"<br>");
		out.println(c+"<br>");
		out.println("<font color='"+d+"'>"  + d +"</font><br>");
		out.println(e+"<br>");
		
		if(f == null){
			out.print("선택하세요<br>");
		}else{
			out.print(f.length + "개 선택<br>");
			for(int num=0; num<f.length; num++){
				out.print(f[num]+"<br>");
			}
		}
		out.println(g+"<br>");
		out.println(h+"<br>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
