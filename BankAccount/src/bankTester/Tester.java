package bankTester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.bank.AccountType;
import com.bank.BankAccount;
import com.bank.DataUtils;
import com.bank.InvalidAccountException;
import com.bank.MinimumBalException;
import com.bank.SortByOpeningDate;

public class Tester {

	public static void main(String[] args) {

		try(Scanner sc= new Scanner(System.in)) {
			ArrayList <BankAccount> accList = DataUtils.populateAccount();
			
			int choice =0;
			do {
				System.out.println("****Menu****");
				System.out.println("1 Accept A/C details from user");
				System.out.println("2 Display all Accounts content using Advanced For loop"
						+ "\n 3. withdraw amount ");

				System.out.println("4. Accept account No & display details or erro message if account Not Found ");
				System.out.println("5. Accept From A/C NO  and To Account ID and to Funds transfer.");
				System.out.println("6. Accept A/C NO & remove A/C from List");
				System.out.println("7. Sort accounts as per ascending A/C No."
						+ "\n 8. Sort by accountOpeningDate"
						+ "\n 9. Sort by Balance");
				System.out.println("0. Exit");
				
				System.out.println("Enetr your choice:");
				choice = sc.nextInt();
				
				try {
					
					switch(choice) {
					case 1:
						System.out.println(" accNo, String name, AccountType type, LocalDate openingDate, double balance");
						
						accList.add(new BankAccount(sc.nextInt(), sc.next(), AccountType.valueOf(sc.next()), LocalDate.parse(sc.next()), sc.nextDouble()));
						System.out.println("Add successfully!!");
						break;
						
					case 2:
						for(BankAccount a : accList)
							System.out.println(a);
						break;
						
					case 3:
						try {
							System.out.println("Enter accno ");
						BankAccount acc = accList.get( sc.nextInt());
						if(acc == null)
							throw new InvalidAccountException("Account is invalid!!!");
						System.out.println("Enter amount of withdraw");
						double amount = sc.nextDouble();
						acc.withdraw(amount);
						}catch(MinimumBalException mbe) {
							mbe.getMessage();
						}
							break;
							
					case 4:
						
						BankAccount acc = accList.get( sc.nextInt());
						if(acc == null)
							throw new InvalidAccountException("Account is invalid!!!");
						for(BankAccount a : accList) {
							System.out.println(accList);
						}
						break;
						
					case 5:
						System.out.println("Enter srcNo, destNo, amount");
						int srcNo = sc.nextInt();
						int destNo = sc.nextInt();
						double amount = sc.nextDouble();
						
						BankAccount	src = accList.get(srcNo);
						if(src == null)
							throw new InvalidAccountException("Invalid account!!");
						BankAccount	dest = accList.get(destNo);
						if(dest == null)
						    throw new InvalidAccountException("Invalid account!!");
						    src.transfer(dest, amount);
						    break;
						    
						    
					case 6:
						System.out.println("Enter acc No from removal:");
						BankAccount a = accList.remove(sc.nextInt());
						if(a == null)
							throw new InvalidAccountException("Invalid account!!!");
						for(BankAccount a1 : accList)
							System.out.println(a1);
						break;
						
					case 7:
						Collections.sort(accList);
						for(BankAccount a1 : accList)
							System.out.println(a1);
						break;
						
					case 8:
						Collections.sort(accList, new SortByOpeningDate());
						for(BankAccount a2 : accList)
							System.out.println(a2);
						break;
						}
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}while(choice != 0);
			
		}
	}

}
