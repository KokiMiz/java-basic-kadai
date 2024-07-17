package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	private HashMap<String, String> choices;
	
	public Jyanken_Chapter26() {
        choices = new HashMap<>();
        choices.put("r", "グー");
        choices.put("s", "チョキ");
        choices.put("p", "パー");
    }
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			  System.out.println("自分のじゃんけんの手を入力しましょう");
	            System.out.println("グーはrockのrを入力しましょう");
	            System.out.println("チョキはscissorsのsを入力しましょう");
	            System.out.println("パーはpaperのpを入力しましょう");
	            choice = scanner.nextLine();
	            if (choices.containsKey(choice)) {
	            	break;
	            } else {
	            	System.out.println("正しいじゃんけんの手ではありません。再度入力してください。");
	            	
	            }
		}
		   return choice;
	}
	
	 public String getRandom() {
	        String[] options = {"r", "s", "p"};
	        int randomIndex = (int) Math.floor(Math.random() * 3);
	        return options[randomIndex];
	    }

	    public void playGame(String myChoice) {
	        String opponentChoice = getRandom();
	        System.out.println("自分の手は" + choices.get(myChoice) + ", 対戦相手の手は" + choices.get(opponentChoice));

	        if (myChoice.equals(opponentChoice)) {
	            System.out.println("あいこです");
	        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
	                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
	                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
	            System.out.println("自分の勝ちです");
	        } else {
	            System.out.println("自分の負けです");
	        }
	    }
}
