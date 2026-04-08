package hw.ch05;
// step 1: Synchronized Lazy(지연 초기화) 직접 구현
public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance = null;
    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy() {
        System.out.println("[SynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) {     // 처음 호출될 때만 객체 생성
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    // private void slowdown(){
    //     try {
    //         Thread.sleep(1000);
    //     } catch (InterruptedException e) {
    //     }
    // }   
    public void log(String message){
        logBuffer.append("[").append(System.currentTimeMillis())
            .append("]").append(message).append("\n");
            System.out.println("[LoggerSynchronizedLazy] " + message);
    }
    
    public String getLog(){
        return logBuffer.toString();
    }
}
