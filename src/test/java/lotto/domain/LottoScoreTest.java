package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("로또 당첨 스코어에 대한 테스트")
class LottoScoreTest {

    @Test
    @DisplayName("스코어에 추가된 횟수만큼 개수에 맞는 당첨횟수가 저장되어야 한다")
    void lotto_score_test() {
        LottoScore lottoScore = new LottoScore();
        lottoScore.addScore(LottoWinnings.THREE);
        lottoScore.addScore(LottoWinnings.THREE);
        lottoScore.addScore(LottoWinnings.FOUR);

        int 당첨번호_3개_일치_횟수 = lottoScore.getLottoScoreMap().get(LottoWinnings.THREE);
        int 당첨번호_4개_일치_횟수 = lottoScore.getLottoScoreMap().get(LottoWinnings.FOUR);

        assertThat(당첨번호_3개_일치_횟수).isEqualTo(2);
        assertThat(당첨번호_4개_일치_횟수).isEqualTo(1);
    }

    @Test
    @DisplayName("전달받은 로또 스코어에 대해 스코어를 조작하려고 하면 예외가 발생해야 한다")
    void lotto_score_test2() {
        LottoScore lottoScore = new LottoScore();
        lottoScore.addScore(LottoWinnings.THREE);

        Map<LottoWinnings, Integer> 로또_스코어 = lottoScore.getLottoScoreMap();

        assertThatThrownBy(() -> {
            로또_스코어.put(LottoWinnings.ALL, 5);
        }).isInstanceOf(UnsupportedOperationException.class);
    }
}