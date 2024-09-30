package com.example.idzassignment;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("dummy/EmployeeDetails.json")
    Call<EmployeeResponse> getEmployees();
}
