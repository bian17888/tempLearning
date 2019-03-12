package sample16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by bian17888 on 2018/7/22.
 */
public class SongBasic {

    private ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new SongBasic().go();
    }

    public void getSongList() {
        ArrayList<String> songList = new ArrayList<String>();

        try {
            String filePath = System.getProperty("user.dir");
            File file = new File(filePath + "/src/sample16/SongList.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("/");
                songList.add(tokens[0]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.songList = songList;
    }

    public void go() {
        getSongList();
        System.out.println(songList);
    }

}
