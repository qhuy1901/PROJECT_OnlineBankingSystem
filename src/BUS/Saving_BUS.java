package BUS;
// Bus này chỉ dùng cho form Saving
import DAL.AccountType_DAL;
import DAL.Account_DAL;
import DAL.UserLogin_DAL;
import DTO.AccountType_DTO;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import java.util.ArrayList;
import java.util.TreeMap;

public class Saving_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    AccountType_DAL dalAccountType = new AccountType_DAL();
    UserLogin_DAL dalUserLogin = new UserLogin_DAL();
            
    public long getTotalSavingAccount(Customer_DTO dtoCustomer)
    {
        return dalAccount.getTotalSavingAccount(dtoCustomer);
    }
    
    public AccountType_DTO getSavingsAccountType(String savingsAccountType, String term)
    {
        return dalAccountType.getSavingsAccountType(savingsAccountType, term);
    }

    public TreeMap<String, String> getAccountTypeList()
    {
        return dalAccountType.getAccountTypeList();
    }
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }

    public ArrayList<Account_DTO> getSavingsAccountList(Customer_DTO dtoCustomer)
    {
        return dalAccount.getSavingsAccountList(dtoCustomer);
    }
    
    public boolean openSavingsAccount(Account_DTO dtoAccount)
    {
        return dalAccount.openSavingsAccount(dtoAccount);
    }
    
    public boolean settle(Account_DTO dtoSavingAccount)
    {
        return dalAccount.settle(dtoSavingAccount);
    }
    
}
