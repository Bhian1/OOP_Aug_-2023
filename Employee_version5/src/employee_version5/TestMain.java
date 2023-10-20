package employee_version5;

public class TestMain {
    public static void main(String[] args) {

         HourlyEmployee empHour = new HourlyEmployee(
                1,
                new Name("Mister", "Rodrigo", "Duterte", "Roa"),
                100.00f,
                200.00f
        );
        empHour.setEmpDateHired(new DateFormat(3, 6, 2006));
        empHour.setEmpBirthDate(new DateFormat(5, 8, 1996));

        PieceWorkerEmployee empPiece = new PieceWorkerEmployee(
                2,
                new Name("Manny", "Pacquiao", "Pacman"),
                200.00f,
                70.00f
        );
        empPiece.setEmpDateHired(new DateFormat(26, 8, 2010));
        empPiece.setEmpBirthDate(new DateFormat(15, 12, 1988));

        CommissionEmployee empComm = new CommissionEmployee(
                3,
                new Name("Doctor", "John", "Dorian", "Michael", "XX"),
                70000.00
        );
        empComm.setEmpDateHired(new DateFormat(28, 2, 2020));
        empComm.setEmpBirthDate(new DateFormat(19, 3, 1992));


        BasePlusCommissionEmployee empBCE = new BasePlusCommissionEmployee(
                4,
                new Name("John", "Snow"),
                90000.00,
                2500.00
        );
        empBCE.setEmpDateHired(new DateFormat(24, 3, 2001));
        empBCE.setEmpBirthDate(new DateFormat(8, 11, 1970));

        BasePlusCommissionEmployee empBCE1 = new BasePlusCommissionEmployee(
                5,
                new Name("Jenny", "Rosita", "Espinosa"),
                100000.00,
                1500.00
        );
        empBCE1.setEmpDateHired(new DateFormat(12, 6, 2011));
        empBCE1.setEmpBirthDate(new DateFormat(6, 3, 1989));

        // creating an EmployeeRoster
        EmployeeRoster roster = new EmployeeRoster();

        // adding employees to the roster
        roster.addEmployee(empHour);
        roster.addEmployee(empPiece);
        roster.addEmployee(empComm);
        roster.addEmployee(empBCE);
        roster.addEmployee(empBCE1);

        // display by individual type1
        System.out.println("\n\nDisplaying Per Type Employees: \n");
        roster.displayHE();
        roster.displayPWE();
        roster.displayCE();
        roster.displayBPCE();

        // displaying All Emp
        System.out.println("\n\nDisplaying All Employees: ");
        roster.displayAllEmployees();
        // initial count
        System.out.println("\nDisplaying Count of all Employees: ");
        int hourlyCount = roster.countHourlyEmployee();
        System.out.println("Hourly: " + hourlyCount);
        int pieceCount = roster.countPieceEmployee();
        System.out.println("Piece Worker: " + pieceCount);
        int commCount = roster.countCommissionEmployee();
        System.out.println("Commission: " + commCount);
        int BPCEmpCount = roster.countBPCommEmployee();
        System.out.println("Base plus Commission: " + BPCEmpCount);



        // removing an employee
        System.out.println("\n\nRemoving an Employee:");
        int removeEmpID = 3;
        boolean remove = roster.removeEmployee(removeEmpID);
        if(remove) {
            System.out.println("Removed ID: " + removeEmpID);
        } else {
            System.out.println("Not removed.");
        }
        // updated info after removal
        System.out.println("List after deletion of Employees: ");
        roster.displayAllEmployees();

        // get employee / search
        System.out.println("\n\nDisplaying Search / Get Employee");
        String keyword = "Snow";
        EmployeeRoster searchResult = roster.getEmployee(keyword);
        System.out.println("Employee/s with the keyword '" + keyword + "':");
        searchResult.displayAllEmployees();


        // updating
        System.out.println("\n\nUpdating an Employee:");
        int IDToUpdate = 4;
        BasePlusCommissionEmployee updateEmp = new BasePlusCommissionEmployee(
                IDToUpdate,
                new Name("John", "Snow", "Stark"),
                19000.00,
                4000.00
        );
        boolean updated = roster.updateEmployee(IDToUpdate, updateEmp);
        if(updated) {
            System.out.println("Employee ID updated info: ID " + IDToUpdate);
        } else {
            System.out.println("Not found");
        }

        System.out.println("Displaying list after update: ");
        roster.displayAllEmployees();
    }
}