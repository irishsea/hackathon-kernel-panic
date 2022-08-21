package com.example.launcher;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class LevelGenerator {

    public static final ArrayList<Integer> easyBlocks = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    public static final ArrayList<Integer> mediumBlocks = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));
    public static final ArrayList<Integer> hardBlocks = new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16, 17));

    public static final HashMap<Integer, ArrayList<Integer>> difficultyMap =
            new HashMap<>(){{
                put(0, easyBlocks);
                put(1, mediumBlocks);
                put(2, hardBlocks);
            }};

    public static void createJson2(int difficultyLevel,
                                   int moodState,
                                   int ability,
                                   int availableTime,
                                   int drink,
                                   int gameType) throws IOException {
        Random rnd = new Random(System.nanoTime());
        int sizeX = rnd.nextInt((availableTime + 1) * 3) + 1 + availableTime;
        int sizeY = rnd.nextInt((availableTime + 1) * 2) + 1 + availableTime;
        if (drink == 1) {
            int i = sizeX;
            sizeX = sizeY;
            sizeY = i;
        }
        List<List<Integer>> blocks = new ArrayList<>();
        for (int i = 0; i < sizeY; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < sizeX; j++) {
                List<Integer> arr = difficultyMap.get(difficultyLevel);
                int num = arr.get(rnd.nextInt(arr.size()));
                if (rnd.nextInt(4) == 3) {
                    num = 0;
                }
                line.add(num);
            }
            blocks.add(line);
        }
        JSONObjects objs = new JSONObjects();
        objs.setBlocks(blocks);
        objs.setAgressiveMode(gameType == 0);
        objs.setBreakableAll(gameType == 1);
        objs.setSuperAbility(getAbilityMap().get(ability));
        objs.setMood(getMoodMap().get(moodState));
        JSONObjects.BlockStart start = new JSONObjects.BlockStart();
        int startX;
        int startY;
        do {
            startX = rnd.nextInt(sizeX);
            startY = rnd.nextInt(sizeY);
        } while (blocks.get(startY).get(startX) != 0);
        start.setX(startX);
        start.setY(startY);
        objs.setBlockStart(start);
        List<String> res = new ArrayList<>();
        res.add(new Gson().toJson(objs));
        Files.write(Paths.get("level.json"), res);
        Runtime.getRuntime().exec("./Im.Fox-The-Game.exe");
        System.exit(0);
    }

    private static HashMap<Integer, String> getAbilityMap() {
        return new HashMap<>() {{
            put(0, "superjump");
            put(1, "lazer_eyes");
            put(2, "jetpack");
            put(3, "megahealth");
        }};
    }

    private static HashMap<Integer, String> getMoodMap() {
        return new HashMap<>() {{
            put(0, "fear");
            put(1, "calmness");
            put(2, "inspiration");
            put(3, "anger");
        }};
    }
}




