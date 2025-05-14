package defaultmethod.ex2;

import java.time.LocalDateTime;

public interface Notifier {
    // 알림을 보내는 기능
    void notify(String message);

    // 신규 기능 추가
    default void scheduleNotification(String message, LocalDateTime scheduleTime) {
        System.out.println("[기본 스케줄링] message: " + message + ", time: " + scheduleTime);
    }
}
