package employee_version4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PieceWorkerEmployee extends Employee{
    private float totalPiecesFinished; // guess the data type
    private float ratePerPiece;

    // default constructor
    public PieceWorkerEmployee() {
    }
    // all info constructor
    public PieceWorkerEmployee(int empID, Name empName, DateFormat empDateHired, DateFormat empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    // basic info constructor
    public PieceWorkerEmployee(int empID, Name empName, float totalPiecesFinished, float ratePerPiece) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }


    // method computeSalary
    /*
     *override toString()-> same as hourly employee
     */
    public double computeSalary() {
        /*
        computeSalary():double -> computes the salary based on the finished (pieces) times the rate.
        A bonus is given for every hundred pieces finished which is times 10 of the rate per piece.
        (total*rate/piece )/100 *10
         */
        return (totalPiecesFinished * ratePerPiece) + (totalPiecesFinished / 100 * 10 * ratePerPiece);
    }

    //  *displayinfo():void -> same as hourly employee
    //private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void displayPieceEmpInfo() {
        super.displayBasicInfo();
        System.out.println("Total pieces finished: " + getTotalPiecesFinished());
        System.out.println("Rate per piece: " + getRatePerPiece());
        System.out.println("Salary: PHP " + computeSalary());
    }

    @Override
    public String toString() {
        return "\nTotal pieces finished: " + totalPiecesFinished +
                "\nRate per piece: " + ratePerPiece +
                "\nSalary: PHP " + computeSalary();
    }
}