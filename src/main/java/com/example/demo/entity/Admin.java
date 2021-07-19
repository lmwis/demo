package com.example.demo.entity;

public class Admin {//管理员表
    private int adminId;
    private String adminName;
    private String password;
    private String role;

    public Admin() {
        super();
    }

    public Admin(String adminName, String password, String role) {
        this.adminName = adminName;
        this.password = password;
        this.role = role;
    }

    public Admin(int adminId, String adminName, String password, String role) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
