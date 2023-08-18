// 処理用パッケージ
package processor;

// 子クラスとするので"SubClass"と命名
// extendsでSuperClassを継承
public class SubClass extends SuperClass {
	// 変数を定義
	public int hitPoint;
	public int magicPoint;
	public int attack;
	public int speed;
	public int defence;

	// 各変数のgetter、setterメソッド
	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	// 各変数に数値を代入するメソッド
	public void set() {
		// super()で親メソッドを利用
		setHitPoint(super.power(hitPoint));
		setMagicPoint(super.power(magicPoint));
		setAttack(super.power(attack));
		setSpeed(super.power(speed));
		setDefence(super.power(defence));
	}
}
