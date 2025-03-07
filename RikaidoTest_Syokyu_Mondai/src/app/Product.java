package app;

/**
 * 商品情報を保持するクラスで、商品名と数量を指定して利用する
 * 
 * @author 教育PJ 
 * @since 2024/8/13(2025/1月修正版) 
 */
public class Product {

	private String name;
	private int quantity;

	/**
	 * 商品名と数量を初期化するコンストラクタ
	 * @param name 商品名
	 * @param quantity 商品の数量
	 */
	public Product(String name, int quantity) {
		// TODO: Q6:引数で受け取ったnameとquantityをそれぞれフィールドに代入してください。【８点】

	}

	/**
	 * 商品名を返すメソッド
	 * @return 商品名
	 */
	public String getName() {
		// TODO: Q7:商品名を返してください。【５点】

	}

	/**
	 * 商品の数量を返すメソッド
	 * @return 商品の数量
	 */
	public int getQuantity() {
		// TODO: Q8:商品の数量を返してください。【５点】

	}

	/**
	 * 商品の数量を設定するメソッド
	 * @param quantity 新しい数量
	 */
	public void setQuantity(int quantity) {
		// TODO: Q9:引数で受け取ったquantityをフィールドに代入してください。【５点】

	}
}
