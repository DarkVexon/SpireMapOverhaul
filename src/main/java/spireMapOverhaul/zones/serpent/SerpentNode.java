package spireMapOverhaul.zones.serpent;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SerpentNode {
    public float x;
    public float y;
    public float timeUp = 1F;
    private Texture tex;

    public SerpentNode(Texture tex, float x, float y) {
        this.tex = tex;
        this.x = x;
        this.y = y;
    }

    public void render(SpriteBatch sb) {
        sb.draw(this.tex, x, y); //TODO: make it trasnparent as the duration go down!!!
    }

    public void update() {
        timeUp -= Gdx.graphics.getDeltaTime();
    }
}
