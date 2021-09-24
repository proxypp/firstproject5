package Person;

import Person.ScanUtil;

public class PersonExe {
	public static PersonExe singleton = new PersonExe();
	public static Person[] persons;

	private PersonExe() {
		persons = new Person[100];
		persons[0] = new Person("�迵��", Gender.MAN, "111-111");
		persons[1] = new Student("ȫ�浿", Gender.MAN, "111-111", "����б�");
		persons[2] = new Worker("�迹��", Gender.WOMAN, "111-111", "IT");
	}
	
	
	public static PersonExe getInstance() {
		return singleton;
	}

	public void person1() {
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1. ģ����� 2.ģ����ȸ 3.ģ�� ��� ���� 4. ���� 5.����");
			System.out.println("----------------------");
			int nums = ScanUtil.readInt("��ȣ�� �������ּ���.");
			
			if (nums == 1) {
				System.out.println("ģ�����");
				PersonAdd();
			} else if (nums == 2) {
				System.out.println("ģ�� ��ȸ");
			} else if (nums == 3) {
				System.out.println("ģ����� ����");
			} else if (nums == 4) {
				System.out.println("ģ����� ����");
			} else if (nums == 5) {
				System.out.println("����.");
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

	public void PersonAdd() {
		System.out.println("1. ģ�� 2.�б� ģ�� 3. ȸ�� ģ�� ");
		int choice = ScanUtil.readInt("��ȣ�� �����ϼ���.");
		String name = ScanUtil.readStr("�̸� �Է�");
		String phone = ScanUtil.readStr("����ó �Է�");
		String gender = ScanUtil.readStr("�����Է�");
		boolean isExist = true;

		if (choice == 1) {
			System.out.println("choice1");
			for (int i = 0; i < persons.length; i++) {
				System.out.println("if�� ������");
				if (persons[i] == null) {
					if (gender.equals("����") || gender.equals("��")) {
						System.out.println("���ڵ���");
						persons[i] = new Person(name, Gender.MAN, phone);
						break;
					} else if (gender.equals("����") || gender.equals("��")) {
						System.out.println("���ڵ���");
						persons[i] = new Person(name, Gender.WOMAN, phone);
						break;
					} else {
						System.out.println("�߸� �Է��߽��ϴ�.");
						isExist = false;
						break;
					}
				}
				System.out.println("if�� ����");
				break;
			}
		} else if (choice == 2) {
			System.out.println("choice2");
			String school = ScanUtil.readStr("�б��̸��Է�");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					if (gender.equals("����") || gender.equals("��")) {
						persons[i] = new Student(name, Gender.MAN, phone, school);
					} else if (gender.equals("����") || gender.equals("��")) {
						persons[i] = new Student(name, Gender.WOMAN, phone, school);
					} else {
						System.out.println("�߸� �Է��߽��ϴ�.");
						isExist = false;
					}
				}
				break;
			}

		} else if (choice == 3) {
			System.out.println("choice3");
			String company = ScanUtil.readStr("�μ��Է�");
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					if (gender.equals("����") || gender.equals("��")) {
						persons[i] = new Worker(name, Gender.MAN, phone, company);
					} else if (gender.equals("����") || gender.equals("��")) {
						persons[i] = new Worker(name, Gender.WOMAN, phone, company);
					} else {
						System.out.println("�߸� �Է��߽��ϴ�.");
						isExist = false;
					}
				}
				break;
			}
		}
		if (isExist) {
			System.out.println("���������� ���.");
		} else {
			System.out.println("��ϵ��� �ʾҽ��ϴ�");
		}
	}
}
