/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_version1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date birthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date birthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public void printPieceWorkerDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Piece Worker Employee ID: " + empID);
        System.out.println("Piece Worker Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Birth Date: " + dateFormat.format(birthDate));
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);

        float earnings = totalPiecesFinished * ratePerPiece;
        System.out.println("Earnings: " + earnings);
    }
    
    @Override
    public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    StringBuilder sb = new StringBuilder();
    
    sb.append("Piece Worker Employee ID: ").append(empID).append("\n");
    sb.append("Piece Worker Employee Name: ").append(empName).append("\n");
    sb.append("Date Hired: ").append(dateFormat.format(empDateHired)).append("\n");
    sb.append("Birth Date: ").append(dateFormat.format(birthDate)).append("\n");
    sb.append("Total Pieces Finished: ").append(totalPiecesFinished).append("\n");
    sb.append("Rate Per Piece: ").append(ratePerPiece).append("\n");
    
    float earnings = totalPiecesFinished * ratePerPiece;
    sb.append("Earnings: ").append(earnings).append("\n");
    
    return sb.toString();
}
}
