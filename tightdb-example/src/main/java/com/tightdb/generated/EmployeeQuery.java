/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB query and was automatically generated.
 */
public class EmployeeQuery extends AbstractQuery<EmployeeQuery, Employee, EmployeeView> {

    public final StringQueryColumn<Employee, EmployeeView, EmployeeQuery> firstName;
    public final StringQueryColumn<Employee, EmployeeView, EmployeeQuery> lastName;
    public final LongQueryColumn<Employee, EmployeeView, EmployeeQuery> salary;
    public final BooleanQueryColumn<Employee, EmployeeView, EmployeeQuery> driver;
    public final BinaryQueryColumn<Employee, EmployeeView, EmployeeQuery> photo;
    public final DateQueryColumn<Employee, EmployeeView, EmployeeQuery> birthdate;
    public final MixedQueryColumn<Employee, EmployeeView, EmployeeQuery> extra;
    public final TableQueryColumn<Employee, EmployeeView, EmployeeQuery, PhoneTable> phones;

	public EmployeeQuery(TableBase table, TableQuery query) {
		super(EmployeeTable.TYPES, table, query);
        firstName = new StringQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 0, "firstName");
        lastName = new StringQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 1, "lastName");
        salary = new LongQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 2, "salary");
        driver = new BooleanQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 3, "driver");
        photo = new BinaryQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 4, "photo");
        birthdate = new DateQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 5, "birthdate");
        extra = new MixedQueryColumn<Employee, EmployeeView, EmployeeQuery>(EmployeeTable.TYPES, table, query, 6, "extra");
        phones = new TableQueryColumn<Employee, EmployeeView, EmployeeQuery, PhoneTable>(EmployeeTable.TYPES, table, query, 7, "phones", PhoneTable.class);
	}

}