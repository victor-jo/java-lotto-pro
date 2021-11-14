package lotto.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class LottoNumber {

    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;
    private static final String INVALID_BETWEEN_MIN_AND_MAX = "로또 번호는 1 ~ 45 중에서 골라주세요.";
    private static final Map<Integer, LottoNumber> LOTTO_NUMBERS = new HashMap<>();
    private final int number;

    static {
        IntStream.rangeClosed(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER)
                .forEach(i -> LOTTO_NUMBERS.put(i, new LottoNumber(i)));
    }

    private LottoNumber(int number) {
        this.number = number;
    }

    public static LottoNumber from(int number) {
        LottoNumber lottoNumber = LOTTO_NUMBERS.get(number);
        if (lottoNumber == null) {
            throw new IllegalArgumentException(INVALID_BETWEEN_MIN_AND_MAX);
        }
        return lottoNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}
