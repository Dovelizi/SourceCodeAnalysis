// version :9
import lombok.Getter;
import lombok.val;

class MixGetterVal {
	@Getter private int x;
	
	public void m(int z) {}
	public void test() {
		val y = x;
		m(y);
		val a = getX();
		m(a);
	}
}
