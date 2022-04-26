package com.example.crud_interface;

import com.example.crud_interface.services.ValidateDepartmentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateDepartmentServiceTest {

    @Test
    void validateDepartmentNumber() {
        var validateDepartmentService = new ValidateDepartmentService();

        boolean expectedResultTen = true;
        boolean resultFromTen = validateDepartmentService.validateDepartmentNumber(10);


        boolean expectedResultTwoHundred = true;
        boolean resultFromHundred = validateDepartmentService.validateDepartmentNumber(200);

        boolean expectedResultNineteeen = false;
        boolean resultFromNineteen = validateDepartmentService.validateDepartmentNumber(19);


        assertTrue(resultFromTen);
        assertTrue(resultFromHundred);
        assertFalse(resultFromNineteen);
    }

}