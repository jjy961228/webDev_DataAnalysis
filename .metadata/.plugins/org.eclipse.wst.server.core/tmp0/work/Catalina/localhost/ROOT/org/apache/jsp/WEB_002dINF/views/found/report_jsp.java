/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2022-02-15 02:58:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.found;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1643859820145L));
    _jspx_dependants.put("/WEB-INF/layout/inc_header.jsp", Long.valueOf(1644756773161L));
    _jspx_dependants.put("/WEB-INF/layout/inc_footer.jsp", Long.valueOf(1643925621488L));
    _jspx_dependants.put("jar:file:/C:/2111_dev/findmeworkspace/find_me/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>FIND ME</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/fonts.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/sub.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("        integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"../resources/js/common.js\" async></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <div class=\"header__top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <!-- 로그인 후 -->\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <!-- 로그인 전 -->\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header__bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <button class=\"btn--hamburger\">\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                    <span></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <nav class=\"nav--gnb\">\r\n");
      out.write("                    <a href=\"/home.do\" class=\"nav--gnb__home\"><img src=\"/resources/img/ico_home.png\"\r\n");
      out.write("                            alt=\"FIND ME HOME\"></a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">이용안내</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"/guide/definition.do\">용어 정의</a></li>\r\n");
      out.write("                                <li><a href=\"/guide/step.do\">처리절차</a></li>\r\n");
      out.write("                                <li><a href=\"/guide/info.do\">사이트 이용안내</a></li>\r\n");
      out.write("                                <li><a href=\"/guide/center.do\">관할기관 리스트</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">습득물</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"/found/report.do\">습득물 신고</a></li>\r\n");
      out.write("                                <li><a href=\"/found/list.do\">습득물 리스트</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">분실물</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"/lost/report.do\">분실물 신고</a></li>\r\n");
      out.write("                                <li><a href=\"/lost/list.do\">분실물 리스트</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">경매</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"/auction/guide.do\">이용 안내</a></li>\r\n");
      out.write("                                <li><a href=\"/auction/list.do\">온라인 경매</a></li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <a class=\"header__logo\" href=\"/home.do\">\r\n");
      out.write("                \t<span>F</span>\r\n");
      out.write("                \t<span>I</span>\r\n");
      out.write("                \t<span>N</span>\r\n");
      out.write("                \t<span>D</span>\r\n");
      out.write("                \t \r\n");
      out.write("                \t<span>M</span>\r\n");
      out.write("                \t<span>E</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section id=\"sub\" class=\"found-report\">\r\n");
      out.write("\r\n");
      out.write("        <section class=\"sub__common\">\r\n");
      out.write("            <div class=\"sub__visual found\">\r\n");
      out.write("                <h2>습득물</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"sub__nav\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"active\"><a href=\"/found/report.do\">습득물 신고</a></li>\r\n");
      out.write("                        <li><a href=\"/found/list.do\">습득물 리스트</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"sub__conts\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3>습득물 신고</h3>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <form class=\"report__form\" action=\"/found/register.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    <div class=\"container_upper\">\r\n");
      out.write("                        <div class=\"container_left\">\r\n");
      out.write("                            <div class=\"container_image\">\r\n");
      out.write("                                <figure>\r\n");
      out.write("                                    <img src=\"../resources/img/img_lost.png\" alt=\"image preview\">\r\n");
      out.write("                                </figure>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"container_upload\">\r\n");
      out.write("                                <label for=\"foundImg\">이미지업로드</label>\r\n");
      out.write("                                <input type=\"file\" id=\"foundImg\" name=\"foundFileUpload\" value=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"container_right\">\r\n");
      out.write("                            <ul class=\"container_info\">\r\n");
      out.write("                                <li><label for=\"\">습득자 :</label> <input type=\"text\" id=\"\" name=\"userName\" placeholder=\"성함을 입력해주세요\"\r\n");
      out.write("                                        required=\"required\"></li>\r\n");
      out.write("                                <li><label for=\"\">상품종류 :</label> <input type=\"text\" id=\"\" name=\"foundCategory\" placeholder=\"상품종류를 입력해주세요\"\r\n");
      out.write("                                        required=\"required\"></li>\r\n");
      out.write("                                <li><label for=\"\">습득날짜 :</label> <input type=\"date\" id=\"\" name=\"foundDate\"></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <label for=\"\">습득 노선 :</label>\r\n");
      out.write("                                    <select id=\"\" name=\"foundStation\">\r\n");
      out.write("                                        <option value=\"1\">1호선</option>\r\n");
      out.write("                                        <option value=\"2\">2호선</option>\r\n");
      out.write("                                        <option value=\"3\">3호선</option>\r\n");
      out.write("                                        <option value=\"4\">4호선</option>\r\n");
      out.write("                                        <option value=\"5\">5호선</option>\r\n");
      out.write("                                        <option value=\"6\">6호선</option>\r\n");
      out.write("                                        <option value=\"7\">7호선</option>\r\n");
      out.write("                                        <option value=\"8\">8호선</option>\r\n");
      out.write("                                        <option value=\"9\">9호선</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><label for=\"\">연락처 :</label> <input type=\"text\" id=\"\" name=\"nuPhone\" placeholder=\"연락받을 연락처를 입력해주세요\"\r\n");
      out.write("                                        required=\"required\"></li>\r\n");
      out.write("                                <li><label for=\"\">해시태그 :</label> <textarea id=\"\" name=\"foundHashtag\" placeholder=\"#을붙여 #키워드태그\"></textarea></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"wordcloud-wrap\">\r\n");
      out.write("                    \t<img src=\"../resources/img/wordcloud.jpg\" alt=\"워드클라우드\">\r\n");
      out.write("                    \t<p>하단 이미지는 FINE ME 습득물 신고에 입력된 해시태그로 만들어진 워드 클라우드입니다.<br>작성 시 참고해주시면 분실자가 물건을 찾는데 많은 도움이 됩니다.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"container_bottom\">\r\n");
      out.write("                        <div class=\"container_bottom_layer\">\r\n");
      out.write("                            게시글 비밀번호 : <input type=\"password\" name=\"foundPostPassword\" maxlength=\"4\" placeholder=\"비밀번호 네자리 입력\" title=\"수정시 사용할 비밀번호를 입력해주세요.\"\r\n");
      out.write("                                required=\"required\"><br>\r\n");
      out.write("                            <input class=\"btn-basic mt-5\" type=\"submit\" value=\"등록하기\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("        <p>Copyright © 2022 Namuneulbo.co.,Ltd. All rights reserved.</p>\r\n");
      out.write("    </footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script> \r\n");
      out.write("        function readImage(input) {\r\n");
      out.write("            if(input.files && input.files[0]) {\r\n");
      out.write("                const reader = new FileReader()\r\n");
      out.write("                reader.onload = e => {\r\n");
      out.write("                    const previewImage = document.querySelector(\".container_image>figure>img\");\r\n");
      out.write("                    previewImage.src = e.target.result;\r\n");
      out.write("                }\r\n");
      out.write("                reader.readAsDataURL(input.files[0]);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        const inputImage = document.getElementById(\"foundImg\");\r\n");
      out.write("        inputImage.addEventListener(\"change\", e => {\r\n");
      out.write("            readImage(e.target);\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/layout/inc_header.jsp(8,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t\t<p><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.user_Name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</strong>님, 반갑습니다!&#128521;</p>\r\n");
          out.write("            \t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/layout/inc_header.jsp(13,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                    <li><a href=\"/user/logout.do\">로그아웃</a></li>\r\n");
          out.write("\t                    <li><a href=\"/mypage/edit.do\">마이페이지</a></li>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/layout/inc_header.jsp(18,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                    <li><a href=\"/user/login.do\">로그인</a></li>\r\n");
          out.write("\t                    <li><a href=\"/user/join.do\">회원가입</a></li>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/layout/inc_header.jsp(64,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.user_Id eq 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                \t<li><a href=\"/auction/adminAuction.do\">물품등록(관리자전용)</a></li>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /WEB-INF/views/found/report.jsp(45,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.loginUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                \t<p class=\"text-center mb-5\">\r\n");
          out.write("                \t\t※ 습득물 신고 시 주어지는 마일리지를 적립하시려면 로그인 후 이용해주세요.\r\n");
          out.write("                \t</p>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }
}
