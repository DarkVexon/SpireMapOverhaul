package spireMapOverhaul.zones.serpent;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.UIStrings;
import spireMapOverhaul.BetterMapGenerator;
import spireMapOverhaul.abstracts.AbstractZone;

public class SerpentsVale extends AbstractZone {
    public static final String ID = "SerpentsVale";
    private static final UIStrings uiStrings = CardCrawlGame.languagePack.getUIString(ID);
    private static final String NAME = uiStrings.TEXT[0];

    private final int width, height;
    private static final Color COLOR = new Color(0.8F, 0, 0.6F, 1);

    private Serpent serpent;

    public SerpentsVale() {
        this(NAME, MathUtils.random(1, 4), MathUtils.random(2, 6));
    }

    @Override
    public AbstractZone copy() {
        return new SerpentsVale(name, width, height);
    }

    private SerpentsVale(String name, int width, int height) {
        super(ID);

        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public Color getColor() { //I considered changing this to a variable, but a method lets you do funky stuff like a rainbow zone that changes colors or something.
        return COLOR;
    }


}
