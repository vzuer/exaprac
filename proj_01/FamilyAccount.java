// import Utility.*;
public class FamilyAccount{
	
	public static void main(String[] args){
		boolean isFlag = true;
		while(isFlag){
			System.out.println("-------------家庭收支记账软件----------------");
			System.out.println("                1 收支明细               ");
			System.out.println("                2 登记收入               ");
			System.out.println("                3 登记支出               ");
			System.out.println("                4 退    出               ");
			System.out.println("                                         ");
			System.out.print("               请选择 <1-4>: ");
					
			// 获取用户的选择：1-4
			char selection = Utility.readMenuSelection();
			switch(selection){
				case '1':
					// System.out.println("1 收支明细");
					break;
				case '2':
					System.out.println("2 登记收入");
					break;	
				case '3':
					System.out.println("3 登记支出");
					break;
				case '4':
					// System.out.println("4 退    出");
					System.out.println("确认是否退出 <Y/N>");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y'){
						isFlag = false;
					}
					// break;
															
			}
	}
	}

}