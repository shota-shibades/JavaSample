// 処理用パッケージ
package processor;

// 子クラスとするので"SubClass"と命名
// extendsでSuperClassを継承
public class SubClass extends SuperClass {
	//  カプセル化-処理用のクラスからのみ変数の定義が行えるようアクセス修飾子privateを指定
	// 変数を定義
	private int hitPoint;
	private int magicPoint;
	private int attack;
	private int speed;
	private int defence;

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
}
