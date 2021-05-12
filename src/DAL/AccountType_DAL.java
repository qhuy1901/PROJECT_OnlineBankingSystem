package DAL;

import DTO.AccountType_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AccountType_DAL extends DBConnection
{
    public AccountType_DTO getSavingsAccountType(String savingsAccountType, String term)
    {
        AccountType_DTO dtoAccountType = null;
        try
        {
            // Xác định loại tài khoản tiết kiệm từ các tham số truyền vào
            String accountTypeId = "";
            if(savingsAccountType.equals("Term Savings Account"))
            {
                if(term.equals("1 month"))
                    accountTypeId = "TSA01";
                else if(term.equals("3 months"))
                    accountTypeId = "TSA03";
                else 
                    accountTypeId = "TSA06";
            }
            else
            {
                if(term.equals("1 month"))
                    accountTypeId = "NSA01";
                else if(term.equals("3 months"))
                    accountTypeId = "NSA03";
                else 
                    accountTypeId = "NSA06";
            }
            // Lấy thông tin về loại tài khoản tiết kiệm (lãi xuất) và return
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM ACCOUNT_TYPE WHERE ACCOUNT_TYPE_ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, accountTypeId);
            ResultSet rs = prest.executeQuery();
            while(rs.next())
                dtoAccountType = new AccountType_DTO(rs.getString(1), rs.getString(2), rs.getDouble(3));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return dtoAccountType;
    }
}