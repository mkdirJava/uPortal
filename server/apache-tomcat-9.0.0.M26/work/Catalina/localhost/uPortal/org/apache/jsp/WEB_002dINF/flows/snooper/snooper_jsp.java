/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-16 12:12:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.flows.snooper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class snooper_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(15);
    _jspx_dependants.put("/WEB-INF/lib/resource-server-utils-1.0.43.jar", Long.valueOf(1508136915243L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/resource-server-utils-1.0.43.jar!/META-INF/resource-server.tld", Long.valueOf(1437581658000L));
    _jspx_dependants.put("/WEB-INF/lib/joda-time-jsptags-1.1.1.jar", Long.valueOf(1508136915198L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153381482000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.2.9.RELEASE.jar", Long.valueOf(1508136915288L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153381482000L));
    _jspx_dependants.put("/WEB-INF/tag/uportal.tld", Long.valueOf(1508136915314L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/shared/lib/pluto-taglib.jar!/META-INF/portlet_2_0.tld", Long.valueOf(1345819646000L));
    _jspx_dependants.put("file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/shared/lib/pluto-taglib.jar", Long.valueOf(1508136937489L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/spring-webmvc-3.2.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1400556740000L));
    _jspx_dependants.put("/WEB-INF/jsp/include.jsp", Long.valueOf(1508136907171L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1508136915203L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/spring-webmvc-3.2.9.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1400556740000L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153381482000L));
    _jspx_dependants.put("jar:file:/C:/Users/wws-li/gitUportalRepo/uPortal/server/apache-tomcat-9.0.0.M26/webapps/uPortal/WEB-INF/lib/joda-time-jsptags-1.1.1.jar!/META-INF/joda.tld", Long.valueOf(1322150458000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  portlet:defineObjects
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      org.apache.pluto.tags.DefineObjectsTag286 _jspx_th_portlet_005fdefineObjects_005f0 = (org.apache.pluto.tags.DefineObjectsTag286) _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.get(org.apache.pluto.tags.DefineObjectsTag286.class);
      boolean _jspx_th_portlet_005fdefineObjects_005f0_reused = false;
      try {
        _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
        int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
        actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
        actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
        eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
        eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
        renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
        renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
        resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
        resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
        portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
        portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
        portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
        portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
        portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
        if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
        actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
        eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
        eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
        renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
        renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
        resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
        resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
        portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
        portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
        portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
        portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
        portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
        _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
        _jspx_th_portlet_005fdefineObjects_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_portlet_005fdefineObjects_005f0, _jsp_getInstanceManager(), _jspx_th_portlet_005fdefineObjects_005f0_reused);
      }
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_spring_005fhtmlEscape_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!-- Portlet -->\n");
      out.write("<div class=\"fl-widget portlet snooper view-main\" role=\"section\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    <!-- Portlet Titlebar -->\n");
      out.write("    <div class=\"fl-widget-titlebar titlebar portlet-titlebar\" role=\"sectionhead\">\n");
      out.write("    \t<h2 class=\"title\" role=\"heading\">Snooper Information</h2>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Portlet Content -->\n");
      out.write("\t<div class=\"fl-widget-content content portlet-content\" role=\"main\">\n");
      out.write("  \n");
      out.write("        <!-- Portlet Section -->\n");
      out.write("        <div class=\"portlet-section\" role=\"region\">\n");
      out.write("            <div class=\"titlebar\">\n");
      out.write("                <h3 class=\"title\" role=\"heading\">HTTP Request</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <table class=\"portlet-table table table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                    \t<tr>\n");
      out.write("                        \t<th>Name</th>\n");
      out.write("                        \t<th>Value</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Request Protocol</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.protocol )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Request Method</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.method )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Server Name</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.serverName )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Server Port</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.serverPort )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Request URI</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.requestURI )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Context Path</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.contextPath )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Servlet Path</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.servletPath )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Query String</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.queryString )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Path Info</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.pathInfo )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Path Translated</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.pathTranslated )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Content Length</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.contentLength )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Content Type</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.contentType )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Remote User</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.remoteUser )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Remote Address</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.remoteAddr )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Remote Host</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.remoteHost )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Authorization Scheme</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.authType )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        \t<td>Locale</td>\n");
      out.write("                        \t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(request.locale )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Portlet Section -->\n");
      out.write("        <div class=\"portlet-section\" role=\"region\">\n");
      out.write("            <div class=\"titlebar\">\n");
      out.write("                <h3 class=\"title\" role=\"heading\">HTTP Header Info</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <table class=\"portlet-table table table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                    \t<tr>\n");
      out.write("                        \t<th>Name</th>\n");
      out.write("                        \t<th>Value</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Portlet Section -->\n");
      out.write("        <div class=\"portlet-section\" role=\"region\">\n");
      out.write("            <div class=\"titlebar\">\n");
      out.write("                <h3 class=\"title\" role=\"heading\">Locales</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <table class=\"portlet-table table table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Code</th>\n");
      out.write("                            <th>Language</th>\n");
      out.write("                            <th>Country</th>\n");
      out.write("                            <th>Variant</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t</div> <!-- end: portlet-content -->\n");
      out.write("</div> <!-- end: portlet -->\n");
      out.write("      ");
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

  private boolean _jspx_meth_spring_005fhtmlEscape_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:htmlEscape
    org.springframework.web.servlet.tags.HtmlEscapeTag _jspx_th_spring_005fhtmlEscape_005f0 = (org.springframework.web.servlet.tags.HtmlEscapeTag) _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.HtmlEscapeTag.class);
    boolean _jspx_th_spring_005fhtmlEscape_005f0_reused = false;
    try {
      _jspx_th_spring_005fhtmlEscape_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fhtmlEscape_005f0.setParent(null);
      // /WEB-INF/jsp/include.jsp(35,0) name = defaultHtmlEscape type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fhtmlEscape_005f0.setDefaultHtmlEscape("true");
      int[] _jspx_push_body_count_spring_005fhtmlEscape_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fhtmlEscape_005f0 = _jspx_th_spring_005fhtmlEscape_005f0.doStartTag();
        if (_jspx_th_spring_005fhtmlEscape_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fhtmlEscape_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fhtmlEscape_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fhtmlEscape_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.reuse(_jspx_th_spring_005fhtmlEscape_005f0);
      _jspx_th_spring_005fhtmlEscape_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fhtmlEscape_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005fhtmlEscape_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/flows/snooper/snooper.jsp(136,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/flows/snooper/snooper.jsp(136,24) '${ header }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ header }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/flows/snooper/snooper.jsp(136,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("h");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(h.key )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(h.value )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</td>\n");
            out.write("                            </tr>\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/flows/snooper/snooper.jsp(164,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/flows/snooper/snooper.jsp(164,24) '${ locales }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ locales }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/flows/snooper/snooper.jsp(164,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("locale");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("                            \t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.displayName )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</td>\n");
            out.write("                            \t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.locale )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</td>\n");
            out.write("                            \t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.displayLanguage )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(' ');
            out.write('(');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.locale.language )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(',');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.locale.ISO3Language )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(")</td>\n");
            out.write("                            \t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.displayCountry )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(' ');
            out.write('(');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.locale.country )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(',');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(locale.locale.ISO3Country )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write(")</td>\n");
            out.write("                            \t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:escapeXml(not empty local.locale.variant ? locale.displayVariant + ' (' + locale.locale.variant + ')' : '' )}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("</td>\n");
            out.write("                            </tr>\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
