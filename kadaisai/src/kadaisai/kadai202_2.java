package kadaisai;

import java.text.NumberFormat;

public class kadai202_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int banana = 100;
		int momo = 300;
		int kazu = 25;
		NumberFormat nfNum = NumberFormat.getNumberInstance();

		System.out.println(banana + "円の" + "バナナを"+ kazu + "個、" + momo + "円の桃を" + kazu + "個買ったら、合計"+ nfNum.format(banana * kazu + momo * kazu )+ "円になりました。");
	}
}
