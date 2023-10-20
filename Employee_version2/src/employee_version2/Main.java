/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_version2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */

// only prints when ctrl + shift + f5
public class Main {
    public static void main(String[] args) throws ParseException {
        //Ancestor class
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date hireDate = dateFormat.parse("05-03-2025");
        Date birthDate = dateFormat.parse("15-05-2003");
       
        
        //HOURLY EMPLOYEE
        HourlyEmployee Houremployee = new HourlyEmployee(1, "Jybert", hireDate, birthDate, 8, 50);
//        employee.printEmployeeDetails();
        System.out.println(Houremployee.toString());
        
        //PIECE WORKER EMPLOYEE
        SimpleDateFormat pieceWorkerDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date pieceWorkerHireDate = pieceWorkerDateFormat.parse("01-01-2000");
        Date pieceWorkerBirthDate = pieceWorkerDateFormat.parse("01-01-1980");
        PieceWorkerEmployee PieceEmployee = new PieceWorkerEmployee(1, "Jerome", pieceWorkerHireDate, pieceWorkerBirthDate, 100, 5.0f);
//        PieceEmployee.printPieceWorkerDetails();
        System.out.println(PieceEmployee.toString());
        
        //COMMISSION EMPLOYEE
        SimpleDateFormat CommisionDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date CommissionHireDate = CommisionDateFormat.parse("01-01-2000");
        Date CommissionBirthDate = CommisionDateFormat.parse("01-01-1980");
        CommissionEmployee CommissionEmployee = new CommissionEmployee(1, "Jonel", CommissionHireDate, CommissionBirthDate, 75000.0);
//        CommissionEmployee.printCommissionEmployeeDetails();
        System.out.println(CommissionEmployee.toString());
        
        //BASE COMMISSION EMPLOYEE
        SimpleDateFormat BaseCommisionDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date BaseCommissionHireDate = BaseCommisionDateFormat.parse("01-01-2000");
        Date BaseCommissionBirthDate = BaseCommisionDateFormat.parse("01-01-1980");
        BasePlusCommissionEmployee BaseCommissionEmployee = new BasePlusCommissionEmployee(1, "Juan", BaseCommissionHireDate, BaseCommissionBirthDate, 75000.0, 20000.0);
        System.out.println(BaseCommissionEmployee.toString());
    }
}
