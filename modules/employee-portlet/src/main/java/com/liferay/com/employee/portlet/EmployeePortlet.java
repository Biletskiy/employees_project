package com.liferay.com.employee.portlet;

import com.liferay.com.employee.constants.EmployeePortletKeys;

import com.liferay.com.employee.model.Employee;
import com.liferay.com.employee.service.EmployeeLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

@Component(
	immediate = true,
	property = {
			"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Employee",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeePortlet extends MVCPortlet {

	@Reference
	EmployeeLocalService employeeLocalService;

	@ProcessAction(name="addEmployeeMethod")
	public void addEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
		long employeeId= CounterLocalServiceUtil.increment();
		Employee employee;
		employee = employeeLocalService.createEmployee(employeeId);
		employee.setEmployee_name(ParamUtil.getString(actionRequest, "name"));
		employee.setEmployee_surname(ParamUtil.getString(actionRequest, "surname"));
		employee.setEmployee_department(ParamUtil.getString(actionRequest, "department"));

		employeeLocalService.addEmployee(employee);
	}

	@ProcessAction(name="deleteEmployeeMethod")
	public void deleteEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
		long deleteEmployeeId = ParamUtil.getLong(actionRequest, "deleteEmployeeId");
		employeeLocalService.deleteEmployee(deleteEmployeeId);
	}
	@ProcessAction(name="updateEmployeeMethod")
	public void updateEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
		Employee employee = employeeLocalService.fetchEmployee(ParamUtil.getInteger(actionRequest, "employeeUpdateId"));

		employee.setEmployee_name(ParamUtil.getString(actionRequest, "name"));
		employee.setEmployee_surname(ParamUtil.getString(actionRequest, "surname"));
		employee.setEmployee_department(ParamUtil.getString(actionRequest, "department"));

		employeeLocalService.updateEmployee(employee);
	}

}