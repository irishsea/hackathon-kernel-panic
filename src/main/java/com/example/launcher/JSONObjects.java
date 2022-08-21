package com.example.launcher;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JSONObjects {

    public static class BlockStart {

        @SerializedName("x")
        @Expose
        private Integer x;
        @SerializedName("y")
        @Expose
        private Integer y;

        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

    }


    @SerializedName("blocks")
    @Expose
    private List<List<Integer>> blocks = null;
    @SerializedName("block_start")
    @Expose
    private BlockStart blockStart;
    @SerializedName("mood")
    @Expose
    private String mood;
    @SerializedName("breakable_all")
    @Expose
    private Boolean breakableAll;
    @SerializedName("agressive_mode")
    @Expose
    private Boolean agressiveMode;
    @SerializedName("super_ability")
    @Expose
    private String superAbility;

    public List<List<Integer>> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<List<Integer>> blocks) {
        this.blocks = blocks;
    }

    public BlockStart getBlockStart() {
        return blockStart;
    }

    public void setBlockStart(BlockStart blockStart) {
        this.blockStart = blockStart;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Boolean getBreakableAll() {
        return breakableAll;
    }

    public void setBreakableAll(Boolean breakableAll) {
        this.breakableAll = breakableAll;
    }

    public Boolean getAgressiveMode() {
        return agressiveMode;
    }

    public void setAgressiveMode(Boolean agressiveMode) {
        this.agressiveMode = agressiveMode;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

}
