package logic1;

public class AnswerCell {
	boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		boolean result = true;
		if (isAsleep) {
			result = false;
		} else if (isMorning) {
			result = isMom;
		}
		return result;
	}
}
