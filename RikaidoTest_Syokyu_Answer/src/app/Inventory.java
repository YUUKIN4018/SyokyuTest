package app;

import java.util.ArrayList;
import java.util.List;

import util.MessageConstants;
/**
 * 在庫を管理するためのクラス。商品の追加、在庫表示、商品検索といった機能を提供する
 * 
 * @author 教育PJ
 * @since 2024/8/13(2025/1月修正版) 
 */
public class Inventory {
	
    private List<Product> products = new ArrayList<>();

    /**
     * 商品を在庫に追加するメソッド。
     * @param product 追加する商品
     */
    public void addProduct(Product product) {
		// TODO: Q10:productsリストに引数で受け取ったproductを追加してください。【６点】
		// TODO: Q11:商品が追加されたことを表示してください。（例: "商品が追加されました: " + product.getName()）【６点】
		// メッセージは定数を利用すること
        this.products.add(product);
        System.out.println(MessageConstants.PRODUCT_ADDED + product.getName());
    }

    /**
     * 現在の在庫を表示するメソッド。
     */
    public void displayInventory() {
		// TODO: Q12:在庫がない場合、「"在庫はありません。"」と表示してください。【６点】
		// TODO: Q13:在庫がある場合は、在庫のヘッダーを表示してください。（例: "現在の在庫:"）【６点】
		// TODO: Q14:productsリスト内の各商品について、商品名と数量を並べて表示してください。（例： 商品：　, 数量：　）【８点】
		if (products.isEmpty()) {
			System.out.println(MessageConstants.NO_INVENTORY);
			return;
		}
        System.out.println(MessageConstants.INVENTORY_HEADER);
        for (Product product : products) {
            System.out.println("商品: " + product.getName() + ", 数量: " + product.getQuantity());
        }
    }

    /**
     * 指定された名前の商品を検索するメソッド。
     * @param name 検索する商品の名前
     * @return 見つかった商品、またはnull
     */
    public Product searchProduct(String name) {
		// TODO: Q15:productsリスト内の各商品について、指定された名前と一致するかを確認してください。(文字の大小を区別しない)【６点】
		//補足: 文字列の比較はequalsIgnoreCaseメソッドを使用する
		// TODO: Q16:一致する商品が見つかった場合、その商品を返してください。【６点】
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
		// TODO: Q17:一致する商品が見つからなかった場合、nullを返してください。【６点】
        return null;
    }
}

