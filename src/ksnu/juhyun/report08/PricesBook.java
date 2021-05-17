package ksnu.juhyun.report08;

public class PricesBook {
	void pricesBook(Book[] books, int serial) {//���� ��� ���� �Լ� (���ݰ� �����ؼ� ��踦 �ۼ��ؼ� pricesbook���� ���)
		System.out.println("��ü ���� ���� �Ǽ� : "+countBook(books, serial));
		System.out.printf("������ ��� ���� : %f\n", averageBook(books, serial));
		System.out.println("�ְ� ���� ���� : "+books[highestPrice(books, serial)].getName()+" "+books[highestPrice(books, serial)].getPrice());
		System.out.println("���� ���� ���� : "+books[lowestPrice(books, serial)].getName()+" "+books[lowestPrice(books, serial)].getPrice());
	}
	int countBook(Book[] books, int serial) {//���� �������� å�� ��� �ִ��� ���
		int amount=0;
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				amount+=books[i].getAmount(); //�� ������ ������ ������
			}
		}
		return amount;
	}
	float averageBook(Book[] books, int serial) {//��ü ������ ��հ����� ���
		int sum=0;
		int count=0;//���� ������ �������� �ִ��� ���
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				sum+=books[i].getPrice(); //�� ������ ������ ������
				count++;
			}
		}
		return sum/count;
	}
	int highestPrice(Book[] books, int serial) {//���������� ���� ��� å�� ã��
		int highest=0;
		int index=0;//�ְ� ���� ������ ��ȣ�� ����
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				if(books[i].getPrice()>highest) {//�ְ��ݰ� ���� ������ ������ ��
					highest=books[i].getPrice(); //�� ������ ������ ������
					index=i;
				}
			}
		}
		return index;
	}
	int lowestPrice(Book[] books, int serial) {//���������� ���� �� å�� ã��
		int lowest=books[0].getPrice();//0��° å�� ������ �������� ��
		int index=0;//���� ���� ������ ��ȣ�� ����
		for (int i=1;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				if(books[i].getPrice()<lowest) {//�����ݰ� ���� ������ ������ ��
					lowest=books[i].getPrice(); //�� ������ ������ ������
					index=i;
				}
			}
		}
		return index;
	}
}
