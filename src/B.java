/**
 * 생성자 상속관계 : 자식 클래스
 * @author kaywon1
 *
 */
public class B extends A {
	int c;

	B(int a, int b, int c) {
		super(a, b);
		int c;
	}
	B(int a, int b, int c, int d){
		super(a, b);
		this.c = c;
		this.d = d;
	}
}
