/* type ini masih belum selesai, masih 
banyak yang harus gw tambahin biar typenya gak aneh */
package b11.world.blocks.power;
import mindustry.world.blocks.power.*;
import arc.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.ui.*;
import mindustry.world.meta.*;
import mindustry.world.draw.*;
public class test extends PowerGenerator{
    /** The amount of power produced per tick in case of an efficiency of 1.0, which represents 100%. */
    public float powerProduction;
    public DrawBlock drawer = new DrawBlock(); //hm
    public Stat generationType = Stat.basePowerGeneration;
    public test(String name){
        super(name);
        sync = true;
        baseExplosiveness = 5f;
        flags = EnumSet.of(BlockFlag.generator);
    }
    @Override
    public void setStats(){
        super.setStats();
        stats.add(generationType, powerProduction * 60.0f, StatUnit.powerSecond);
    }
    @Override
    public void setBars(){
        super.setBars();

        if(hasPower && outputsPower && !consumes.hasPower()){
            bars.add("power", (GeneratorBuild entity) -> new Bar(() ->
            Core.bundle.format("bar.poweroutput",
            Strings.fixed(entity.getPowerProduction() * 60 * entity.timeScale(), 1)),
            () -> Pal.powerBar,
            () -> entity.productionEfficiency));
        }
    }

    @Override
    public boolean outputsItems(){
        return false;
    }

    public class testBuild extends GeneratorBuild{
        public float generateTime;
        /** The efficiency of the producer. An efficiency of 1.0 means 100% */
        public float productionEfficiency = 0.0f;

        @Override
        public float ambientVolume(){
            return Mathf.clamp(productionEfficiency);
        }

        @Override
        public float getPowerProduction(){
            return powerProduction * productionEfficiency;
        }

        @Override
        public byte version(){
            return 1;
        }

        @Override
        public void write(Writes write){
            super.write(write);
            write.f(productionEfficiency);
            write.f(generateTime);
        }

        @Override
        public void read(Reads read, byte revision){
            super.read(read, revision);
            productionEfficiency = read.f();
            if(revision >= 1){
                generateTime = read.f();
            }
        }
    }
}
