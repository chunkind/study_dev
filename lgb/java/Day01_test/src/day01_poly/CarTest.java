package day01_poly;
/*
 * �������̶� '�������� ���¸� ���� �� �ִ� �ɷ�' 
 * ����Ŭ���� Ÿ���� ���������� �ڼ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ͽ���. 
 */
public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = null;
		FireEngine fe = new FireEngine();
		FireEngine fe1 = null;
		
		/*fe.water();
		car = fe;
		fe1 = (FireEngine) car;
		fe1.water();
		fe1.drive();*/
		
		car.drive();
		//fe = (FireEngine) car;
		fe.drive();
		car1 = fe;
		car1.drive();
	}
}

class Car {
	String color;
	int door;
	
	void drive(){ // �����ϴ� ��� 
		System.out.println("drive fast~~~");
	}
	
	void stop(){ // �����ϴ� ���
		System.out.println("stop!!!!");
	}
}	

	class FireEngine extends Car {
		void water() {
			System.out.println("water~~!!");
		}
		
		@Override
		void drive(){
			super.drive();
			System.out.println("�ҹ����� ����!!");
		}
	}
	
	class Ambulance extends Car {
		void siren(){
			System.out.println("siren!!!");
		}
	}




