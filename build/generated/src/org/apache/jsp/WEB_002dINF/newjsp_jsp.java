package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #containerMaior{\n");
      out.write("                width: 50%;\n");
      out.write("                margin-left: 25%;\n");
      out.write("                margin-top: 12.5%;\n");
      out.write("            }\n");
      out.write("            #containerEsquerda{\n");
      out.write("                float:left;\n");
      out.write("                width: 45%;\n");
      out.write("                height: 100%\n");
      out.write("            }\n");
      out.write("            #containerDireita{\n");
      out.write("                float:right;\n");
      out.write("                width: 45%;\n");
      out.write("                height: 100%\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #labelContainer{\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #labelContainer > label{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #inputContainer{\n");
      out.write("                float: right;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #containerBaixo{\n");
      out.write("                clear: both;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            @media (max-width: 580px) {\n");
      out.write("             .body {\n");
      out.write("             font-size: 18px;\n");
      out.write("             }\n");
      out.write("             #containerEsquerda{\n");
      out.write("               \n");
      out.write("                width: 100%;\n");
      out.write("                height: 50%\n");
      out.write("            }\n");
      out.write("            #containerDireita{\n");
      out.write("                \n");
      out.write("                width: 100%;\n");
      out.write("                height: 50%\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"containerMaior\">\n");
      out.write("            <div id=\"containerEsquerda\">\n");
      out.write("                <h3>Dados do Salário</h3>\n");
      out.write("                <label>Salário Bruto(R$) <input type=\"number\" name=\"INPsalarioBruto\"> </label><br>\n");
      out.write("                <h3>Turno de Trabalho</h3>\n");
      out.write("                <select id=\"SLTturnTrabalho\">   \n");
      out.write("                    <option value=\"0\"> Diurno </option>\n");
      out.write("                    <option value=\"1\"> Vespertino </option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <h3>Categoria do Funcionário</h3>\n");
      out.write("                <input id=\"operario\" name=\"RDfuncionario\" type=\"radio\" value=\"Operário\"><label for=\"operario\">Operário</label>\n");
      out.write("                <input  id=\"gerente\"  name=\"RDfuncionario\" type=\"radio\"  value=\"Gerente\"><label for=\"gerente\">Gerente</label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"containerDireita\">\n");
      out.write("                <h3>Demonstrativo do Cálculo</h3>\n");
      out.write("                <div id=\"labelContainer\">\n");
      out.write("                <label>Salário Bruto(R$) </label>\n");
      out.write("                <label>Imposto </label>                    \n");
      out.write("                <label>Salário Líquido(R$)</label>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div id=\"inputContainer\">\n");
      out.write("                    <input type=\"number\" name=\"INPsalarioBrutoM\" readonly>\n");
      out.write("                    <input type=\"number\" name=\"INPimposto\" readonly>\n");
      out.write("                    <input type=\"number\" name=\"INPsalarioLiquidoM\" readonly>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"containerBaixo\">\n");
      out.write("                <button type=\"button\" name=\"calcular\">Calcular</button> \n");
      out.write("                <button type=\"reset\" name=\"limpar\">Limpar</button> \n");
      out.write("                <button type=\"button\" name=\"sair\">Sair</button> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     ");

        int a = 1;
        out.print(a);
     
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
