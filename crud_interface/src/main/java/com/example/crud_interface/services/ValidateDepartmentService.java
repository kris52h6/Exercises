package com.example.crud_interface.services;

public class ValidateDepartmentService {
    public boolean validateDepartmentNumber(int n) {
        // taken from stackoverflow to calculate digit length
        int length = (int)(Math.log10(n)+1);

        if (n % 10 != 0)
            return false;

        if (length < 2 || length > 3)
            return false;


        return true;
    }

    public static void main(String[] args) {
        ValidateDepartmentService validateDepartmentService = new ValidateDepartmentService();

        System.out.println(validateDepartmentService.validateDepartmentNumber(20));
    }
}
