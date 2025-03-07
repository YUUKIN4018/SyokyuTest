package util;
/**
 * InventoryManagementSystemのメッセージ定数を提供するクラス
 * <p>
 * 開発現場では定数クラスを利用することが多いため、定数クラスの利用方法に慣れておくこと
 * 
 * @author 教育PJ 
 * @since 2024/8/13(2025/1月修正版) 
 */
public class MessageConstants {
	
	/**
	 * メニューの選択肢
	 * <pre>
	 * 1: 商品を追加
	 * 2: 在庫を表示
	 * 3: 商品を検索
	 * 4: 終了
	 * 操作を選んでください:
	 * </pre>
	 */
	public static final String MENU_OPTIONS = "\n1: 商品を追加\n2: 在庫を表示\n3: 商品を検索\n4: 終了\n操作を選んでください: ";
    /**
     * 商品名を入力してください: 
     */
	public static final String PRODUCT_NAME_PROMPT = "商品名を入力してください: ";
    /**
     * 商品の数量を入力してください: 
     */
	public static final String PRODUCT_QUANTITY_PROMPT = "商品の数量を入力してください: ";
    /**
     * 操作を終了します。
     */
	public static final String EXIT_MESSAGE = "操作を終了します。";
    /**
     * 商品が追加されました: 
     */
	public static final String PRODUCT_ADDED = "商品が追加されました: ";
    /**
     * 商品が見つかりません。
     */
	public static final String PRODUCT_NOT_FOUND = "商品が見つかりません。";
    /**
     * 現在の在庫:
     */
	public static final String INVENTORY_HEADER = "現在の在庫:";
	/**
	 * 在庫はありません。	
	 */
	public static final String NO_INVENTORY = "在庫はありません。";
	/**
	 * 無効な選択肢です。再度選んでください。
	 */
	public static final String INVALID_NUMBER = "無効な選択肢です。再度選んでください。";
	/**
	 * 数値を入力してください。
	 */
	public static final String INVALID_INPUT = "数値を入力してください。";
}

