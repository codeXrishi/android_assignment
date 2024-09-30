package com.example.idzassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EmployeeAdapter extends ArrayAdapter<EmployeeModel> {

    private Context context;
    private List<EmployeeModel> employees;

    public EmployeeAdapter(Context context, List<EmployeeModel> employees) {
        super(context, 0, employees);
        this.context = context;
        this.employees = employees;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        EmployeeModel employee = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_employee, parent, false);
        }

        // Lookup view for data population
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView ageTextView = convertView.findViewById(R.id.ageTextView);
        TextView salaryTextView = convertView.findViewById(R.id.salaryTextView);

        // Populate the data into the template view using the employee object
        nameTextView.setText("Name: " + employee.getName());
        ageTextView.setText("Age: " + employee.getAge());
        salaryTextView.setText("Salary: " + employee.getSalary());

        // Return the completed view to render on screen
        return convertView;
    }
}
