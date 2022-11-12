package lotto.domain;

import java.util.Objects;

public class LottoNumber {
    private static final int RANGE_BEGIN = 1;
    private static final int RANGE_END = 45;
    private final int number;

    public LottoNumber(int number) {
        validateRange(number);
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    private void validateRange(int number) {
        if (number < RANGE_BEGIN || number > RANGE_END) {
            throw new IllegalArgumentException("[ERROR] 1~45 범위 밖의 숫자가 포함되어 있습니다.");
        }
    }
}