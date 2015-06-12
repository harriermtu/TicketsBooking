package org.apache.jsp.WEB_002dINF.views.tickets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reserve_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("<div version=\"2.0\">");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"/>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_util_005fpanel_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/tickets/reserve.jspx(6,80) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setVar("title");
    // /WEB-INF/views/tickets/reserve.jspx(6,80) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setHtmlEscape("false");
    // /WEB-INF/views/tickets/reserve.jspx(6,80) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("label_tickets_reserve");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_util_005fpanel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  util:panel
    org.apache.jsp.tag.web.util.panel_tagx _jspx_th_util_005fpanel_005f0 = new org.apache.jsp.tag.web.util.panel_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_util_005fpanel_005f0);
    _jspx_th_util_005fpanel_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/tickets/reserve.jspx(7,43) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_util_005fpanel_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/tickets/reserve.jspx(7,43) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_util_005fpanel_005f0.setId("title");
    _jspx_th_util_005fpanel_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_util_005fpanel_005f0, null));
    _jspx_th_util_005fpanel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_util_005fpanel_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/tickets/reserve.jspx(8,80) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setVar("app_name");
    // /WEB-INF/views/tickets/reserve.jspx(8,80) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setHtmlEscape("false");
    // /WEB-INF/views/tickets/reserve.jspx(8,80) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("application_name");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/tickets/reserve.jspx(10,73) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("welcome_titlepane");
    // /WEB-INF/views/tickets/reserve.jspx(10,73) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/tickets/reserve.jspx(13,66) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext['request'].userPrincipal != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext['request'].userPrincipal.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\" id=\"userName\">");
        out.write('\n');
        out.write('	');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext['request'].userPrincipal.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("    ");
        out.write("</div>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/tickets/reserve.jspx(19,70) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext['request'].userPrincipal == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<select id=\"selectPrice\">");
        out.write("<option value=\"1\">");
        out.write("reduced");
        out.write("</option>");
        out.write(";\n");
        out.write("\t\t");
        out.write("<option value=\"2\">");
        out.write("normal");
        out.write("</option>");
        out.write(";\n");
        out.write("    ");
        out.write("</select>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/tickets/reserve.jspx(27,51) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/tickets/reserve.jspx(27,51) '${showList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${showList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/tickets/reserve.jspx(27,51) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("listValue");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listValue}///${listValue.id}///${listValue.film.filmType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listValue.dateOfShow}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listValue.film.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listValue.film.filmType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<h3>");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</h3>");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_c_005fif_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<select onchange=\"generatePlace()\" id=\"selectShow\">");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</select>");
      out.write("<button onclick=\"myReserve()\">");
      out.write("createTicket");
      out.write("</button>");
      out.write("<br/>");
      out.write(" Reserve Password: ");
      out.write("<input id=\"passReserve\" type=\"text\"/>");
      out.write("<div id=\"div1\"/>");
      out.write("<script>");
      out.write("\n");
      out.write("\t//document.getElementById(\"selectSeans\").addEventListener(\"load\", myFunction3());\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\twindow.onload = generatePlace();\n");
      out.write("\tfunction generatePlace() {\n");
      out.write("\t\t//alert(JSON.stringify(getNumbers()));\n");
      out.write("\t\t//alert(JSON.stringify(tableOfIdRowsPlaces[\"id\"]));\n");
      out.write("\t\tif (document.getElementById(\"userName\")!=null) document.getElementById(\"passReserve\").value = document.getElementById(\"userName\").getAttribute(\"value\");\n");
      out.write("\t\tvar i=0;\n");
      out.write("\t\tvar div1 = document.getElementById(\"div1\");\n");
      out.write("\t\tdocument.getElementById(\"div1\").innerHTML = \"\";\n");
      out.write("\t\t//alert(JSON.stringify(getNumbers()));\n");
      out.write("\t\t//alert(JSON.stringify(tableOfIdRowsPlaces[\"id\"]));\n");
      out.write("\t\t\n");
      out.write("\t\tvar tableOfIdRowsPlaces = getNumbers();\n");
      out.write("\t\tvar show = tableOfIdRowsPlaces[\"id\"];\n");
      out.write("\t\tvar numberOfPlaces = tableOfIdRowsPlaces[\"numberOfPlaces\"];\n");
      out.write("\t\tvar numberOfRows = tableOfIdRowsPlaces[\"numberOfRows\"];\n");
      out.write("\n");
      out.write("\t\tfor (var t = 1; t <= numberOfRows; t++) {\n");
      out.write("\t\t\tfor (var k = 1; k <= numberOfPlaces; k++){\n");
      out.write("    \t\t\tvar x = document.createElement(\"INPUT\");\n");
      out.write("    \t\t\tx.setAttribute(\"type\", \"checkbox\");\n");
      out.write("    \t\t\tx.setAttribute(\"id\", \"x\" + t + k);\n");
      out.write("    \t\t\tdiv1.appendChild(x);    \t\t\t\n");
      out.write("    \t\t\tvar y = document.createElement(\"INPUT\");\n");
      out.write("    \t\t\ty.setAttribute(\"type\", \"textbox\");\n");
      out.write("    \t\t\tdiv1.appendChild(y);\n");
      out.write("    \t\t\ty.id=\"y\" + t + k;\n");
      out.write("    \t\t\ty.value=t + \" \" + k;\n");
      out.write("    \t\t\ty.disabled = true;\n");
      out.write("    \t\t\ty.size=1;\n");
      out.write("    \t\t\tcheckFreeTicket(t,k,id);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdiv1.appendChild(document.createElement(\"br\"));\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction checkFreeTicket(row, place, id){\n");
      out.write("\t\tvar a;\n");
      out.write("    \t$.ajax({\n");
      out.write("    \t\t   url:\"checkfree?row=\"+row+\"&place=\"+place+\"&id=\"+id,\n");
      out.write("    \t\t   type:'GET',\n");
      out.write("    \t\t   success: function(data){\n");
      out.write("    \t\t\t   a=$(data).find('#checkFree').html();\n");
      out.write("    \t\t\t   if (a.valueOf() == \"false\"){document.getElementById(\"x\"+row+place).disabled=true; document.getElementById(\"x\"+row+place).checked=false; document.getElementById(\"y\"+row+place).value=\"NIED\";}\n");
      out.write("    \t\t   }\n");
      out.write("    \t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction checkFreeTicket2(row, place, id){\n");
      out.write("\t\tvar show = document.getElementById(\"selectShow\").value;\n");
      out.write("\t\tvar priceType = $('#selectPrice option:selected').text();\n");
      out.write("\t\tvar filmType = show.split(\"///\")[2];\n");
      out.write("\t\t\n");
      out.write("\t\tvar logged;\n");
      out.write("\t\tif (document.getElementById(\"userName\")!=null) logged = true;\n");
      out.write("\t\telse logged = false;\n");
      out.write("\n");
      out.write("\t\tif (logged && filmType==\"film_2D\") price=83;\n");
      out.write("\t\tif (logged && filmType==\"film_3D\") price=84;\n");
      out.write("\t\tif (!logged && filmType==\"film_2D\" && priceType==\"reduced\") price=85;\n");
      out.write("\t\tif (!logged && filmType==\"film_2D\" && priceType==\"normal\") price=86;\n");
      out.write("\t\tif (!logged && filmType==\"film_3D\" && priceType==\"reduced\") price=87;\n");
      out.write("\t\tif (!logged && filmType==\"film_3D\" && priceType==\"normal\") price=88;\n");
      out.write("\n");
      out.write("\t\tvar password = document.getElementById(\"passReserve\").value;\n");
      out.write("\t\t\n");
      out.write("    \t$.ajax({\n");
      out.write("    \t\t   url:\"checkfree?row=\"+row+\"&place=\"+place+\"&id=\"+id,\n");
      out.write("    \t\t   type:'GET',\n");
      out.write("    \t\t   success: function(data){\n");
      out.write("    \t\t\t   a=$(data).find('#checkFree').html();\n");
      out.write("    \t\t\t   if (a.toString() == \"false\"){\n");
      out.write("    \t\t\t\t   alert(\"Unfortunately, one of Your tickets have been booked by another user, others are reserved.\");\n");
      out.write("    \t\t\t\t   //location.reload();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("    \t\t\t   else {\n");
      out.write("    \t\t\t\t   $.ajax({\n");
      out.write("\t\t\t    \t\t   url:\"createticket\",\n");
      out.write("\t\t\t    \t\t   type:'POST',\n");
      out.write("\t\t\t    \t\t   data: { row:row, place:place, show:id, price:price, password:password },\n");
      out.write("\t\t\t    \t\t   success: function(data){\n");
      out.write("\t\t\t    \t\t\t   //var a=$(data).find('#reserved').html();\n");
      out.write("\t\t\t    \t\t\t   //alert(a);\n");
      out.write("\t\t\t    \t\t   }\n");
      out.write("\t\t\t    \t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("    \t\t\t   location.reload();\n");
      out.write("    \t\t\t   }\n");
      out.write("    \t\t});\n");
      out.write("    \t//location.reload();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction myReserve(){\n");
      out.write("\t\t\n");
      out.write("\t\tvar tableOfIdRowsPlaces = getNumbers();\n");
      out.write("\t\tvar show = tableOfIdRowsPlaces[\"id\"];\n");
      out.write("\t\tvar numberOfPlaces = tableOfIdRowsPlaces[\"numberOfPlaces\"];\n");
      out.write("\t\tvar numberOfRows = tableOfIdRowsPlaces[\"numberOfRows\"];\n");
      out.write("\t\tfor (var t = 1; t <= numberOfRows; t++) {\n");
      out.write("\t\t\tfor (var k = 1; k <= numberOfPlaces; k++){\n");
      out.write("\t\t\t\tif (document.getElementById(\"x\"+t+k).checked){\n");
      out.write("\t\t\t\t\tcheckFreeTicket2(t,k,id);\n");
      out.write("\t\t\t\t\t} \n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction myCreatePOST(){\n");
      out.write("\t\t\n");
      out.write("\t\tvar price;\n");
      out.write("\t\tvar show = document.getElementById(\"selectShow\").value;\n");
      out.write("\t\tvar priceType = $('#selectPrice option:selected').text();\n");
      out.write("\t\tid = show.split(\"///\")[1];\n");
      out.write("\t\tvar filmType = show.split(\"///\")[2];\n");
      out.write("\n");
      out.write("\t\tvar tableOfIdRowsPlaces = getNumbers();\n");
      out.write("\t\tvar numberOfPlaces = tableOfIdRowsPlaces[\"numberOfPlaces\"];\n");
      out.write("\t\tvar numberOfRows = tableOfIdRowsPlaces[\"numberOfRows\"];\n");
      out.write("\n");
      out.write("\t\tvar logged;\n");
      out.write("\t\tif (document.getElementById(\"userName\")!=null) logged = true;\n");
      out.write("\t\telse logged = false;\n");
      out.write("\n");
      out.write("\t\tif (logged && filmType==\"film_2D\") price=83;\n");
      out.write("\t\tif (logged && filmType==\"film_3D\") price=84;\n");
      out.write("\t\tif (!logged && filmType==\"film_2D\" && priceType==\"reduced\") price=85;\n");
      out.write("\t\tif (!logged && filmType==\"film_2D\" && priceType==\"normal\") price=86;\n");
      out.write("\t\tif (!logged && filmType==\"film_3D\" && priceType==\"reduced\") price=87;\n");
      out.write("\t\tif (!logged && filmType==\"film_3D\" && priceType==\"normal\") price=88;\n");
      out.write("\n");
      out.write("\t\tvar password = document.getElementById(\"passReserve\").value;\n");
      out.write("\t\tfor (var t = 1; t <= numberOfRows; t++) {\n");
      out.write("\t\t\tfor (var k = 1; k <= numberOfPlaces; k++){\n");
      out.write("\t\t\t\tif (document.getElementById(\"x\"+t+k).checked){\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t    \t\t   url:\"createticket\",\n");
      out.write("\t\t\t    \t\t   type:'POST',\n");
      out.write("\t\t\t    \t\t   data: { row:t, place:k, show:id, price:price, password:password },\n");
      out.write("\t\t\t    \t\t   success: function(data){\n");
      out.write("\t\t\t    \t\t\t   var a=$(data).find('#reserved').html();\n");
      out.write("\t\t\t    \t\t\t   alert(a);\n");
      out.write("\t\t\t    \t\t   }\n");
      out.write("\t\t\t    \t\t});\n");
      out.write("\t\t\t\t\t} \n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tlocation.reload();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction getNumbers(){\n");
      out.write("\t\tvar show = document.getElementById(\"selectShow\").value;\n");
      out.write("\t\tid = show.split(\"///\")[1];\n");
      out.write("\t\tvar myReg = /numberOfRows=(.*?),/;\t\n");
      out.write("\t\tvar numberOfRows = myReg.exec(show)[1];\n");
      out.write("\t\tmyReg = /numberOfPlaces=(.*?),/;\n");
      out.write("\t\tvar numberOfPlaces = myReg.exec(show)[1];\n");
      out.write("\t\treturn {\n");
      out.write("\t\t\t\"id\" : id,\n");
      out.write("\t\t\t\"numberOfRows\" : numberOfRows,\n");
      out.write("\t\t\t\"numberOfPlaces\" : numberOfPlaces\n");
      out.write("\t\t};\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t");
      out.write("</script>");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
