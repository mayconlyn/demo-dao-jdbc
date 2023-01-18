package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("====== Test 1: Insert Department ======");
        Department dp = new Department(null, "Music");
        departmentDao.insert(dp);
        System.out.println("Inserted! New Id: "+ dp.getId());

        System.out.println("====== Test 2: FindById Department ======");
        dp = departmentDao.findById(6);
        System.out.println(dp);

        System.out.println("====== Test 3: Update Department ======");
        dp = departmentDao.findById(6);
        dp.setName("Musician");
        departmentDao.update(dp);
        System.out.println("Update Completed!");


    }
}
