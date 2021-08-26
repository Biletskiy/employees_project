<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><<%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.taglib.portlet.ActionURLTag"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="java.util.List" %>
<%@ page import="com.liferay.com.employee.portlet.EmployeePortlet" %>
<%@ page import="com.liferay.com.employee.model.Employee" %>
<%@ page import="com.liferay.com.employee.service.EmployeeLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>


<liferay-theme:defineObjects />

<portlet:defineObjects />