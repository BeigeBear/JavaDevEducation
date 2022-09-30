import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void printMenu() {
		System.out.println("Contact ==============================");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 연락처 검색");
		System.out.println(">> 3. 연락처 수정");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 전체 리스트 보기");
		System.out.println(">> 6. 종료");
		System.out.println("======================================");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SmartPhone smartphone = new SmartPhone();

//		System.out.println("데이터 2개를 입력합니다.");
//		for(int i=0; i<2; i++) {
//			smartphone.addContact(smartphone.inputContactData());
//		}
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			// 연락처 입력 선택
			if(choiceMenu.equals("1")) {
				System.out.println(">> 등록 <<");
				System.out.println("등록할 연락처의 그룹의 번호를 입력하세요.");
				System.out.println(">> 1. 회사\n>> 2. 거래처");
				String choiceGroup = scanner.nextLine();
				if(choiceGroup.equals("1") || choiceGroup.equals("2")) {
					smartphone.addContact(smartphone.inputContactData());
				} else {
					System.out.println("오류ㅣ잘못 입력하셨습니다\n");
				}
				
			// 연락처 검색
			} else if(choiceMenu.equals("2")) {
				System.out.println(">> 검색 <<");
				System.out.println("검색할 연락처의 이름을 입력하세요");
				smartphone.searchContact(scanner.nextLine());
			
			// 연락처 수정
			} else if(choiceMenu.equals("3")) {
				System.out.println(">> 수정 <<");
				System.out.println("수정할 연락처의 이름을 입력하세요");
				String name = scanner.nextLine();
				System.out.println("데이터를 새로 입력해주세요");
				smartphone.editContact(name, smartphone.inputContactData());	
			
			// 연락처 삭제
			} else if(choiceMenu.equals("4")) {
				System.out.println(">> 삭제 <<");
				System.out.println("삭제할 연락처의 이름을 입력하세요");
				smartphone.deleteContact(scanner.nextLine());	
			
			// 연락처 전체 리스트 보기
			} else if(choiceMenu.equals("5")) {
				System.out.println(">> 전체 연락처 <<");
				smartphone.printAllContact();

			// 종료
			} else if(choiceMenu.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			
			// 그 외
			} else {
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}

	
}
