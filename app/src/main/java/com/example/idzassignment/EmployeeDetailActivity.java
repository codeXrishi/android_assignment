package com.example.idzassignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmployeeDetailActivity extends AppCompatActivity {
    TextView nameTextView, ageTextView, salaryTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Employees Details");

        nameTextView = findViewById(R.id.nameTextView);
        ageTextView = findViewById(R.id.ageTextView);
        salaryTextView = findViewById(R.id.salaryTextView);

        // Get employee data from intent
        EmployeeModel employee = (EmployeeModel) getIntent().getSerializableExtra("employee");

        if (employee != null) {
            nameTextView.setText("Name: " + employee.getName());
            ageTextView.setText("Age: " + employee.getAge());
            salaryTextView.setText("Salary: " + employee.getSalary());
        }
    }
}