/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-07-11 06:20:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._08Board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model1.board.BoardDAO;
import model1.board.BoardDTO;

public final class View_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("model1.board.BoardDAO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String num = request.getParameter("num");

BoardDAO dao = new BoardDAO(application);
dao.updateVisitCount(num);
BoardDTO dto = dao.selectView(num);
dao.close();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>회원제 게시판</title>\n");
      out.write("<script>\n");
      out.write("function deletePost() {\n");
      out.write("    var confirmed = confirm(\"정말로 삭제하겠습니까?\"); \n");
      out.write("    if (confirmed) {\n");
      out.write("        var form = document.writeFrm;      \n");
      out.write("        form.method = \"post\"; \n");
      out.write("        form.action = \"DeleteProcess.jsp\"; \n");
      out.write("        form.submit();         \n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Link.jsp", out, false);
      out.write("\n");
      out.write("<h2>회원제 게시판 - 상세 보기(View)</h2>\n");
      out.write("<form name=\"writeFrm\">\n");
      out.write("<input type=\"hidden\" name=\"num\" value=\"");
      out.print( num );
      out.write("\" />  \n");
      out.write("    <table border=\"1\" width=\"90%\">\n");
      out.write("        <tr>\n");
      out.write("            <td>번호</td>\n");
      out.write("            <td>");
      out.print( dto.getNum() );
      out.write("</td>\n");
      out.write("            <td>작성자</td>\n");
      out.write("            <td>");
      out.print( dto.getName() );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>작성일</td>\n");
      out.write("            <td>");
      out.print( dto.getPostdate() );
      out.write("</td>\n");
      out.write("            <td>조회수</td>\n");
      out.write("            <td>");
      out.print( dto.getVisitcount() );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>제목</td>\n");
      out.write("            <td colspan=\"3\">");
      out.print( dto.getTitle() );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>내용</td>\n");
      out.write("            <td colspan=\"3\" height=\"100\">\n");
      out.write("	        ");
      out.print( dto.getContent().replace("\r\n", "<br/>") );
      out.write("\n");
      out.write("            </td> \n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"4\" align=\"center\">\n");
      out.write("               ");

		if (session.getAttribute("UserId") != null 
			&& session.getAttribute("UserId").toString().equals(dto.getId()))
	    {
	    
      out.write("\n");
      out.write("		<button type=\"button\"\n");
      out.write("			        onclick=\"location.href='Edit.jsp?num=");
      out.print( dto.getNum() );
      out.write("';\">\n");
      out.write("		    수정하기</button>\n");
      out.write("		<button type=\"button\" onclick=\"deletePost();\">삭제하기</button> \n");
      out.write("	   ");

	   }
	  
      out.write("\n");
      out.write("	   <button type=\"button\" onclick=\"location.href='List.jsp';\">\n");
      out.write("	                 목록 보기\n");
      out.write("	   </button>\n");
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
