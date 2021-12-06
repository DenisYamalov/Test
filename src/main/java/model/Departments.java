package model;

public enum Departments {
    WorkShop(0),
    Warehouse(1);
    private int departmentNumber;

    Departments(int departmentNumber) {

        this.departmentNumber = departmentNumber;
    }
}
