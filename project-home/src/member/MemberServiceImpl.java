package member;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {
		return instance;
	} 
	MemberDAO dao = new MemberDAO();
	/**
	 * DML
	 */
	// ȸ������
	@Override
	public String join(MemberVO o) {
		String temp = "";
		System.out.println("ȸ������ " +o.toString());
		if (dao.insert(o) == 1) {
			System.out.println("ȸ������ ����");
		}else{
			System.out.println("ȸ������ ����");
		}
		return temp;
	}
	//�������
	@Override
	public int changePass(MemberVO o) {
		return dao.update(o);
	}
	 // ȸ��Ż��
	@Override
	public int remove(MemberVO o) {
		return dao.delete(o);
	}
	/**
	 * DQL
	 */
	// �α���
	@Override
	public MemberVO login(String id, String pass) {
		return dao.login(id, pass);
	}
	//��ü ȸ���� 
	@Override
	public int count() {
		return dao.count();
	}
	//ID�� ȸ���˻�
	@Override
	public MemberVO searchById(String id) {
		MemberVO m = new MemberVO();
		m =dao.selectOneBy(id);
		
		return m;
	}
	// �˻���� �˻�
	@Override
	public List<MemberVO> searchBySearchword(String domain,String searchword) {
		return dao.selectSomeBy(domain, searchword);
	}
	// ��ü ȸ����� 
	@Override
	public List<MemberVO> getList() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = dao.selectAll();
		return list;
	}
	 
	
}
	