package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		/**
		 * CRUD
		 * Create : �߰�
		 * Read : �˻�
		 * Update : ����
		 * Delete : ����
		 */
		String id = "", pass ="";
		Scanner scanner = new Scanner(System.in);
		MemberService service = MemberServiceImpl.getInstance();
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO m = new MemberVO();
		while (true) {
			System.out.println("1 : ȸ������  2: �α���  3:��ȸ���� 4:ID�˻�  "
					+ "5:���ǰ˻� 6:ȸ���������� 7:��üȸ������ 9:ȸ��Ż��  10:����");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("���̵� �Է��ϼ���");
				String userid = scanner.next();
				if (service.searchById(userid).getUserid() != null) {
					System.out.println("�̹� ���Ե� ���̵� �Դϴ�.");
					break;  // �ٽ� ó�� �Է¸�ɹ����� �ǵ��ư�
				}
				System.out.println("��� �Է��ϼ���");
				String password = scanner.next();
				System.out.println("�̸� �Է��ϼ���");
				String name = scanner.next();
				System.out.println("���� �Է��ϼ���");
				String gender = scanner.next();
				System.out.println("���� �Է��ϼ���");
				String birth = scanner.next();
				System.out.println("�̸��� �Է��ϼ���");
				String email = scanner.next();
				System.out.println("�ּ� �Է��ϼ���");
				String addr = scanner.next();
				System.out.println("��ȭ��ȣ �Է��ϼ���");
				String phone = scanner.next();
				MemberVO temp = new MemberVO( userid,  password,  name, 
						 birth,  phone,  email,
						 gender,  addr);
				System.out.println(service.join(temp));
				break;
			case 2:
				System.out.println("�α��� �� ID, ����� �Է� ���ּ���");
				String loginId = scanner.next();
				String loginPass = scanner.next();
				if (service.login(loginId, loginPass).getUserid() != null) {
					System.out.println("ȯ���մϴ�.");
				} else {
					System.out.println("�α��� �����Դϴ�.");
				}
				break;
			case 3:
				System.out.println(service.count()+"�� �Դϴ�.");
				break;
			case 4:
				System.out.println("�˻��� ID �Է� : ");
				String searchId = scanner.next();
				m = service.searchById(searchId);
				if (m.getUserid() != null) {
					System.out.println(m.toString());
				}else{
					System.out.println("�˻��� ID�� �������� �ʽ��ϴ�.");
				}
				break;
			case 5:
				System.out.println("�˻��� �׸��� �����ּ���. 1:�̸� 2:�ּ� 3:����");
				int sub = scanner.nextInt();
				switch (sub) {
				case 1: 
					System.out.println("�˻��� �̸� �Է� : ");
					list = service.searchBySearchword("name", scanner.next());
					break;
				case 2:
					System.out.println("�˻��� �ּ� �Է� : ");
					list = service.searchBySearchword("addr", scanner.next());
					break;
				case 3:
					System.out.println("�˻��� ���� �Է�(��:M , ��:W) : ");
					list = service.searchBySearchword("gender", scanner.next());
					break;
				default:
					break;
				}
				for (MemberVO vo : list) {
					System.out.println(vo);
				}
				break;
			case 6:
				System.out.println("�α��� �� ID, ����� �Է� ���ּ���");
				String loginId2 = scanner.next();
				String loginPass2 = scanner.next();
				m = service.login(loginId2, loginPass2);
				if (m != null) {
					System.out.println("ȯ���մϴ�.");
				}else{
					System.out.println("�ٽ� �α��� ���ּ���");
					break;
				}
				System.out.println("������ �׸��� �����ּ���.(��� : password, �ּ� : addr)");
				String column = scanner.next();
				System.out.println("�������� �Է��ϼ���");
				String changeVal = scanner.next();
				switch (column) {
				case "password":
					m.setPassword(changeVal);
					if (service.changePass(m)==1) { // ����Ŭ�� ������ ��
						System.out.println("�����Ǿ����ϴ�.");
					} else {
						System.out.println("���� ����");
					} 
					break;
				case "addr":
					m.setAddr(changeVal);
					service.changePass(m);
					break;

				default:break;
				}
				System.out.println("������ �����Ǿ����ϴ�.");
//				searchByID(dao, loginId2);
				break;
			case 7:
				list = service.getList();
				for (MemberVO mem : list) {
					System.out.println(mem);
				}
				break;
			case 9:
				System.out.println("�α��� �� ID, ����� �Է� ���ּ���");
				String delId = scanner.next();
				String delPw = scanner.next();
				m = service.login(delId, delPw);
				if (m != null) {
					System.out.println("ȯ���մϴ�.");
				}else{
					System.out.println("�ٽ� �α��� ���ּ���");
					break;
				}
				if (service.remove(m) == 1) {
					System.out.println("�����Ǿ����ϴ�.");
				}else{
					System.out.println("�����߽��ϴ�.");
					break;
				}
				break;
			case 10: return;
			default:
				break;
			}
		}
	}


}
