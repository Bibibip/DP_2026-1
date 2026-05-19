package practice.ch19;

public interface Context {
    public abstract void setClock(int hour);			// 시간 설정 
    
    public abstract void changeState(State state);		// 상태 변화 
                                    // State가 부모타입...어떤 State든 받을 수 있음! (주간/야간)
    public abstract void callSecurityCenter(String msg);	// 경비 센터 경비원 호출
    public abstract void recordLog(String msg);		// 경비 센터 기록 
}
