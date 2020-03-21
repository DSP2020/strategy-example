import com.iteso.strategy.Ball;
import com.iteso.strategy.balls.AmericanFootballBall;
import com.iteso.strategy.balls.BaseballBall;
import com.iteso.strategy.balls.SoccerBall;
import com.iteso.strategy.behaviors.impl.IrregularIBounce;
import com.iteso.strategy.behaviors.impl.NewIrregularIBounce;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class JamaiconSportsBallModule {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();

        System.out.println(soccer.roll());
        soccer.setiBounceBehavior(new IrregularIBounce());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();

        System.out.println(american.roll());
        american.setiBounceBehavior(new NewIrregularIBounce());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());

    }
}
