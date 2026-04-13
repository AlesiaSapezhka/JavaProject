package PreparationsForInterview.Post;

import java.util.HashSet;
import java.util.Set;

public class Post {

    private int id;
    private String text;
    private Set<String> likes = new HashSet<String>();


    //Нужно реализовать систему, которая может:
    //поставить лайк посту
    //убрать лайк
    //посчитать количество лайков
    //проверить, поставил ли пользователь лайк
    //

    public void giveLike(String username) {
        likes.add(username);
    }

    public void removeLike(String username) {
        likes.remove(username);
    }

    public int countLikes() {
        return likes.size();
    }

    public boolean ifUserGaveLike(String username) {
        return likes.contains(username);
    }


    //Правила:
    //один пользователь может поставить только один лайк
    //повторный лайк не должен увеличивать количество лайков
    //пользователь может убрать свой лайк
    //
    //Пример:
    //Пользователь Alex ставит лайк посту.
    //Пользователь Maria ставит лайк посту.
    //
    //Количество лайков:
    //2
    //
    //Alex убирает лайк.
    //Количество лайков:
    //1"
}
