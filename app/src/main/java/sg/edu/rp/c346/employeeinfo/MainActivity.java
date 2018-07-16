package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;

    ArrayList<EmployeeInfo> alEmployeeInfo;
    CustomAdapter caEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewEmployee);
        alEmployeeInfo = new ArrayList<>();
        EmployeeInfo emp1 = new EmployeeInfo("John", "software technical leader", 3400.0);
        EmployeeInfo emp2 = new EmployeeInfo("mary", "Programmer", 2200.0);
        EmployeeInfo emp3 = new EmployeeInfo("John1", "software technical leader", 3400.0);
        EmployeeInfo emp4 = new EmployeeInfo("mary1", "Programmer", 2200.0);
        EmployeeInfo emp5 = new EmployeeInfo("John2", "software technical leader", 3400.0);
        EmployeeInfo emp6 = new EmployeeInfo("mary2", "Programmer", 2200.0);
        EmployeeInfo emp7 = new EmployeeInfo("John3", "software technical leader", 3400.0);
        EmployeeInfo emp8 = new EmployeeInfo("mary3", "Programmer", 2200.0);
        EmployeeInfo emp9 = new EmployeeInfo("John4", "software technical leader", 3400.0);
        EmployeeInfo emp10 = new EmployeeInfo("mary4", "Programmer", 2200.0);
        EmployeeInfo emp11 = new EmployeeInfo("John5", "software technical leader", 3400.0);
        EmployeeInfo emp12 = new EmployeeInfo("mary5", "Programmer", 2200.0);
        alEmployeeInfo.add(emp1);
        alEmployeeInfo.add(emp2);
        alEmployeeInfo.add(emp3);
        alEmployeeInfo.add(emp4);
        alEmployeeInfo.add(emp5);
        alEmployeeInfo.add(emp6);
        alEmployeeInfo.add(emp7);
        alEmployeeInfo.add(emp8);
        alEmployeeInfo.add(emp9);
        alEmployeeInfo.add(emp10);
        alEmployeeInfo.add(emp11);
        alEmployeeInfo.add(emp12);

        caEmployee = new CustomAdapter(this,R.layout.employee_info,alEmployeeInfo );

        lvEmployee.setAdapter(caEmployee);
    }
}
