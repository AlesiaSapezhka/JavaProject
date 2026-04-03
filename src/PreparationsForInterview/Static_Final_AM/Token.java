package PreparationsForInterview.Static_Final_AM;

public class Token {
    //  У объекта должен быть строковый токен (например, "abcd1234"), который задаётся один раз в момент создания.
    // Токен нельзя изменить после присвоения, но можно получить.
    // Пояснение: реализуй неизменяемое поле с доступом только для чтения.
    private final String token;
    public Token(String token){
        this.token = token;
    }
    public String getToken(){
        return token;
    }
}
