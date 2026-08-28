package oop1;

public class MusicPlayer {

    int volume;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨을 높입니다. volume = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨을 낮춥니다. volume = " + volume);
    }

    void showStatus() {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어를 종료합니다.");
        }

    }
}
