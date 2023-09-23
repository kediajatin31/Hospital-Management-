//package com.example.hospitalmanagement.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.hospitalmanagement.model.HospitalStaff;
//import com.example.hospitalmanagement.model.LoginRequest;
//import com.example.hospitalmanagement.service.HospitalStaffService;
//
//@RestController
//@RequestMapping("/api/staff")
//public class HospitalStaffController {
//    private final HospitalStaffService staffService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signUp(@RequestBody HospitalStaff staff) {
//        try {
//            staffService.signup(staff);
//            return ResponseEntity.status(HttpStatus.CREATED).body("Staff member registered successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
//        try {
//            HospitalStaff token = staffService.login(loginRequest.getUsername(), loginRequest.getPassword());
//            if (token != null) {
//                return ResponseEntity.ok("Login successful. Token: " + token);
//            } else {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed. Invalid credentials.");
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Login failed: " + e.getMessage());
//        }
//    }
//}
