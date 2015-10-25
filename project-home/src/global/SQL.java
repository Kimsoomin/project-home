package global;

public interface SQL {
	/**
	 * executeUpdate : DML �߿� ���̺��� �����Ͱ��� ������
	 */
	public String insert();		// �߰�
	public String update();		// ����
	public String delete(String s);		// ����

	/**
	 * executeQuery : DML �߿� ���̺��� �����Ͱ��� �������� ���� 
	 */
	public String selectAll();			   	// ��ü��ȸ
	public String selectOneby(String s);	// ID ��ȸ
	public String count();					// ��ü ����
	public String selectBy(String s);		// �̸� ��ȸ
	public String selectSomeBy(String s1, String s2);	// ���� ����� �˻�
	
	/**
	 * ���� ��Ÿ��
	 */
	public String make(String s);		// SQLŸ���� �Ķ���ͷ� ��ȯ

	

}