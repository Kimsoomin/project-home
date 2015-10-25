package member;

import java.util.List;

public interface MemberService {
	/**
	 * DML -> pstmt.executeUpdate()
	 */
	// ȸ������
	public String join(MemberVO o);
	// ��� ����
	public int changePass(MemberVO o);
	// ȸ�� Ż��
	public int remove(MemberVO o);
	/**
	 * DQL -> stmt.executeQuery()
	 */
	// �α���
	public MemberVO login(String id, String pass);
	// ��ȸ����
	public int count();
	// ���̵� �˻�
	public MemberVO searchById(String id);
	// Ű���� �˻�(�ߺ� ���)
	public List<MemberVO> searchBySearchword(String domain,String searchword);
	// ��ü ȸ�� ���
	public List<MemberVO> getList();
	
	
}