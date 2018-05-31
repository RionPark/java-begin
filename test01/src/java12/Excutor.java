package java12;

public class Excutor {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		//로또번호 생성
		l.generateLottoNums();
		//생성된 로또번호를 출력
		l.printLottoNums();
		InputNumbers in = new InputNumbers();
		//사용자에게 로또번호를 입력
		in.inputLottoNums();
		// 사용자에게 입력받은 로또번호와 생성된 로또번호를 매칭
		in.macheLottoNums(l.lottoNums);
	}
}
