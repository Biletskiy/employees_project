/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.com.employee.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper
	extends BaseModelWrapper<Employee>
	implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		super(employee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employee_id", getEmployee_id());
		attributes.put("employee_name", getEmployee_name());
		attributes.put("employee_surname", getEmployee_surname());
		attributes.put("employee_department", getEmployee_department());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employee_id = (Long)attributes.get("employee_id");

		if (employee_id != null) {
			setEmployee_id(employee_id);
		}

		String employee_name = (String)attributes.get("employee_name");

		if (employee_name != null) {
			setEmployee_name(employee_name);
		}

		String employee_surname = (String)attributes.get("employee_surname");

		if (employee_surname != null) {
			setEmployee_surname(employee_surname);
		}

		String employee_department = (String)attributes.get(
			"employee_department");

		if (employee_department != null) {
			setEmployee_department(employee_department);
		}
	}

	/**
	 * Returns the employee_department of this employee.
	 *
	 * @return the employee_department of this employee
	 */
	@Override
	public String getEmployee_department() {
		return model.getEmployee_department();
	}

	/**
	 * Returns the employee_id of this employee.
	 *
	 * @return the employee_id of this employee
	 */
	@Override
	public long getEmployee_id() {
		return model.getEmployee_id();
	}

	/**
	 * Returns the employee_name of this employee.
	 *
	 * @return the employee_name of this employee
	 */
	@Override
	public String getEmployee_name() {
		return model.getEmployee_name();
	}

	/**
	 * Returns the employee_surname of this employee.
	 *
	 * @return the employee_surname of this employee
	 */
	@Override
	public String getEmployee_surname() {
		return model.getEmployee_surname();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the employee_department of this employee.
	 *
	 * @param employee_department the employee_department of this employee
	 */
	@Override
	public void setEmployee_department(String employee_department) {
		model.setEmployee_department(employee_department);
	}

	/**
	 * Sets the employee_id of this employee.
	 *
	 * @param employee_id the employee_id of this employee
	 */
	@Override
	public void setEmployee_id(long employee_id) {
		model.setEmployee_id(employee_id);
	}

	/**
	 * Sets the employee_name of this employee.
	 *
	 * @param employee_name the employee_name of this employee
	 */
	@Override
	public void setEmployee_name(String employee_name) {
		model.setEmployee_name(employee_name);
	}

	/**
	 * Sets the employee_surname of this employee.
	 *
	 * @param employee_surname the employee_surname of this employee
	 */
	@Override
	public void setEmployee_surname(String employee_surname) {
		model.setEmployee_surname(employee_surname);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected EmployeeWrapper wrap(Employee employee) {
		return new EmployeeWrapper(employee);
	}

}