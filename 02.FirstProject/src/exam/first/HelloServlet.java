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
@WebServlet("/jsp.TestServlet") 
//어노테이션 , xml에서 사용하는방식으로 안하고 요즘 이런방식으로 씀
//어노테이션 이름이 웹페이지 이름이 되기때문에 서버주소뒤에 이 이름을 주소에 적어야 이 웹파일을 찾아 response를 한다.
//어노테이션 이름을 수정하면 프로젝트 Run as -> Run on Server실행을 다시해주면 수정된 주소로 접속이 가능함asdasd
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
    
    //요청하는방식 : Get방식 , Post방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter(); //out이 jsp의 out.print의 out과 같다
		//jsp는 자동객체로 만들어져있어서 바로 사용이 가능하지만 서블릿환경에서는 직접 만들어서 사용해야한다. 그것이 밑의 코드가 예이다.
		out.print("Hello");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
