/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_version2;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Emp {
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date birthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID,empName,empDateHired,birthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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


    
    @Override
    public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    StringBuilder sb = new StringBuilder();
    
    sb.append("Piece Worker Employee ID: ").append(getEmpID()).append("\n");
    sb.append("Piece Worker Employee Name: ").append(getEmpName()).append("\n");
    sb.append("Date Hired: ").append(dateFormat.format(getEmpDateHired())).append("\n");
    sb.append("Birth Date: ").append(dateFormat.format(getBirthDate())).append("\n");
    sb.append("Total Pieces Finished: ").append(totalPiecesFinished).append("\n");
    sb.append("Rate Per Piece: ").append(ratePerPiece).append("\n");
    
    float earnings = totalPiecesFinished * ratePerPiece;
    sb.append("Earnings: ").append(earnings).append("\n");
    
    return sb.toString();
}
}
