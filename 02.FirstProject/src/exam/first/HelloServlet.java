package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")// URL Mapping 이라고함 
//어노테이션 , xml에서 사용하는방식으로 안하고 요즘 이런방식으로 씀
//어노테이션 이름이 웹페이지 이름이 되기때문에 서버주소뒤에 이 이름을 주소에 적어야 이 웹파일을 찾아 response를 한다.
//어노테이션 이름을 수정하면 프로젝트 Run as -> Run on Server실행을 다시해주면 수정된 주소로 접속이 가능함asdasd

//클라이언트에서 서버쪽으로 요청(request)을할때 자동으로 객체생성
//요청방식 get / host
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //주소를치고 enter로 접속하는 방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //jsp문서를 html형식으로 쓰게하는 방법 2, 한글안깨지기위한 코딩
		PrintWriter out = response.getWriter(); //out이 jsp의 out.print의 out과 같다
		//jsp는 자동객체로 만들어져있어서 바로 사용이 가능하지만 서블릿환경에서는 직접 만들어서 사용해야한다. 그것이 밑의 코드가 예이다.
		//out.print("<html>");//jsp문서를 html형식으로 쓰게하는 방법 1
		out.print("Hello - get<br>");
		//test2에서 주석에 적어놨듯이 이 방식으로 하면 주소창에 텍스트,패스워드에 입력한 정보들이 그대로 노출되기때문에
		//보안측면에서 좋지않다.
		//get방식으로 전송하는 방법 : 1.주소창에 직접입력 2.form으로 전송 3.a href로 이용하여 전송
		
		//get방식으로 텍스트,패스워드입력받은 데이터를 출력
		String n = request.getParameter("name");
		String p = request.getParameter("pwd");
		String i = request.getParameter("id");
		//get함수에 <input type="text" name="name">부분의 "name"을 넣어주어야 매칭이된다.
		
		out.print("이름 : "+n+"<br>");
		out.print("ID : "+i+"<br>");
		out.print("PWD : "+p+"<br>");
		//out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//요청, 응답에 대한 인코딩설정을 먼저한후에
		//	PrintWriter out = response.getWriter(); 이 코딩을 해주어야 정상적인 인코딩이 적용이된다.
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 	
		
		out.print("Hello - post<br>");
				
		
		String n = request.getParameter("name");
		String p = request.getParameter("pwd");
		String i = request.getParameter("id");
		//get함수에 <input type="text" name="name">부분의 "name"을 넣어주어야 매칭이된다.
		out.print("이름 : "+n+"<br>");
		out.print("ID : "+i+"<br>");
		out.print("PWD : "+p+"<br>");
		
	}

}
