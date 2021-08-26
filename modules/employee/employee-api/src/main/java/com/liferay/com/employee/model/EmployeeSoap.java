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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmployeeSoap implements Serializable {

	public static EmployeeSoap toSoapModel(Employee model) {
		EmployeeSoap soapModel = new EmployeeSoap();

		soapModel.setEmployee_id(model.getEmployee_id());
		soapModel.setEmployee_name(model.getEmployee_name());
		soapModel.setEmployee_surname(model.getEmployee_surname());
		soapModel.setEmployee_department(model.getEmployee_department());

		return soapModel;
	}

	public static EmployeeSoap[] toSoapModels(Employee[] models) {
		EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
		EmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[] toSoapModels(List<Employee> models) {
		List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(
			models.size());

		for (Employee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
	}

	public EmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _employee_id;
	}

	public void setPrimaryKey(long pk) {
		setEmployee_id(pk);
	}

	public long getEmployee_id() {
		return _employee_id;
	}

	public void setEmployee_id(long employee_id) {
		_employee_id = employee_id;
	}

	public String getEmployee_name() {
		return _employee_name;
	}

	public void setEmployee_name(String employee_name) {
		_employee_name = employee_name;
	}

	public String getEmployee_surname() {
		return _employee_surname;
	}

	public void setEmployee_surname(String employee_surname) {
		_employee_surname = employee_surname;
	}

	public String getEmployee_department() {
		return _employee_department;
	}

	public void setEmployee_department(String employee_department) {
		_employee_department = employee_department;
	}

	private long _employee_id;
	private String _employee_name;
	private String _employee_surname;
	private String _employee_department;

}