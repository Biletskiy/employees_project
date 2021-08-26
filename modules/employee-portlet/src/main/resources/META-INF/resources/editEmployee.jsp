<%@ include file="/init.jsp" %>

<portlet:defineObjects/>

<portlet:actionURL name="updateEmployeeMethod" var="editEmployeeAction"/>

<aui:form action="<%=editEmployeeAction%>" name="employeeForm" method="POST"/>

<%
    String employeeName = renderRequest.getRenderParameters().getValue("name");
    String employeeSurname = renderRequest.getRenderParameters().getValue("surname");
    String employeeDepartment = renderRequest.getRenderParameters().getValue("department");
    String employeeId = renderRequest.getRenderParameters().getValue("employeeUpdateId");
%>

<h3>Edit Employee: <%=employeeName%></h3>

<aui:form action="<%=editEmployeeAction %>" method="post" >
    <aui:input name="name" type="text" value="<%=employeeName%>"/>
    <aui:input name="surname" type="text" value="<%=employeeSurname%>"/>
    <aui:input name="department" type="text" value="<%=employeeDepartment%>"/>
    <aui:input name="employeeUpdateId" type="hidden" value="<%=Long.parseLong(employeeId) %>"/>
    <aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>
