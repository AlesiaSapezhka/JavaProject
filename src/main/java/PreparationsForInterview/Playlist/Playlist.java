package PreparationsForInterview.Playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String playListName;
    List<Song> songList = new ArrayList<>();

    //Нужно реализовать систему, которая может:
    //добавить песню в плейлист

    public void addSong(Song song) {
        songList.add(song);
    }
    //удалить песню из плейлиста

    public void removeSong(Song song) {
        songList.remove(song);
    }

    public void removeSongByName(String songName) {
        for (Song song : songList) {
            if(song.getTitle().equals(songName)) {
                songList.remove(song);
            }
        }
    }

    public double durationPlaylistInHours(){
        double duration = 0;
        for (Song song: songList){
            duration += song.getDuration();
        }
        return duration;
    }

    //посчитать общую длительность плейлиста
    //показать все песни в плейлисте
    public void showPlaylist(){
        for (Song song: songList){
            System.out.println( song.getTitle() + song.getArtist());
        }
    }

    //
    //Правила:
    //общая длительность плейлиста считается как сумма длительностей всех песен
    //если песня удалена, она больше не участвует в расчете
    //
    //Пример:
    //В плейлисте есть песни:
    //Believer — Imagine Dragons — 204
    //Numb — Linkin Park — 185
    //Halo — Beyonce — 261
    //Общая длительность:
    //650 секунд"
}
