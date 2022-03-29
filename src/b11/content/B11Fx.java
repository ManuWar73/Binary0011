package b11.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.Block;
import b11.content.*;
import b11.*;
import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class B11Fx{
    public static final Effect
    craft = new Effect(30, e -> {
        stroke(2f * e.fout());
        color(Color.valueOf("eeeeee"));
        Lines.poly(e.x, e.y, 4, 5f + e.fin() * 12f);
    });
}
