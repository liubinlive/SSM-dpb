/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-25 12:02:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tul.nav li{\r\n");
      out.write("\t\t\tfloat:right;\r\n");
      out.write("\t\t\tlist-style: none;\r\n");
      out.write("\t\t\tmargin-left: 10px;\r\n");
      out.write("\t\t\tline-height: 40px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<!-- 上 -->\r\n");
      out.write("    <div data-options=\"region:'north',split:true,border:true\" style=\"height:60px;\">\r\n");
      out.write("    \t<div id=\"header\">\r\n");
      out.write("\t\t\t<div class=\"headerNav\" style=\"padding-right: 20px;\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("logout\">退出</a></li>\r\n");
      out.write("\t\t\t\t\t<li>欢迎 <font color='red'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.user.realname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font>光临</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- navMenu -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 左侧 -->\r\n");
      out.write("   <div data-options=\"region:'west',title:'导航',split:true\" style=\"width:150px;\">\r\n");
      out.write("   \t\t\t<ul id=\"tt\" class=\"easyui-tree\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 右侧 -->\r\n");
      out.write("    <div data-options=\"region:'east',title:'公告栏',split:true\" style=\"width:100px;\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 居中 -->\r\n");
      out.write("    <div data-options=\"region:'center'\" style=\"padding:0px;background:#eee;\">\r\n");
      out.write("    \t<div id=\"tabs\" class=\"easyui-tabs\" style=\"width:500px;height:250px;\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t\t    <div title=\"首页\" style=\"padding:20px;display:none;\" data-options=\"closable:false,fit:true\">\r\n");
      out.write("\t\t\t\t欢迎光临\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 下 -->\r\n");
      out.write("     <div data-options=\"region:'south',title:'',split:true\" style=\"height:0px;\">\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \tfunction addUserTab(){\r\n");
      out.write("    \t\t$('#tabs').tabs('add',{\r\n");
      out.write("    \t\t    title:'用户管理',\r\n");
      out.write("    \t\t    content:'<iframe src=\"user.jsp\" height=\"97%\" width=\"99%\"></iframe>',\r\n");
      out.write("    \t\t    closable:true\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    \t$(function(){\r\n");
      out.write("    \t\t$(\"#tt\").tree({\r\n");
      out.write("        \t\turl:\"");
      out.print(basePath);
      out.write("getTreeNode\",\r\n");
      out.write("        \t\tonClick: function(node){\r\n");
      out.write("        \t\t\tif(node.url != null){\r\n");
      out.write("        \t\t\t\t//window.location.href=");
      out.print(basePath);
      out.write("+node.url;\r\n");
      out.write("        \t\t\t\t// 打开一个新的窗口\r\n");
      out.write("        \t\t\t\t$('#tabs').tabs('add',{\r\n");
      out.write("        \t\t\t\t    title:node.text,\r\n");
      out.write("        \t\t\t\t    content:'<iframe src=\"");
      out.print(basePath);
      out.write("'+node.url+'\" width=\"99.5%\" height=\"99%\"></iframe>',\r\n");
      out.write("        \t\t\t\t    closable:true\r\n");
      out.write("        \t\t\t\t});\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t//alert(node.url);  // alert node text property when clicked\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("    \t});\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
