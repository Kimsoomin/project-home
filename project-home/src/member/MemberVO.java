package member;

import java.io.Serializable;

import global.SQL;

public class MemberVO implements Serializable, SQL{
	
	private static final long serialVersionUID = 1L;
	
	private String userid; // ���̵�  =>hong => 'hong'
	private String password; // ���
	private String name; // ȸ���̸�
	private String birth; // ����
	private String phone; // ��ȭ��ȣ
	private String email; // �̸���
	private String gender; // ����
	private String addr; // �ּ�
	private String regdate; // �����
	private String profile; // �����ʻ���
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String userid, String password, String name, 
			String birth, String phone, String email,
			String gender, String addr) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.addr = addr;
		this.profile = "default.png";
	}
	
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getBirth() {
		return birth;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getAddr() {
		return addr;
	}
	public String getRegdate() {
		return regdate;
	}
	public String getProfile() {
		return profile;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public void setProfile(String profile) {
		this.profile = "default.png";
	}
	@Override
	public String toString() {
		return " ȸ�� [���̵�=" + userid 
				+ ", ��й�ȣ=" + password 
				+ ", �̸�=" + name 
				+ ", ����=" + birth
				+ ", ��ȭ��ȣ=" + phone 
				+ ", �̸���=" + email 
				+ ", ����=" + gender 
				+ ", �ּ�=" + addr 
				+ ", �����=" + regdate 
				+ ", ������ ����=" + profile + "]";
	}
	/**
	 * executeUpdate
	 * �߰�
	 * System.out.printf("hello ?, Good bye ? ",name,name2);
	 */
	
	@Override
	public String insert() {
		String query = "insert into member "
				+ "(userid, password,  name, birth, phone, email, "
				+ "gender, addr, regdate, profile)values(?,?,?,?,?,?,?,?,sysdate,?)";
		// ? => %s
		// %d ����
				
		return query;
	}
	@Override 
	public String update() {
		String query = "update member"
				+" set password = ?,"
				+ "addr = ?"
				+ "where userid = ?";
		return query;
	}
	@Override
	public String delete(String id) {
		String query = "delete from member"
				+ " where userid= ?";
		return query;
	}
	@Override
	public String selectAll() {
		String query = "select * from member";
		return query;
	}
	@Override
	public String selectOneby(String s) {
		String query = "select * from member where userid ="+this.make(s);
		return query;
	}
	@Override
	public String count() {
		// ����Ŭ���� as �� ������� Ű���� �ִ� ������ �Ѵ�.
		// Ű���� rs �� �ش� value �� ������ �� ���ȴ�.
		// ���� ������ ������, �÷����� Ű���� �ȴ�
		String query = "select count(*) as count from member";
		return query;
	}
	@Override
	public String make(String s) {
		// make(java) => 'java'
		return "'"+s+"'";
	}

	@Override
	public String selectSomeBy(String s1, String s2) {
		String query = "select * from member where "+s1+" ="+this.make(s2);
		return query;
	}

	@Override
	public String selectBy(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	