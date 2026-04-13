package PreparationsForInterview.Film;

import java.util.HashSet;
import java.util.Set;

public class FilmSeanse {

    private String filmTitle;
    private int placesCount;
    Set<Integer> bookedPlaces = new HashSet<Integer>();

    // "В системе есть сеанс.
    //
    //У сеанса есть:
    //название фильма
    //общее количество мест
    //список занятых мест
    //

    public void bookPlace(int seatNumber){
        if (seatNumber<=0 || seatNumber>placesCount) {
            System.out.println("Seat number " + seatNumber + " is already booked");
            return;
        }
        else if(!bookedPlaces.contains(seatNumber)){
            bookedPlaces.add(seatNumber);
        }
    }

    public void clearBooking(int seatNumber){
        if(bookedPlaces.contains(seatNumber)){
            bookedPlaces.remove(seatNumber);
        } else {
            System.out.println("Seat number " + seatNumber + " was not booked");
        }
    }

    public boolean ifSeatIsBooked(int seatNumber){
        return bookedPlaces.contains(seatNumber);
    }

    public int getFreePlacesCount(){
        return placesCount-bookedPlaces.size();
    }
    //Нужно реализовать систему, которая может:
    //забронировать место
    //отменить бронирование
    //проверить, занято ли место
    //показать количество свободных мест
    //
    //Правила:
    //одно место можно забронировать только один раз
    //если место уже занято, бронирование невозможно
    //при отмене бронирования место снова становится свободным
    //
    //Пример:
    //Бронируем места:
    //1
    //2
    //3
    //
    //Свободных мест:
    //7
    //
    //Отменяем бронирование места:
    //2
    //
    //Свободных мест:
    //8"
}
