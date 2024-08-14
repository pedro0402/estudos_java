package me.marcos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

	 public static void main(String[] args) {
	        try {
	            String content = new String(Files.readAllBytes(new File("C:\\Users\\pedro.souza\\eclipse-workspace\\me.marcos\\src\\main\\java\\me\\marcos\\tibia.json").toPath()));
	            JSONObject jsonObject = new JSONObject(content);

	            JSONObject worldsObject = jsonObject.getJSONObject("worlds");
	            
	            
	            JSONArray regularWorldsArray = worldsObject.getJSONArray("regular_worlds");
	            
	            
	            WorldData[] worldDataArray = new WorldData[regularWorldsArray.length()];
	            
	            for (int i = 0; i < regularWorldsArray.length(); i++) {
	                JSONObject worldObject = regularWorldsArray.getJSONObject(i);
	                int playersOnline = worldObject.getInt("players_online");
	                worldDataArray[i] = new WorldData(playersOnline);
	            }

	            
	            MergeSort mergeSort = new MergeSort();
	            mergeSort.mergeSort(worldDataArray, 0, worldDataArray.length - 1);
	            
	            for (WorldData data : worldDataArray) {
	                System.out.println( "Players Online: " + data.getPlayersOnline());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
