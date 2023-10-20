package employee_version4;

public class EmployeeRoster {
    private Employee empList[];
    private int max;
    private int count;

    public EmployeeRoster() {
        this.max = 10;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public int countHourlyEmployee() {
        int HECount = 0;
        for(Employee emp : empList) {
            if(emp instanceof HourlyEmployee) {
                HECount++;
            }
        }
        return HECount;
    }

    public int countPieceEmployee() {
        int PWCount = 0;
        for(Employee emp : empList) {
            if(emp instanceof PieceWorkerEmployee){
                PWCount++;
            }
        }
        return PWCount;
    }

    public int countCommissionEmployee() {
        int CommCount = 0;
        for(Employee emp : empList) {
            if(emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                CommCount++;
            }
        }
        return CommCount;
    }

    public int countBPCommEmployee() {
        int BPCECount = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                BPCECount++;
            }
        }
        return BPCECount;
    }
    // add
    public void addEmployee(Employee emp) {
        empList[count] = emp;
        count++;
    }

    // remove
    public boolean removeEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == empID) {
                empList[i] = null;
                empList[i] = empList[count - 1];
                empList[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    // get
    public EmployeeRoster getEmployee(String keyword) {
        EmployeeRoster searchResult = new EmployeeRoster(max);
        for (Employee emp : empList) {
            if (emp != null && emp.getEmpName().displayName().contains(keyword)) {
                searchResult.addEmployee(emp);
            }
        }
        return searchResult;
    }


    // update
    public boolean updateEmployee(int empID, Employee updatedEmployee) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == empID) {
                empList[i] = updatedEmployee;
                return true;
            }
        }
        return false;
    }

    // display HE
    public void displayHE() {
        System.out.println("Hourly Employees: ");
        for(Employee emp : empList) {
            if(emp instanceof HourlyEmployee) {
                System.out.println("ID: " + emp.getEmpID() + " | Name: " + emp.getEmpName().displayName());
            }
        }
    }
    // display PWE
    public void displayPWE() {
        System.out.println("\nPiece Worker Employees: ");
        for(Employee emp : empList) {
            if(emp instanceof PieceWorkerEmployee) {
                System.out.println("ID: " + emp.getEmpID() + " | Name: " + emp.getEmpName().displayName());
            }
        }
    }
    // display BPCE
    public void displayBPCE() {
        System.out.println("\nBase Plus Commission Employees: ");
        for(Employee emp : empList) {
            if(emp instanceof BasePlusCommissionEmployee) {
                System.out.println("ID: " + emp.getEmpID() + " | Name: " + emp.getEmpName().displayName());
            }
        }
    }
    // display CE
    public void displayCE() {
        System.out.println("\nCommission Employees: ");
        for(Employee emp : empList) {
            if(emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                System.out.println("ID: " + emp.getEmpID() + " | Name: " + emp.getEmpName().displayName());
            }
        }
    }

    // display employees in tabular form
    public void displayAllEmployees() {
        ///System.out.println("\n\n\n");
        System.out.printf("%-4s|\t%-25s|\t%-25s|\t%-15s\n", "ID", "Name", "Type", "Salary");
        System.out.println("-------------------------------------------------------------------------------");
        for (Employee emp : empList) {
            if (emp != null) {
                String type = "";
                double salary = 0;
                if (emp instanceof HourlyEmployee) {
                    type = "Hourly";
                    salary = ((HourlyEmployee) emp).computeSalary();
                } else if (emp instanceof PieceWorkerEmployee) {
                    type = "Piece Worker";
                    salary = ((PieceWorkerEmployee) emp).computeSalary();
                } else if (emp instanceof BasePlusCommissionEmployee) {
                    type = "Base Plus Commission";
                    salary = ((BasePlusCommissionEmployee)emp).computeSalary();
                } else if (emp instanceof CommissionEmployee) {
                    type = "Commission";
                    salary = ((CommissionEmployee) emp).computeSalary();
                }

                System.out.printf("%-4d|\t%-25s|\t%-25s|\tPhp %-10.2f\n", emp.getEmpID(), emp.getEmpName().displayName(), type, salary);
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}