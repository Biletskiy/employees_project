<%@ include file="/init.jsp" %>

<portlet:defineObjects />

<%
	List<Employee> employeeList = EmployeeLocalServiceUtil.getEmployees(-1, -1);
%>

<liferay-portlet:actionURL name="addEmployeeMethod" var="addEmployeeAction" />

<style>
	.myTable{
		border:solid; border-width: 1px; width: 15%; text-align:center;"
	}
	.myTable1{
		border:solid; border-width: 1px; width: 10%; text-align:center;"
	}
	.myTable3{
		border:solid; border-width: 1px; width: 100%; text-align:center;"
	}
	.control-group .input-text-wrapper{
		margin-bottom:-1%;
	}
</style>
<table class="myTable3">
	<tr class="myTable3">
		<th class="myTable">employee name</th>
		<th class="myTable">employee surname</th>
		<th class="myTable">employee department</th>
		<th class="myTable1">Edit</th>
		<th class="myTable1">Delete</th>
	</tr>
	<%for(Employee employee : employeeList)
	{%>
	<tr class="myTable3">
		<td class="myTable"><%=employee.getEmployee_name() %></td>
		<td class="myTable"><%=employee.getEmployee_surname() %></td>
		<td class="myTable"><%=employee.getEmployee_department() %></td>

		<liferay-portlet:renderURL var="editEmployeeAction">
			<portlet:param name="jspPage" value="/editEmployee.jsp" />
			<portlet:param name="name" value="<%=employee.getEmployee_name() %>"/>
			<portlet:param name="surname" value="<%=employee.getEmployee_surname() %>"/>
			<portlet:param name="department" value="<%=employee.getEmployee_department() %>"/>
			<portlet:param name="employeeUpdateId" value="<%=String.valueOf(employee.getEmployee_id()) %>"/>
		</liferay-portlet:renderURL>

		<td class="myTable1">
			<aui:button name="" value="Update" onClick="<%=editEmployeeAction %>" />
		</td>

		<portlet:actionURL name="deleteEmployeeMethod" var="deleteEmployeeAction"/>
		<td class="myTable1">

			<aui:form action="<%=deleteEmployeeAction %>" method="post" class="myTable1">
				<aui:input name="deleteEmployeeId" type="hidden" value="<%=employee.getEmployee_id() %>"/>
					<aui:button name="" type="submit" value="Delete"/>
			</aui:form>
		</td>

	</tr>
	<%} %>
</table><span style="border:solid; border-width:1px;
padding:5px; text-align:center;">
<h5 style="text-align:center;">Add New Employee</h5>
<aui:form action="<%=addEmployeeAction %>" method="post" name="addEmployeeMethod">
	<aui:input name="name" type="text" value=""/>
	<aui:input name="surname" type="text" value=""/>
	<aui:input name="department" type="text" value="" />
	<aui:input name="" type="submit" value="Add Employee" />
</aui:form>
</span>
