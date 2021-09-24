package Person;

import Person.ScanUtil;

public class PersonExe {
	public static PersonExe singleton = new PersonExe();
	public static Person[] persons;

	private PersonExe() {
		persons = new Person[100];
		persons[0] = new Person("김영오", Gender.MAN, "111-111");
		persons[1] = new Student("홍길동", Gender.MAN, "111-111", "고등학교");
		persons[2] = new Worker("김예진", Gender.WOMAN, "111-111", "IT");
	}
	
	
	public static PersonExe getInstance() {
		return singleton;
	}

	public void person1() {
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1. 친구등록 2.친구조회 3.친구 목록 수정 4. 삭제 5.종료");
			System.out.println("----------------------");
			int nums = ScanUtil.readInt("번호를 선택해주세요.");
			
			if (nums == 1) {
				System.out.println("친구등록");
				PersonAdd();
			} else if (nums == 2) {
				System.out.println("친구 조회");
			} else if (nums == 3) {
				System.out.println("친구목록 수정");
			} else if (nums == 4) {
				System.out.println("친구목록 삭제");
			} else if (nums == 5) {
				System.out.println("종료.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

	public void PersonAdd() {
		System.out.println("1. 친구 2.학교 친구 3. 회사 친구 ");
		int choice = ScanUtil.readInt("번호를 선택하세요.");
		String name = ScanUtil.readStr("이름 입력");
		String phone = ScanUtil.readStr("연락처 입력");
		String gender = ScanUtil.readStr("성별입력");
		boolean isExist = true;

		if (choice == 1) {
			System.out.println("choice1");
			for (int i = 0; i < persons.length; i++) {
				System.out.println("if문 들어가기전");
				if (persons[i] == null) {
					if (gender.equals("남자") || gender.equals("남")) {
						System.out.println("남자들어옴");
						persons[i] = new Person(name, Gender.MAN, phone);
						break;
					} else if (gender.equals("여자") || gender.equals("여")) {
						System.out.println("여자들어옴");
						persons[i] = new Person(name, Gender.WOMAN, phone);
						break;
					} else {
						System.out.println("잘못 입력했습니다.");
						isExist = false;
						break;
					}
				}
				System.out.println("if문 나옴");
				break;
			}
		} else if (choice == 2) {
			System.out.println("choice2");
			String school = ScanUtil.readStr("학교이름입력");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					if (gender.equals("남자") || gender.equals("남")) {
						persons[i] = new Student(name, Gender.MAN, phone, school);
					} else if (gender.equals("여자") || gender.equals("여")) {
						persons[i] = new Student(name, Gender.WOMAN, phone, school);
					} else {
						System.out.println("잘못 입력했습니다.");
						isExist = false;
					}
				}
				break;
			}

		} else if (choice == 3) {
			System.out.println("choice3");
			String company = ScanUtil.readStr("부서입력");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					if (gender.equals("남자") || gender.equals("남")) {
						persons[i] = new Worker(name, Gender.MAN, phone, company);
					} else if (gender.equals("여자") || gender.equals("여")) {
						persons[i] = new Worker(name, Gender.WOMAN, phone, company);
					} else {
						System.out.println("잘못 입력했습니다.");
						isExist = false;
					}
				}
				break;
			}
		}
		if (isExist) {
			System.out.println("정상적으로 등록.");
		} else {
			System.out.println("등록되지 않았습니다");
		}
	}
}
