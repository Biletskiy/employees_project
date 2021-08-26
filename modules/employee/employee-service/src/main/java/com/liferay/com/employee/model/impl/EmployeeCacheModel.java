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

package com.liferay.com.employee.model.impl;

import com.liferay.com.employee.model.Employee;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (employee_id == employeeCacheModel.employee_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employee_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employee_id=");
		sb.append(employee_id);
		sb.append(", employee_name=");
		sb.append(employee_name);
		sb.append(", employee_surname=");
		sb.append(employee_surname);
		sb.append(", employee_department=");
		sb.append(employee_department);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployee_id(employee_id);

		if (employee_name == null) {
			employeeImpl.setEmployee_name("");
		}
		else {
			employeeImpl.setEmployee_name(employee_name);
		}

		if (employee_surname == null) {
			employeeImpl.setEmployee_surname("");
		}
		else {
			employeeImpl.setEmployee_surname(employee_surname);
		}

		if (employee_department == null) {
			employeeImpl.setEmployee_department("");
		}
		else {
			employeeImpl.setEmployee_department(employee_department);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employee_id = objectInput.readLong();
		employee_name = objectInput.readUTF();
		employee_surname = objectInput.readUTF();
		employee_department = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(employee_id);

		if (employee_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employee_name);
		}

		if (employee_surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employee_surname);
		}

		if (employee_department == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employee_department);
		}
	}

	public long employee_id;
	public String employee_name;
	public String employee_surname;
	public String employee_department;

}